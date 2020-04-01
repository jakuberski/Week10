package store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import store.beans.Address;
import store.beans.Store;
import store.repository.StoreRepository;

@Controller
public class WebController {
	
	@Autowired
	StoreRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllStore(Model model) {
		model.addAttribute("store", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputStore")
	public String addNewStore(Model model) {
		Store c = new Store();
		model.addAttribute("newStore", c);
		return "input";
	}
	
	@PostMapping("/inputStore")
	public String addNewStore(@ModelAttribute Store c, Model model) {
		repo.save(c);
		return viewAllStore(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateStore(@PathVariable("id") long id, Model model) {
		Store c = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + c.toString());
		model.addAttribute("newStore", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseStore(Store c, Model model) {
		repo.save(c);
		return viewAllStore(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStore(@PathVariable("id") long id, Model model) {
		Store c = repo.findById(id).orElse(null);
	    repo.delete(c);
	    return viewAllStore(model);
	}

	public WebController() {
		// TODO Auto-generated constructor stub
	}

}
