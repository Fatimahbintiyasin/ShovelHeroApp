package com.example.shovelheroapp.Models;

import android.media.Image;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TimePicker;

import com.example.shovelheroapp.Models.Address;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class WorkOrder {

    private int workOrderId;
    private String status;
    private int squareFootage;
    private double price;
    private Date requestDate;
    private CalendarView requestDatePicker;
    private TextClock requestTimePicker;
    private String requestedDateTime;
    private boolean isDrivewayChecked;
    private boolean isWalkwayChecked;
    private boolean isSidewalkChecked;
    private List<String> itemsRequested;
    private String specialInstructions;
    private Image arrivalImage;
    private Image completedImage;
    private Image issueImage;


    private int customerId; //to be foreign key
    private int customerAddressId; //to be foreign key


    //private Invoice invoiceId; --> is this how we do it? with foreign key?
    //private Transaction paymentId; --> is this how we do it? Transaction? with foreign key?
    //private int shovelerId;


    public WorkOrder(){
    }


    //CONSTRUCTOR
    public WorkOrder(int workOrderId, Date requestDate, String status, int squareFootage, List<String> itemsRequested, int customerId, int customerAddressId) {
        this.workOrderId = workOrderId;
        this.requestDate = requestDate;
        this.status = status;
        this.squareFootage = squareFootage;
        this.itemsRequested = itemsRequested;
        this.customerId = customerId;
        this.customerAddressId = customerAddressId;
    }


    //GETTERS AND SETTERS

    public int getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(int workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public CalendarView getRequestDatePicker() {
        return requestDatePicker;
    }

    public void setRequestDatePicker(CalendarView requestDatePicker) {
        this.requestDatePicker = requestDatePicker;
    }

    public TextClock getRequestTimePicker() {
        return requestTimePicker;
    }

    public void setRequestTimePicker(TextClock requestTimePicker) {
        this.requestTimePicker = requestTimePicker;
    }

    public String getRequestedDateTime() {
        return requestedDateTime;
    }

    public void setRequestedDateTime(String requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    public boolean isDrivewayChecked() {
        return isDrivewayChecked;
    }

    public void setDrivewayChecked(boolean drivewayChecked) {
        isDrivewayChecked = drivewayChecked;
    }

    public boolean isWalkwayChecked() {
        return isWalkwayChecked;
    }

    public void setWalkwayChecked(boolean walkwayChecked) {
        isWalkwayChecked = walkwayChecked;
    }

    public boolean isSidewalkChecked() {
        return isSidewalkChecked;
    }

    public void setSidewalkChecked(boolean sidewalkChecked) {
        isSidewalkChecked = sidewalkChecked;
    }

    public List<String> getItemsRequested() {
        return itemsRequested;
    }

    public void setItemsRequested(List<String> itemsRequested) {
        this.itemsRequested = itemsRequested;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public Image getArrivalImage() {
        return arrivalImage;
    }

    public void setArrivalImage(Image arrivalImage) {
        this.arrivalImage = arrivalImage;
    }

    public Image getCompletedImage() {
        return completedImage;
    }

    public void setCompletedImage(Image completedImage) {
        this.completedImage = completedImage;
    }

    public Image getIssueImage() {
        return issueImage;
    }

    public void setIssueImage(Image issueImage) {
        this.issueImage = issueImage;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerAddressId() {
        return customerAddressId;
    }

    public void setCustomerAddressId(int customerAddressId) {
        this.customerAddressId = customerAddressId;
    }
}