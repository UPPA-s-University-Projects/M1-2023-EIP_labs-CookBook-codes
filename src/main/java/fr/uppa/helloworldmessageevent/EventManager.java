/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.uppa.helloworldmessageevent;

import fr.uppa.interfaces.HelloWorldEvent;
import fr.uppa.interfaces.HelloWorldListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ccombier
 */
public class EventManager {
    private List<HelloWorldListener> listeners = new ArrayList<>();
    
    public void addListener(HelloWorldListener listener){
        listeners.add(listener);
    }
    
    public void removeListener(HelloWorldListener listener){
        listeners.remove(listener);
    }
    
    public void triggerrEvent(HelloWorldEvent event){
        for(HelloWorldListener listener : listeners){
            listener.onHelloWorld(event);
        }
    }
}
