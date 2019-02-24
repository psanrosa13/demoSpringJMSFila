package br.com.demo.jms.demojms.mensagens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensagemController {

	@Autowired
	private MensagemFila mensagemFila;
	
		@PostMapping("/fila/mensagem")
    public void mensagemTopico(@RequestBody String mensagem) {
			mensagemFila.enviaMensagemFila(mensagem);
    }
}
