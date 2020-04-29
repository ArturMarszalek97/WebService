package webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import exception.InvalidInputException;
import rsi.HelloWorld;

public class WebServicesClient2 {
    
    public static void main(String[] args) throws MalformedURLException, InvalidInputException {
        URL url = new URL("http://localhost:9988/ws/hello?wsdl");
        QName qname = new QName("http://rsi/", "HelloWorldImplService");
        
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        
        String zapytanie = "To ja - KLIENT 2";
        String response = hello.getHelloWorldAsString(zapytanie);
        System.out.println("Klient wysłał: " + zapytanie);
        System.out.println("Klient otrzymał: " + response);
    }
}
