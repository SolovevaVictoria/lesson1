package ru.geekbrains.lesson1;

public class Chocolate extends Product{
    private String view; // вид шоколада

    public Chocolate(String brand, String name, double price, String view){
        super(brand, name, price);
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public String displayInfo() {
        return String.format("[ШОКОЛАД] %s - %s - %.2f - вид: %s", brand, name, price, view);
    }
}
