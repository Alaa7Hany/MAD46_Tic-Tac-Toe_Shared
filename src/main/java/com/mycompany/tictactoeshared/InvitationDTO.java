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
    
    private PlayerDTO fromUser;
    private PlayerDTO toUser;
      
    public InvitationDTO(PlayerDTO fromUser,PlayerDTO toUser){
        this.fromUser = fromUser;
        this.toUser = toUser;
    }
    
    public PlayerDTO getFromUsername() { return fromUser; }
    public PlayerDTO getToUsername()   { return toUser;   }
    
}