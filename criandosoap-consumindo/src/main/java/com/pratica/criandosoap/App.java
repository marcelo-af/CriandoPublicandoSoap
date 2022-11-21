package com.pratica.criandosoap;

import java.net.URL;

import javax.xml.namespace.QName;

import com.pratica.criandosoap.servicocons.CertidaoNascimento;

import jakarta.xml.ws.Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception 
    {

    /*Para consumir o wsdl primeiro é necessário publica-lo isso está no código 
    	criandosoap-publicando*/
    	
    //cria um objeto url onde especifica o caminho do wsdl	
    URL url = new URL("http://localhost:8081/servico/certidao?wsdl"); 
    
    /*O QName informa qual é o targetName(targetNamespace="http://servico.criandosoap.pratica.com/")
     * O QName tbm informa qual é o serviço(name="CertidaoNascimentoImplService") 
     * */
    QName qname = new QName("http://servico.criandosoap.pratica.com/", "CertidaoNascimentoImplService" );
    
    /*O service pega a url e o qname para poder se conectar com o serviço*/
    Service service = Service.create(url, qname);
    
    /*O service.getPort cria um proxy na aplicacao*/
    CertidaoNascimento certidao = service.getPort(CertidaoNascimento.class);
    
    int idade = certidao.calcularIdade("10/10/1990");
    String diaSemana = certidao.diaSemanaNascimento("10/10/1990");
    
    System.out.println("Idade: " + idade);
    System.out.println("Dia da semana: " +  diaSemana);
    	
    }
}
