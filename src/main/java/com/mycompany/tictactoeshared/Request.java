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
public class Request implements Serializable {
    private RequestType type;
    private Object data; 

    public Request(RequestType type, Object data) {
        this.type = type;
        this.data = data;
    }

    public RequestType getType() { return type; }
    public Object getData() { return data; }
}
