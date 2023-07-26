package com.example.nikatshop;

public class WishlistModel {

    private String productId;
    private  String productImage;
    private String productTitle;
    private long freeCoupens;
    private  String rating;
    private  long total_Ratings;
    private  String productPrice;
    private String cuttedPrice;
    private boolean COD;


    public WishlistModel( String productId,String productImage, String productTitle, long freeCoupens, String rating, long total_Ratings, String productPrice, String cuttedPrice, boolean COD) {
       this.productId = productId;
        this.productImage = productImage;
        this.productTitle = productTitle;
        this.freeCoupens = freeCoupens;
        this.rating = rating;
        this.total_Ratings = total_Ratings;
        this.productPrice = productPrice;
        this.cuttedPrice = cuttedPrice;
        this.COD = COD;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public long getFreeCoupens() {
        return freeCoupens;
    }

    public void setFreeCoupens(long freeCoupens) {
        this.freeCoupens = freeCoupens;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public long getTotal_Ratings() {
        return total_Ratings;
    }

    public void setTotal_Ratings(long total_Ratings) {
        this.total_Ratings = total_Ratings;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getCuttedPrice() {
        return cuttedPrice;
    }

    public void setCuttedPrice(String cuttedPrice) {
        this.cuttedPrice = cuttedPrice;
    }

    public boolean isCOD() {
        return COD;
    }

    public void setCOD(boolean COD) {
        this.COD = COD;
    }
}
