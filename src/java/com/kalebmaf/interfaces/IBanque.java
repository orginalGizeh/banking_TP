/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.interfaces;

import com.kalebmaf.bean.Banque;
import java.util.ArrayList;

/**
 *
 * @author Gizeh
 */
public interface IBanque {
    
    abstract Banque getBanque(Banque uneBanque);
    abstract ArrayList<Banque> getAllBanque();
}
