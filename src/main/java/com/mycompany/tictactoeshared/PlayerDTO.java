/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoeshared;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class PlayerDTO implements Serializable {
    private String username;
    private int score;
    private boolean isOnline;

    public PlayerDTO(String username, int score, boolean isOnline) {
        this.username = username;
        this.score = score;
        this.isOnline = isOnline;
    }

    public String getUsername() {
        return username;
    }

    public int getScore() {
        return score;
    }

    public boolean isOnline() {
        return isOnline;
    }
    
}