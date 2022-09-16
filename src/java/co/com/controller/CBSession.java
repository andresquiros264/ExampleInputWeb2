/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.controller;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Felipe Quiros
 */
@Named(value = "cBSession")
@RequestScoped
public class CBSession {

    /**
     * Creates a new instance of CBSession
     */
    public CBSession() {
    }
    
}
