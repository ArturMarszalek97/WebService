package webservices;

import javax.xml.ws.Endpoint;
import rsi.HelloWorld;
import rsi.HelloWorldImpl;
import rsi.HelloWorldImplService;


public class HelloWorldPublisher {
    
    public static void main(String[] rags){
        Endpoint.publish("http://localhost:9988/ws/hello", new HelloWorldImpl());
        System.out.println("Web serwis czeka na klienta...");
    }
}
