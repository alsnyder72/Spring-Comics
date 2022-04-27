package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dmacc.beans.Comic;
import dmacc.beans.Customer;
import dmacc.repository.ComicsRepository;
import dmacc.repository.CustomerRepository;

@Controller
public class WebController {
	@Autowired
	ComicsRepository comicRepo;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@GetMapping({"/", "viewAllComics"})
	public String viewAllComics(Model model) {
		if(comicRepo.findAll().isEmpty()) {
			return addNewComic(model);
			}
		
		model.addAttribute("comics", comicRepo.findAll());
		return "comicResults";
	}
	
	@GetMapping({"/", "viewAllCustomers"})
	public String viewAllCustomers(Model model) {
		if(customerRepo.findAll().isEmpty()) {
			return addNewCustomer(model);
			}
		
		model.addAttribute("customer", customerRepo.findAll());
		return "customerResults";
	}
	
	@GetMapping("/inputCustomer")
	public String addNewCustomer(Model model) {
		Customer cu = new Customer();
		model.addAttribute("newCustomer", cu);
		return "inputCustomer";
	}
	
	@GetMapping("/inputComic")
	public String addNewComic(Model model) {
		Comic co = new Comic();
		model.addAttribute("newComic", co);
		return "inputComic";
	}
	
	@PostMapping("/inputCustomer")
	public String addNewCustomer(@ModelAttribute Customer cu, Model model) {
		customerRepo.save(cu);
		return viewAllCustomers(model);
	}
	
	@PostMapping("/inputComics")
	public String addNewComic(@ModelAttribute Comic co, Model model) {
		comicRepo.save(co);
		return viewAllComics(model);
	}
	
	@GetMapping("/edit/{comicId}")
	public String showUpdateComic(@PathVariable("comicId") long id, Model model) {
		Comic co = comicRepo.findById(id).orElse(null);
		model.addAttribute("newContact", co);
		return "inputComic";
	}
	
	@GetMapping("/edit/{custId}")
	public String showUpdateContact(@PathVariable("custId") long id, Model model) {
		Customer cu = customerRepo.findById(id).orElse(null);
		model.addAttribute("newCustomer", cu);
		return "inputCustomer";
	}
	
	@PostMapping("/update/{comicId}")
	public String reviseComic(Comic co, Model model) {
		comicRepo.save(co);
		return viewAllComics(model);
	}
	
	@PostMapping("/update/{custId}")
	public String reviseCustomer(Customer cu, Model model) {
		customerRepo.save(cu);
		return viewAllCustomers(model);
	}
	
	@GetMapping("/delete/{ComicId}")
	public String deleteComic(@PathVariable("comicId") long id, Model model) {
		Comic co = comicRepo.findById(id).orElse(null);
		comicRepo.delete(co);
		return viewAllComics(model);
	}
	
	@GetMapping("/delete/{custId}")
	public String deleteCustomer(@PathVariable("custId") long id, Model model) {
		Customer cu = customerRepo.findById(id).orElse(null);
		customerRepo.delete(cu);
		return viewAllCustomers(model);
	}
	
	
	
}
