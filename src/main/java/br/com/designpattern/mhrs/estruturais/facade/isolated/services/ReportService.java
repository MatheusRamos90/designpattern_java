package br.com.designpattern.mhrs.estruturais.facade.isolated.services;

import java.util.List;

import br.com.designpattern.mhrs.estruturais.facade.isolated.model.Card;
import br.com.designpattern.mhrs.estruturais.facade.isolated.model.Register;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReportService {
	private RegisterService registerService;
	
	public ReportService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getSumary(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		for(Register reg: registers) {
			log.info(String.format("%s\t%.2f\t%s", 
					reg.getStoreName(),
					reg.getValue(),
					reg.getDate().toString()
					));
		}
	}
	
}
