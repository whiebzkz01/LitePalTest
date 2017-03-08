package com.whieb.litepaltest;

import org.litepal.crud.DataSupport;

/**
 * Created by zhukongzhen on 2017/3/8.
 */

public class Book  extends DataSupport{
    private  int id;
    private String author;
    private String name;
    private  int pages;
    private  double price;
    private String press;

    public Book() {
    }

    public Book(String name, String author, int pages, double price, String press) {
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.price = price;
        this.press = press;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
