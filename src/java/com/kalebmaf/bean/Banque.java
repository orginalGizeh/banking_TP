/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.bean;

import java.io.Serializable;
import java.util.ArrayList;

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
    private ArrayList<Compte> listesComptes;
    
    // constructeurs

    public Banque() {
    }

    public Banque(String codeBanque, String nomBanque, String villeQg) {
        this.codeBanque = codeBanque;
        this.nomBanque = nomBanque;
        this.villeQg = villeQg;
    }

    public Banque(String codeBanque, String nomBanque, String villeQg, ArrayList<Compte> listesComptes) {
        this.codeBanque = codeBanque;
        this.nomBanque = nomBanque;
        this.villeQg = villeQg;
        this.listesComptes = listesComptes;
    }

    public Banque(String codeBanque) {
        this.codeBanque = codeBanque;
    }
    
    // accesseurs et mutateurs 

    public String getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(String codeBanque) {
        this.codeBanque = codeBanque;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public String getVilleQg() {
        return villeQg;
    }

    public void setVilleQg(String villeQg) {
        this.villeQg = villeQg;
    }

    public ArrayList<Compte> getListesComptes() {
        return listesComptes;
    }

    public void setListesComptes(ArrayList<Compte> listesComptes) {
        this.listesComptes = listesComptes;
    }
    
    // toString

    @Override
    public String toString() {
        return "Banque{" + "codeBanque=" + codeBanque + ", nomBanque=" + nomBanque + ", villeQg=" + villeQg + ", listesComptes=" + listesComptes + '}';
    }

}
