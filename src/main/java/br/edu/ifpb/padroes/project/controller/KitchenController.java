package br.edu.ifpb.padroes.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.padroes.project.creational.Device;
import br.edu.ifpb.padroes.project.creational.KitchenFactory;
import br.edu.ifpb.padroes.project.creational.RoomFactory;

@Controller
@RequestMapping("/kitchen")
public class KitchenController {
	
	@RequestMapping
	public ModelAndView list(String nome) {
		ModelAndView model = new ModelAndView("index");
		RoomFactory room1 = new KitchenFactory();
		Device device1 = room1.createDevice();
		device1.toggle();
		model.addObject("room", "Kitchen");
		model.addObject("device", device1);
		return model;
	}

}
