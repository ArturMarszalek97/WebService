package rsi;

import exception.InvalidInputException;

import javax.jws.WebService;

@WebService(endpointInterface = "rsi.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) throws InvalidInputException {
        String response = "Invalid property";
        if("Artur".equals(name)){
            response = "Witaj świecie JAX-WS: " + name;
        }
        else{
            throw new InvalidInputException("Invalid Input", name + " is not a valid input");
        }
        return response;
    }
}
