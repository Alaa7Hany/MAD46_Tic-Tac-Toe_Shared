/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoeshared;
import java.io.Serializable;
/**
 *
 * @author siam
 */


public class StartGameDTO implements Serializable {
    public String sessionID;
    public String symbol;

    public StartGameDTO(String sessionID, String symbol) {
        this.sessionID = sessionID;
        this.symbol = symbol;
    }
}
