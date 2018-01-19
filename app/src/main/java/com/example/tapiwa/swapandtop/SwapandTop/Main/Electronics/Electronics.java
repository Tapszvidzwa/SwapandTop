package com.example.tapiwa.swapandtop.SwapandTop.Main.Electronics;

/**
 * Created by tapiwa on 1/15/18.
 */

public class Electronics {


    private String type, product, description, price, targetSwapPrice, img1, img2,img3,
                   location;


    public Electronics() {
    }


    public Electronics(String type, String product, String price, String targetSwapPrice, String img1,
                       String img2, String img3, String location) {
        this.type = type;
        this.product = product;
        this.price = price;
        this.targetSwapPrice = targetSwapPrice;
        this. img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.location = location;
    }


    public String getType() {
        return type;
    }

    public String getProduct() {
        return product;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getTargetSwapPrice() {
        return targetSwapPrice;
    }

    public String getImg1() {
        return img1;
    }

    public String getImg2() {
        return img2;
    }

    public String getImg3() {
        return img3;
    }

    public String getLocation() {
        return location;
    }
}
