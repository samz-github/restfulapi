package com.sam.model;

public class CloudServer {
    private int id;
    private String physicalSubsystem;
    private int number;
    private int cpu;
    private int ram;
    private int systemDisk;
    private int dataDisk;
    private String os;
    private String description;
    private String notation;
    private String contactName;
    private String contactPhone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhysicalSubsystem() {
        return physicalSubsystem;
    }

    public void setPhysicalSubsystem(String physicalSubsystem) {
        this.physicalSubsystem = physicalSubsystem;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSystemDisk() {
        return systemDisk;
    }

    public void setSystemDisk(int systemDisk) {
        this.systemDisk = systemDisk;
    }

    public int getDataDisk() {
        return dataDisk;
    }

    public void setDataDisk(int dataDisk) {
        this.dataDisk = dataDisk;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotation() {
        return notation;
    }

    public void setNotation(String notation) {
        this.notation = notation;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    CloudServer() {

    }



}