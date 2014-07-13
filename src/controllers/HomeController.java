package controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Secured(value = { "ROLE_ADMIN" })
@Controller
public class HomeController {

	@RequestMapping(value={"/", "/home"}, method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name", SecurityContextHolder.getContext().getAuthentication().getName());
		return "home";
	}
}