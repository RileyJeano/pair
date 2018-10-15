package org.wecancodeit.pairs.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.pairs.repository.StudentRepository;

@Controller
public class StudentController {

	@Resource
	private StudentRepository repo = new StudentRepository();

	@GetMapping("/hippo")
	public String getIndex(Model model) {
		model.addAttribute("pair1", repo.getPair1());
		model.addAttribute("pair2", repo.getPair2());
		model.addAttribute("pair3", repo.getPair3());
		model.addAttribute("pair4", repo.getPair4());
		model.addAttribute("pair5", repo.getPair5());
		model.addAttribute("pair6", repo.getPair6());
		model.addAttribute("pair7", repo.getPair7());
		model.addAttribute("bird", ">-B>");
		return "hippo";
	}

}
