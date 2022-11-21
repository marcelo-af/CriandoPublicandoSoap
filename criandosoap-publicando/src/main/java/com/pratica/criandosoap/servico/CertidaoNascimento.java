package com.pratica.criandosoap.servico;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

//SEI - SERVICE ENDPOINT INTERFACE
@WebService //indica que a interface sera de serviço
@SOAPBinding (style = Style.RPC)  //indica que ira trabalhar com dados do tipo primitivo
public interface CertidaoNascimento {
	
	@WebMethod //indica que sao operacoes de servicos
	public int calcularIdade(String idade);
	
	@WebMethod
	public String diaSemanaNascimento(String idade);

}
