package com.company;

class Author {
    private String name;
    private String emailId;
    private char gender;
    public Author(String name,String emailId ,char gender){
        this.name=name;
        this.emailId=emailId;
        this.gender=gender;

    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Book{
    private String name;
    private Author author;
    private  double price;
    private int quantity;
    public Book(String name,Author author,double price,int quantity){
        this.name=name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void displayAuthorDetails(){
        System.out.println(" Author Name: "+ author.getName());

    }
}

