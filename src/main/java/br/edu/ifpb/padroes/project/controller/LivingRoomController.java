package br.edu.ifpb.padroes.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.padroes.project.creational.Device;
import br.edu.ifpb.padroes.project.creational.LivingRoomFactory;
import br.edu.ifpb.padroes.project.creational.RoomFactory;

@Controller
@RequestMapping("/living")
public class LivingRoomController {
	
	@RequestMapping
	public ModelAndView list(String nome) {
		ModelAndView model = new ModelAndView("LivingRoom");
		RoomFactory room1 = new LivingRoomFactory();
		Device device1 = room1.createDevice();
//		device1.toggle();
		model.addObject("room", "Living Room");
		model.addObject("device", device1);
		return model;
	}
}
