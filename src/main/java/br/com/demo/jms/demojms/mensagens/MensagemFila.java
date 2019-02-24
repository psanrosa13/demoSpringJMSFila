package br.com.demo.jms.demojms.mensagens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MensagemFila {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void enviaMensagemFila(String mensagem) {
		jmsTemplate.convertAndSend("fila.teste", mensagem);
	}
	
	@JmsListener(destination = "fila.teste")
	public void consumirMensagemFila(String mensagem) {
		System.out.println( mensagem );
	}
}
