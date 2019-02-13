/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cigist.spring.core.model;

import com.cigist.spring.core.interfaces.HelloIntface;

/**
 *
 * @author Irwan Cigist <cigist.developer@gmail.com>
 */
public class HelloWorld implements HelloIntface {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    private String message;

    @Override
    public void printMessage() {
       System.out.println("Print Message : "+message);
    }
    
}
