package br.com.designpattern.mhrs.comportamentais.chain.services;

import br.com.designpattern.mhrs.comportamentais.chain.steps.ProcessStep;

public class GenericService {
	private GenericService() {
		//
	}
	
	public static Object run(ProcessStep startProcess, ProcessContext initialContext) {
		try {
			ProcessContext result = startProcess.execute(initialContext);
			return result.getProcessResult();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}
