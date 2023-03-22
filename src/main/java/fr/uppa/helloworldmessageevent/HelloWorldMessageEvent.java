/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.uppa.helloworldmessageevent;

import fr.uppa.interfaces.HelloWorldEvent;
import fr.uppa.interfaces.HelloWorldListener;

/**
 *
 * @author ccombier
 */
public class HelloWorldMessageEvent {

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        HelloWorldListener listener = new HelloWorldListenerImp();
        eventManager.addListener(listener);
        
        HelloWorldEvent event = new HelloWorldEventImp("Hello, world!");
        eventManager.triggerrEvent(event);
        
        eventManager.removeListener(listener);
    }
}
