package org.example.controlservice.dto;



public class CarDTO {
    private String model;
    private String color;
    private String matricul; // Ensure correct spelling
    private Double price;

    // Add getters and setters
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getMatricul() { return matricul; }
    public void setMatricul(String matricul) { this.matricul = matricul; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}

