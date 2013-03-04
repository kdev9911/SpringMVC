package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/movie")
public class MovieController {

	private static final String[] abc = null;

	@Produces
	@RequestMapping("/{what}/{is}/{name}", method = RequestMethod.GET)
	public @ResponseBody  postMovie(@PathParam String[] abc,@PathVariable String what,@PathVariable String is,@PathVariable String name, ModelMap model) {

		model.addAttribute("movie", "This is the Name - " +what);
		model.addAttribute("is", "This is the Name - " +is);
		model.addAttribute("Name", "This is the Name - " +name);
		return "list";

	}
	
}