package com.tld;

import com.tld.dao.DaoProduitImplement;
import com.tld.model.Produit;

import java.time.LocalDate;

public class AppCreate {
    public static void main(String[] args) {
        DaoProduitImplement dao = new DaoProduitImplement();
        Produit produit = new Produit(5,"crevettes",false, LocalDate.of(2024, 3,15));
        dao.createProduit(produit);
    }
}
