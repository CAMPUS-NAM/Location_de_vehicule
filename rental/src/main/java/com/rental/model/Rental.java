package com.rental.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Rental {

    @Id
    @GeneratedValue
    private int id;
    private boolean status;
    private int idCLient;
    private int idVehicle;
    private int mileage;
    private Date startDate;
    private Date endDate;
    private boolean drivingLicense;

    public Rental() {

    }

    public Rental(int idCLient, int idVehicle, int mileage, Date startDate, Date endDate,boolean drivingLicense) {
        this.idCLient = idCLient;
        this.idVehicle = idVehicle;
        this.mileage = mileage;
        this.startDate = startDate;
        this.endDate = endDate;
        this.drivingLicense = drivingLicense;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getIdCLient() {
        return idCLient;
    }

    public void setIdCLient(int idCLient) {
        this.idCLient = idCLient;
    }

    public int getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(int idVehicle) {
        this.idVehicle = idVehicle;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", status=" + status +
                ", idCLient=" + idCLient +
                ", idVehicle=" + idVehicle +
                ", mileage=" + mileage +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", drivingLicense=" + drivingLicense +
                '}';
    }
}