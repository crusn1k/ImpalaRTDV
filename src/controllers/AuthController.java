package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import model.LoginModel;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

	@ModelAttribute("model")
	public LoginModel getModel() {
		return new LoginModel();
	}

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("model") LoginModel model, BindingResult result, HttpServletRequest request, HttpServletResponse response){
		if(result.hasErrors()){
			return "login";
		}
		String userId = model.getUserName();
		String pass = model.getPassword();
		Authentication auth = new UsernamePasswordAuthenticationToken(userId, pass, AuthorityUtils.createAuthorityList("ROLE_ADMIN"));
		SecurityContextHolder.getContext().setAuthentication(auth);		
		return "redirect:home";
	}
}