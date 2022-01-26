package com.company;

public class MovieTicket {
    private int movieId;
    private int noOfSeats;
    private double costTicket;

    public MovieTicket() {
    }

    public MovieTicket(int movieId, int noOfSeats) {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;


    }

    public double getCostTicket() {
        return costTicket;
    }

    public void setCostTicket(double costTicket) {
        this.costTicket = costTicket;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setMovieId(int movieId) {
        if (movieId == 111 || movieId == 112 || movieId == 113) {
            this.movieId = movieId;
        } else {
            System.out.println(" Sorry! Please enter valid movie Id and number os seats");
        }

    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public int getMovieId() {
        return movieId;
    }

    public double calculateTotalAmount() {
        double x = 2;
        if (this.movieId == 111) {

            return (7 * this.noOfSeats) * (1 - (x / 100));


        } else if (this.movieId == 112) {

            return (8 * this.noOfSeats) * (1 - (x / 100));


        } else if (this.movieId == 113) {

            return (8.5 * this.noOfSeats) * (1 - (x / 100));


        } else
            return -1;
    }
}
