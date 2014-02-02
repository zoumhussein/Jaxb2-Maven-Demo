package fr.zoumanatraore.restdemo.controller;

/**
 * @author Zoumana TRAORE
 * 
 */


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import fr.zoumanatraore.restdemo.model.Item;

/**
 * Handles requests for the application home page.
 */
@Controller
public class WebServiceController {

	private static final Logger log = LoggerFactory
			.getLogger(WebServiceController.class);

	/**
	 * Webservice test with mock object
	 * 
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/rest/test.{type}")
	@ResponseBody
	public Object test(@PathVariable String type, Model model, HttpServletRequest request, HttpServletResponse response) 
	{

		Item objMock = new Item(0, "GAZ", "Butane");
		if(type.equalsIgnoreCase("xml"))
			return objMock;
		else
			return new ModelAndView("jsonView", "object", objMock);
	}
}
