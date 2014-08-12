package com.tribal.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.tribal.test.domain.Project;
import com.tribal.test.enums.ProjectPhaseEnum;
import com.tribal.test.service.ProjectService;

/**
 * Web controller for all Project related operations.
 * 
 * @author thomash
 */
@Controller
@RequestMapping("/project")
@SessionAttributes("project")
public class ProjectController {

	private Log log = LogFactory.getLog(ProjectController.class.getSimpleName());

	@Autowired
	private ProjectService projectService;

	@RequestMapping("/list")
	public ModelAndView readAll() {
		log.info("list request");
		ModelAndView mv = new ModelAndView();
		mv.addObject("projectList", projectService.readAll());
		return mv;
	}

	@ModelAttribute("phaseList")
	private ProjectPhaseEnum[] phase() {
		return ProjectPhaseEnum.values();
	}

	/**
	 * Shows a view to modify or create a new project record
	 * @param projectId
	 * @return
	 */
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public ModelAndView projectView(@RequestParam(value = "id", required=false) Integer projectId) {
		log.info("projectsView request");
		ModelAndView mv = new ModelAndView();
		if (projectId != null) {
			mv.addObject("project", projectService.read(projectId));
		} else {
			mv.addObject("project", new Project());
		}
		return mv;
	}
	
	@RequestMapping(value="/view", method=RequestMethod.POST)
	public String projectSave(@Valid Project project, BindingResult bindingResult) {
		log.info("projectsSave request");
		if (bindingResult.hasErrors()) {
			log.info("Form has errors");
			return "project/view";
		} else {
			//Check if we are updating or creating if id exists
			if (project.getId() > 0) {
				projectService.update(project);
			} else {
				project.setId(projectService.create(project));
			}
			//Return to the list page
			return "redirect:/project/list";
		}
	}
	
	@RequestMapping(value="/delete")
	public String projectDelete(@RequestParam(value = "id") int id) {
		log.info("projectDelete request");
		projectService.delete(id);
		//Return to the list page
		return "redirect:/project/list";
	}
	
}
