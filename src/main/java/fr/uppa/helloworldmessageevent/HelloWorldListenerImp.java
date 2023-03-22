/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.uppa.helloworldmessageevent;

import fr.uppa.interfaces.HelloWorldEvent;
import fr.uppa.interfaces.HelloWorldListener;

/**
 *
 * @author ccombier
 */
public class HelloWorldListenerImp implements HelloWorldListener{

    @Override
    public void onHelloWorld(HelloWorldEvent event) {
        System.out.println(event.getMessage());
    }
    
    
}
