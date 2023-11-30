package com.tld;

import com.tld.dao.DaoProduitImplement;

public class AppDelete {
    public static void main(String[] args) {
        DaoProduitImplement dao = new DaoProduitImplement();
        dao.deleteProduit(5);
    }
}
