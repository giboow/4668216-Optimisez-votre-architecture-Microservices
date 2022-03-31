package com.clientui.beans;

import lombok.Data;

@Data
public class ProductBean {
    private int id;
    private String titre;
    private String description;
    private String image;
    private String prix;

    @Override
    public String toString() {
        return "ProductBean{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", prix='" + prix + '\'' +
                '}';
    }
}
