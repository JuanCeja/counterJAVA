package com.juan.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
			System.out.println(currentCount);
		}
		
		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("count", currentCount);
		return "counter.jsp";
	}

	@RequestMapping("/counter2")
	public String counter2(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount++;
			currentCount++;
			session.setAttribute("count", currentCount);
			System.out.println(currentCount);
		}
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("count", currentCount);
		return "counter2.jsp";
	}
}
