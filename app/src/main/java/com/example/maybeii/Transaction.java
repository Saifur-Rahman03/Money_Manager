package com.example.maybeii;

import java.util.ArrayList;

public class Transaction {
    public String description, date;
    public double cost;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Transaction(String description, double cost, String date) {
    this.description = description;
    this.cost = cost;
    this.date = date;
}
}

class Trans{
    ArrayList<Transaction> transactions = new ArrayList<>();
    public String currentDate;
    public double totalfToday;
    public double totalCost = 0;
    public double left;

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public double getTotalfToday() {
        return totalfToday;
    }

    public void setTotalfToday(double totalfToday) {
        this.totalfToday = totalfToday;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Trans(Transaction transaction, String currentDate, double totalfToday, double totalCost, double left){
        this.transactions = transactions;
        this.currentDate = currentDate;
        this.totalfToday = totalfToday;
        this.totalCost = totalCost;
        this.left = left;
    }

}