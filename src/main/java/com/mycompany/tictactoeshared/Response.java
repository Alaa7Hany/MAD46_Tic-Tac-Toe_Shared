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
public class Response implements Serializable {
    public enum Status { SUCCESS, FAILURE }
    
    private Status status;
    private Object data; 

    public Response(Status status, Object data) {
        this.status = status;
        this.data = data;
    }

    public Status getStatus() { return status; }
    public Object getData() { return data; }
}