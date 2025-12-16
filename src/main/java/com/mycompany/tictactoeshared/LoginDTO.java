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
public class LoginDTO implements Serializable {
    private String username;
    private String password;

    public LoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}