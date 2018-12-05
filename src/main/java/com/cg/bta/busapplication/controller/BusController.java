package com.cg.bta.busapplication.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.bta.busapplication.exceptions.IDExistsException;
import com.cg.bta.busapplication.model.BusDetails;
import com.cg.bta.busapplication.service.IBusService;

@Controller
public class BusController {

	@Autowired
	IBusService busService;

	@RequestMapping("/")
	public String showBusDetailsPage(Model model) {
		String view = "AddBusDetails";
		model.addAttribute("busdetails", new BusDetails());
		return view;
	}

	@RequestMapping(value = "/details", method = RequestMethod.POST)
	public String AddBusDetails(Model model, @Valid @ModelAttribute("busdetails") BusDetails busDetails,
			BindingResult result) throws IDExistsException {

		String view = "";

		if (result.hasErrors()) {
			view = "AddBusDetails";
		} else {
			try {
				busService.addBusDetails(busDetails);
				model.addAttribute("busdetails", busDetails);
				view = "AddSuccess";
			} catch (Exception e) {
				throw new IDExistsException("ID already exists in DB");
			}
		}
		return view;
	}

	/*@ExceptionHandler(IDExistsException.class)
	public String showErrorMessage(IDExistsException exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		return "error";
	}*/
}
