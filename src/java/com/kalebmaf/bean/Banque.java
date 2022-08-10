/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.bean;

import java.io.Serializable;

/**
 *
 * @author Gizeh
 */
public class Banque implements Serializable{
    
    // les attributs ou champs
    private static final Long serialUI = 1L;
    private String codeBanque;
    private String nomBanque;
    private String villeQg;
    
    // constructeurs

    public Banque() {
    }

    public Banque(String codeBanque, String nomBanque, String villeQg) {
        this.codeBanque = codeBanque;
        this.nomBanque = nomBanque;
        this.villeQg = villeQg;
    }

    public Banque(String codeBanque) {
        this.codeBanque = codeBanque;
    }
    
    
}
