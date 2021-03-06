package dev.hotdeals.motorhome.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RV implements Model
{
    @Id
    private int id;
    private String brand;
    private String model;
    private String color;
    private String rvType;
    private int price;
    private float fuelStatus;
    private int kmDriven;
    private boolean isRented;
    private boolean requiresCleaning;
    private boolean requiresMaintenance;
    private boolean requiresFurtherService;

    public RV()
    {

    }

    public String toString()
    {
        return id + " " + brand + " " + model + " " + color + " " + rvType + " " + price + " " + fuelStatus +  " " +
                kmDriven + " " + isRented +  " " + requiresCleaning + " " + requiresMaintenance + " " + requiresFurtherService;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public float getFuelStatus()
    {
        return fuelStatus;
    }

    public void setFuelStatus(float fuelStatus)
    {
        this.fuelStatus = fuelStatus;
    }

    public int getKmDriven()
    {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven)
    {
        this.kmDriven = kmDriven;
    }

    public String getRvType()
    {
        return rvType;
    }

    public void setRvType(String rvType)
    {
        this.rvType = rvType;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public boolean getRequiresCleaning()
    {
        return requiresCleaning;
    }

    public void setRequiresCleaning(boolean requiresCleaning)
    {
        this.requiresCleaning = requiresCleaning;
    }

    public boolean getRequiresMaintenance()
    {
        return requiresMaintenance;
    }

    public void setRequiresMaintenance(boolean requiresMaintenance)
    {
        this.requiresMaintenance = requiresMaintenance;
    }

    public boolean getRequiresFurtherService()
    {
        return requiresFurtherService;
    }

    public void setRequiresFurtherService(boolean requiresFurtherService)
    {
        this.requiresFurtherService = requiresFurtherService;
    }

    public boolean getIsRented()
    {
        return isRented;
    }

    public void setIsRented(boolean isRented)
    {
        this.isRented = isRented;
    }
}
