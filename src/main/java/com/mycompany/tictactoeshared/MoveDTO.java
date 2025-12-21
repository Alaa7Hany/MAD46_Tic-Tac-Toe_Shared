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
    private boolean win;
    private boolean draw;

    public MoveDTO(int cellNo, String symbol, boolean win, boolean draw) {
        this.cellNo = cellNo;
        this.symbol = symbol;
        this.win = win;
        this.draw = draw;
    }

    public int getCellNo() {
        return cellNo;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isWin() {
        return win;
    }

    public boolean isDraw() {
        return draw;
    }

}
