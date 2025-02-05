package com.tka.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.entity.Product;
import com.tka.service.ProductService;

@Controller
@RequestMapping("/product") // Secure the endpoint
public class ProductController {

	@Autowired
	private ProductService proservice;

	@GetMapping("/")
	public String home() {
	    return "index"; 
	}

	@GetMapping("/add")
	public String addProductForm(Model model) {
		model.addAttribute("product", new Product());
		return "add";
	}

	@PostMapping("/insert")
	public String insertProduct(@Valid @ModelAttribute Product product, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("error", "Invalid input data!");
			return "add";
		}
		String msg = proservice.addProduct(product);
		model.addAttribute("message", msg);
		return "redirect:/product/display";
	}

	@GetMapping("/display")
	public String displayProduct(Model model) {
		List<Product> plist = proservice.displayProduct();
		model.addAttribute("products", plist);
		return "display";
	}

	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("pid") int pk) {
		proservice.deleteProduct(pk);
		return "redirect:/product/display";
	}

	@GetMapping("/view")
	public String viewProduct(@RequestParam("pid") int pk, Model model) {
		Product product = proservice.getProduct(pk);
		model.addAttribute("product", product);
		return "update";
	}

	@PostMapping("/update")
	public String updateProduct(@Valid @ModelAttribute Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "update";
		}
		proservice.updateProduct(product);
		return "redirect:/product/display";
	}
}
