/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlg.springboot.backend.chat.models.documents;

import java.io.Serializable;

/**
 *
 * @author jlg
 */
public class Mensaje implements Serializable {

    private String texto;
    private Long fecha;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Long getFecha() {
        return fecha;
    }

    public void setFecha(Long fecha) {
        this.fecha = fecha;
    }

    private static final long serialVersionUID = -3777582564067492550L;
}
