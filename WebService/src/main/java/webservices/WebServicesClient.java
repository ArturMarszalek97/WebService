package webservices;

import exception.InvalidInputException;
import rsi.HelloWorld;
import rsi.HelloWorldImplService;

public class WebServicesClient {
    
    public static void main(String[] args) throws InvalidInputException {
        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();
        
        String zapytanie = "aaaa";
        String response = hello.getHelloWorldAsString(zapytanie);
        System.out.println("Klient wysłał: " + zapytanie);
        System.out.println("Klient otrzymał: " + response);
    }
}
