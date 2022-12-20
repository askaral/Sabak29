public class Flowers {

    private String manufacturerCountry;
    private int shelfLifeInDays;
    private String colour;
    private int price;

    public Flowers(String manufacturerCountry, int shelfLifeInDays, String colour, int price) {
        this.manufacturerCountry = manufacturerCountry;
        this.shelfLifeInDays = shelfLifeInDays;
        this.colour = colour;
        this.price = price;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public int getShelfLifeInDays() {
        return shelfLifeInDays;
    }

    public void setShelfLifeInDays(int shelfLifeInDays) {
        this.shelfLifeInDays = shelfLifeInDays;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ManufacturerCountry: " + manufacturerCountry +
                "\nShelfLifeInDays: " + shelfLifeInDays +
                "\nColour: " + colour +
                "\nPrice: " + price ;
    }
}
