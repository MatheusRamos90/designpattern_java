package br.com.designpattern.mhrs.comportamentais.chain.steps;

import br.com.designpattern.mhrs.comportamentais.chain.services.ProcessContext;

public abstract class ProcessStep {
	protected ProcessStep nextStep;
	protected Object[] args;
	
	ProcessStep(Object... args) {
		this.args = args;
	}

	public abstract ProcessContext execute(ProcessContext context) throws Exception;
	
	public void setNextStep(ProcessStep next) {
		this.nextStep = next;
	}
	
	protected ProcessContext next(ProcessContext context, Object actualResult) throws Exception {
		context.addProcessResult(actualResult);
		return this.nextStep != null ? nextStep.execute(context) : context;
	}
}
