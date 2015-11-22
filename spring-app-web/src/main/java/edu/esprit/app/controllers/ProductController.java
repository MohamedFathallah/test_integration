package edu.esprit.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.esprit.app.service.IProductServices;

@Controller
public class ProductController {

	@Autowired
	IProductServices ProductServises;

	@RequestMapping
	public String loadehomepage(Model model) {
		model.addAttribute("products", ProductServises.getAllProducts());

		return "home";
	}
}
