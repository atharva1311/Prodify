package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.entity.Product;
import com.tka.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService proservice;
	
	@GetMapping("/")
	public String home() {
	    return "index"; 
	}
	@GetMapping("/addproduct")
	public String addProduct()
	{
		
		return "add";
	}
	
	@PostMapping("/insert-product")
	public String insertProduct(@ModelAttribute Product product)
	{
		System.err.println("We are in post method");
		System.out.println(product);
		String msg = proservice.addProduct(product);
		System.out.println(msg);
		return "add";
	}
	
	@GetMapping("/display-product")
	public String displayProduct(Model model)
	{
		List<Product> plist =proservice.displayProduct();
//		System.out.println(plist);
		model.addAttribute("products",plist);
		return "display";
	}
	
	@GetMapping("/delete-product")
	public String deleteProduct(@RequestParam("pid") int pk)
	{
		String res = proservice.deleteProduct(pk);
//		System.out.println(res);
		return "redirect:/display-product";
	}
	
	@GetMapping("/view-product")
	public String viewProduct(@RequestParam("pid") int pk,Model model)
	{
		Product product = proservice.getProduct(pk);
		model.addAttribute("p",product);
		return "update";
	}
	
	@PostMapping("/update-product")
	public String updateProduct(@ModelAttribute Product product)
	{
		String msg=proservice.updateProduct(product);
		return "redirect:/display-product";
	}
	
}
