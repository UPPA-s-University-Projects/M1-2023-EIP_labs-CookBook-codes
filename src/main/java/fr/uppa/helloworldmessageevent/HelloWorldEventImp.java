/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.uppa.helloworldmessageevent;

import fr.uppa.interfaces.HelloWorldEvent;

/**
 *
 * @author ccombier
 */
public class HelloWorldEventImp implements HelloWorldEvent{
    private String message;
    
    public HelloWorldEventImp(String message){
        this.message = message;
    }
    
    public String getMessage(){
        return message;
    }
}
