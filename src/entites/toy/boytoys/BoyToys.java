package entites.toy.boytoys;

import entites.toy.superclass_toy.Toy;

public class BoyToys extends Toy {

    public BoyToys(int id, String name, int price, String manufacturer, int quantity) {
        super(id, name, price, manufacturer, quantity);
    }

    public BoyToys() {
    }

    public BoyToys(String name, int price, String manufacturer, int quantity) {
        super(name, price, manufacturer, quantity);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public void setManufacturer(String manufacturer) {
        super.setManufacturer(manufacturer);
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
