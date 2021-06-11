package br.com.designpattern.mhrs.comportamentais.chain.steps;

import java.util.HashMap;
import java.util.Map;

import br.com.designpattern.mhrs.comportamentais.chain.repository.UserRepository;
import br.com.designpattern.mhrs.comportamentais.chain.services.ProcessContext;

public class SaveUser extends ProcessStep {
	
	public SaveUser(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Map<String, Object> userInput = new HashMap<>();
		userInput.put("name", context.get("name"));
		userInput.put("email", context.get("email"));
		userInput.put("password", context.get("password"));
		UserRepository.getInstance().saveUser(userInput);
		return next(context, String.format("User '%s' saved!", userInput.get("name")));
	}

}
