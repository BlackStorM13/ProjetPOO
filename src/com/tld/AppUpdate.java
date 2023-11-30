package com.tld;

import com.tld.dao.DaoProduitImplement;
import com.tld.model.Produit;

import java.time.LocalDate;

public class AppUpdate {
    public static void main(String[] args) {
        DaoProduitImplement dao = new DaoProduitImplement();
        Produit produit = new Produit(5,"fromage",true, LocalDate.of(2024, 8,27));
        dao.updateProduit(produit,5);
    }
}
