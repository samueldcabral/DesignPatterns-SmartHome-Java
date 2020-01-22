package br.edu.ifpb.padroes.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.padroes.project.creational.Device;
import br.edu.ifpb.padroes.project.creational.LivingRoomFactory;
import br.edu.ifpb.padroes.project.creational.RoomFactory;
import br.edu.ifpb.padroes.project.structural.KitchenDecorator;
import br.edu.ifpb.padroes.project.structural.LivingRoomDecorator;
import br.edu.ifpb.padroes.project.structural.Party;
import br.edu.ifpb.padroes.project.structural.SpecialScenario;

@Controller
@RequestMapping("/party")
public class PartyController {

	@RequestMapping
	public ModelAndView list(String nome) {
		ModelAndView model = new ModelAndView("PartyMode");
		
		SpecialScenario party = new Party();
		party = new LivingRoomDecorator(party);
		party = new KitchenDecorator(party);
		party.getNome();
		party.turnOff();
		
		
//		device1.toggle();
		model.addObject("room", "Party Mode");
//		model.addObject("device", device1);
		return model;
	}
}
