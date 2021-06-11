package br.com.designpattern.mhrs.comportamentais.templatemethod;

import br.com.designpattern.mhrs.comportamentais.templatemethod.model.UserModel;
import lombok.extern.slf4j.Slf4j;

/**
 * - Template Method - Definir o esqueleto de um algoritmo dentro de uma operação, deixando alguns passos a serem preenchidos pelas subclasses.
 * Template Method permiste que suas subclasses redefinam certos passos de um algoritmo sem mudar sua estrutura.
 * */
@Slf4j
public class TemplateMethodClient {

	public static void main(String[] args) {
		UserModel user = new UserModel("user", "passwd");
		user.save();
		
		log.info("---------");
		
		UserModel invalidUser = new UserModel(null, null);
		invalidUser.save();
	}
	
}
