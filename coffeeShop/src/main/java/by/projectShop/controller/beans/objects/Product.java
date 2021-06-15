package by.projectShop.controller.beans.objects;


import java.io.Serializable;
import java.util.Locale;

public class Product implements Serializable {

    private int id;
    private String nameCoffee;
    private String manufacturer;
    private String grow;
    private String degreeOfRoast;
    private String grainGrade;
    private int pricePerKg;
    private String information;
    private String url;
    private int netWeight;
    private float priceTotal;

    public Product(){

    }

    public Product(int id, String nameCoffee, String manufacturer, String grow, String degreeOfRoast, String grainGrade, int pricePerKg, String information, String url, int netWeight, float priceTotal) {
        this.id = id;
        this.nameCoffee = nameCoffee;
        this.manufacturer = manufacturer;
        this.grow = grow;
        this.degreeOfRoast = degreeOfRoast;
        this.grainGrade = grainGrade;
        this.pricePerKg = pricePerKg;
        this.information = information;
        this.url = url;
        this.netWeight = netWeight;
        this.priceTotal = priceTotal;
    }

    public Product clone() {
        return new Product(getId(), getNameCoffee(), getManufacturer(), getGrow(), getDegreeOfRoast(), getGrainGrade(), getPricePerKg(), getInformation(), getUrl(), getNetWeight(), getPriceTotal());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCoffee() {
        return nameCoffee;
    }

    public void setNameCoffee(String nameCoffee) {
        this.nameCoffee = nameCoffee;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getGrow() {
        return grow;
    }

    public void setGrow(String grow) {
        this.grow = grow;
    }

    public String getDegreeOfRoast() {
        return degreeOfRoast;
    }

    public void setDegreeOfRoast(String degreeOfRoast) {
        this.degreeOfRoast = degreeOfRoast;
    }

    public String getGrainGrade() {
        return grainGrade;
    }

    public void setGrainGrade(String grainGrade) {
        this.grainGrade = grainGrade;
    }

    public int getPrice() {
        return pricePerKg;
    }

    public void setPrice(int price) {
        this.pricePerKg = price;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public int getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(int netWeight) {
        this.netWeight = netWeight;
        if(netWeight != 0){
            priceTotal = pricePerKg * ((float)netWeight/1000);
            String result = String.format(Locale.ROOT, "%.1f", priceTotal);
            priceTotal = Float.parseFloat(result);
        }
        else
            priceTotal = 0;
    }

    public float getPriceTotal() {
        if(netWeight != 0)
            priceTotal = pricePerKg * ((float)netWeight/1000);

        String result = String.format(Locale.ROOT, "%.1f", priceTotal);
        priceTotal = Float.parseFloat(result);
        return priceTotal;

    }

    public void setPriceTotal(float priceTotal) {
        this.priceTotal = priceTotal;
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameCoffee != null ? nameCoffee.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + (grow != null ? grow.hashCode() : 0);
        result = 31 * result + (degreeOfRoast != null ? degreeOfRoast.hashCode() : 0);
        result = 31 * result + (grainGrade != null ? grainGrade.hashCode() : 0);
        result = 31 * result + pricePerKg;
        result = 31 * result + (information != null ? information.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product that = (Product) o;

        if (id != that.id) return false;
        if (pricePerKg != that.pricePerKg) return false;
        if (nameCoffee != null ? !nameCoffee.equals(that.nameCoffee) : that.nameCoffee != null) return false;
        if (manufacturer != null ? !manufacturer.equals(that.manufacturer) : that.manufacturer != null) return false;
        if (grow != null ? !grow.equals(that.grow) : that.grow != null) return false;
        if (degreeOfRoast != null ? !degreeOfRoast.equals(that.degreeOfRoast) : that.degreeOfRoast != null)
            return false;
        if (grainGrade != null ? !grainGrade.equals(that.grainGrade) : that.grainGrade != null) return false;
        if (information != null ? !information.equals(that.information) : that.information != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return  "id = " + id + '\n' +
                ", nameCoffee = " + nameCoffee + '\n' +
                ", manufacturer = " + manufacturer + '\n' +
                ", grow = " + grow + '\n' +
                ", degreeOfRoast = " + degreeOfRoast + '\n' +
                ", grainGrade = " + grainGrade + '\n' +
                ", price = " + priceTotal + '\n' +
                ", information = " + information + '\n' +
                ", url = " + url + '\n' +
                "--------------";
    }

}