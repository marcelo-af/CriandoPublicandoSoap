package com.pratica.criandosoap;

import com.pratica.criandosoap.servico.CertidaoNascimentoImpl;

import jakarta.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    //Disponibiliza a publicação do serviço 
    	
    	CertidaoNascimentoImpl certidaoNascimento = new CertidaoNascimentoImpl();
    	Endpoint.publish("http://localhost:8081/servico/certidao", certidaoNascimento);
    	System.out.println("Serviço wsdl publicado com sucesso. É toop ;) ");
    }
}
