package com.cg.bta.busapplication.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DemoException {

	@ExceptionHandler(value = { Exception.class })
	public String handleConflict(Model model, Exception ex, HttpServletRequest req) {
		String bodyOfResponse = ex.getMessage();
		String uri = req.getRequestURL().toString();

		ErrorInfo errorInfo = new ErrorInfo(uri, bodyOfResponse);
		model.addAttribute("errorInfo", errorInfo);
		return "error";
	}
}
