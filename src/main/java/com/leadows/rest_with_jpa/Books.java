package com.leadows.rest_with_jpa;


import org.json.JSONObject;
import org.springframework.data.annotation.Id;


public class Books {
    @Id
    private String id;
    private String title;
    private String author;
    private int price;
    private String type;


    public Books() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


   
    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", this.title);
        jsonObject.put("author", this.author);
        jsonObject.put("price", this.price);
        return jsonObject;
    }

    public Books(String id, String title, String author, int price, String type) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    
}
