package com.star.agile.assignment.springbootdemokub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {

@RequestMapping(value = "/", method = RequestMethod.GET)
		public String index() {
		    return "index";
		}

		@RequestMapping(value = "/Kubernetes", method = RequestMethod.GET)
		public String anotherIndex() {
		    return "world";
		}
		
	}

