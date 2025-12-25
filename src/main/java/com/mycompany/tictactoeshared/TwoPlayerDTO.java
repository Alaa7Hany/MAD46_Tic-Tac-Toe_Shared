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
public class TwoPlayerDTO implements Serializable{
  private PlayerDTO primary ;
  private PlayerDTO secondry ;

    public TwoPlayerDTO(PlayerDTO primary, PlayerDTO secondry) {
        this.primary = primary;
        this.secondry = secondry;
    }


    public PlayerDTO getPrimary() {
        return primary;
    }

    public PlayerDTO getSecondry() {
        return secondry;
    }
  
  
}
