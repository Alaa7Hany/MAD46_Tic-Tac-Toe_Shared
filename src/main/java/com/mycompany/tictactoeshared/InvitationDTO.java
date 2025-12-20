/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoeshared;

/**
 *
 * @author emada
 */
import java.io.Serializable;

public class InvitationDTO implements Serializable {
    
    private String fromUsername;
    private String toUsername;
    private int score;

    public InvitationDTO(String fromUsername, String toUsername,int score) {
        this.fromUsername = fromUsername;
        this.toUsername = toUsername;
        this.score = score;
    }

    public String getFromUsername() { return fromUsername; }
    public String getToUsername()   { return toUsername;   }
    public int getScore()   { return score;   }
    
}