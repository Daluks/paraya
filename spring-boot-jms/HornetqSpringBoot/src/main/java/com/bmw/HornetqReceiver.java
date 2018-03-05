/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmw;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author Lukisi Motsoeneng
 */
@Component
public class HornetqReceiver
{
    @JmsListener(destination = "OrdersQueue")
    public void receiveMessage()
    {
        System.out.println("Test");
    }
}
