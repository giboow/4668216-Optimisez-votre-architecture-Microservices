package com.clientui.proxies;

import com.clientui.beans.ProductBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-produit", url = "localhost:9001")
public interface MicorserviceProduitsProxy {
    @GetMapping("/Produits")
    List<ProductBean> listeDesProduits();

    @GetMapping("/Produits/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);
}
