package com.alliah.exceptions;
//Checked -> Exception
//Unchecked -> Runtime exception

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Insufficient funds of your account");
    }
    public InsufficientFundsException(String message){
        super(message);
    }


}
