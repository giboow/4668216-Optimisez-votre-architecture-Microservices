package com.clientui.controller;

import com.clientui.beans.ProductBean;
import com.clientui.proxies.MicorserviceProduitsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private MicorserviceProduitsProxy produitsProxy;

    @GetMapping("/")
    public String accueil(Model model) {

        List<ProductBean> produits = produitsProxy.listeDesProduits();
        model.addAttribute("produits", produits);
        return "Accueil";
    }

    @GetMapping("/details-produit/{id}")
    public String detailsProduit(Model model, @PathVariable int id) {
        ProductBean produit = produitsProxy.recupererUnProduit(id);
        model.addAttribute("produit", produit);
        return "FicheProduit";
    }
}
