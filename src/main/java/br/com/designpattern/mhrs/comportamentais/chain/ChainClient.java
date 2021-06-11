package br.com.designpattern.mhrs.comportamentais.chain;

import br.com.designpattern.mhrs.comportamentais.chain.services.GenericService;
import br.com.designpattern.mhrs.comportamentais.chain.services.ProcessContext;
import br.com.designpattern.mhrs.comportamentais.chain.services.ServicesCatalog;

import lombok.extern.slf4j.Slf4j;

/**
 * - Chain of Responsability - Evita acoplar o remetente de uma requisi��o ao seu destinat�rio ao dar a mais de um objeto a chance de servir a requisi��o.
 *	Comp�e os objetos em cascata e passa a requisi��o pela corrente at� que um objeto a sirva.
*/
@Slf4j
public class ChainClient {

	public static void main(String[] args) {
		ProcessContext ctx = new ProcessContext();
		ctx.put("email", "anotherUser@email.com");
		ctx.put("password", "1234");
		ctx.put("name", "Another User");
		Object response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		log.info(response.toString());
		
		ctx.reset();
		ctx.put("email", "anotherUser@email.com");
		ctx.put("password", "1234");
//		ctx.put("name", "Another User");
		response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		log.info(response.toString());
	}
	
}
