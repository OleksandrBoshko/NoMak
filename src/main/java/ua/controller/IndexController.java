package ua.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.ComentService;

@Controller
public class IndexController {

	private List<Person> list = new ArrayList<Person>();
	
	@Autowired 
	private ComentService user;

	@RequestMapping("/")
	public String indexView(Model model) {
		user.toString();
		model.addAttribute("persons", list);
		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String indexPost(@RequestParam(value="age") int age,
			@RequestParam String username, @RequestParam String realname, @RequestParam String email, @RequestParam String password) {
		list.add(new Person(age, username, realname, email, password));
		return "redirect:/";
	}
	
	@RequestMapping("/{id}")
	public String delete(@PathVariable int id){
		list.remove(id);
		return "redirect:/";
	}
}
