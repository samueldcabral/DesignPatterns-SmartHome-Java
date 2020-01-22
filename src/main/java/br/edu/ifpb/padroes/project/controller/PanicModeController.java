package br.edu.ifpb.padroes.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.padroes.project.behavioral.PanicMode;
import br.edu.ifpb.padroes.project.creational.Device;
import br.edu.ifpb.padroes.project.creational.KitchenFactory;
import br.edu.ifpb.padroes.project.creational.RoomFactory;

@Controller
@RequestMapping("/panic")
public class PanicModeController {

	@RequestMapping
	public ModelAndView list(String nome) {
		ModelAndView model = new ModelAndView("panic");
		
		PanicMode panic = new PanicMode();
		panic.activatePanicMode();
		panic.deactivatePanicMode();
		model.addObject("room", "Panic");
	
		return model;
	}
}
