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
public class MoveDTO implements Serializable {
    private int cellNo;
    private String symbol;

    public MoveDTO(int cellNo, String symbol) {
        this.cellNo = cellNo;
        this.symbol = symbol;
    }

    public int getCellNo() {
        return cellNo;
    }

    public String getSymbol() {
        return symbol;
    }
    
}