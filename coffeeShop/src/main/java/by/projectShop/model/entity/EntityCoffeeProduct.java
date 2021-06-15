package by.projectShop.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "coffee_products", schema = "public", catalog = "coffeeShop")
public class EntityCoffeeProduct {
    @Override
    public String toString() {
        return  "id = " + id + '\n' +
                ", nameCoffee = " + nameCoffee + '\n' +
                ", manufacturer = " + manufacturer + '\n' +
                ", grow = " + grow + '\n' +
                ", degreeOfRoast = " + degreeOfRoast + '\n' +
                ", grainGrade = " + grainGrade + '\n' +
                ", price = " + price + '\n' +
                ", information = " + information + '\n' +
                ", url = " + url + '\n' +
                "--------------";
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_coffee", nullable = false, length = 255)
    private String nameCoffee;
    @Column(name = "manufacturer", nullable = true, length = 255)
    private String manufacturer;
    @Column(name = "grow", nullable = true, length = 255)
    private String grow;
    @Column(name = "degree_of_roast", nullable = true, length = 255)
    private String degreeOfRoast;
    @Column(name = "grain_grade", nullable = true, length = 255)
    private String grainGrade;
    @Column(name = "price", nullable = false)
    private int price;
    @Column(name = "information", nullable = true, length = -1)
    private String information;
    @Column(name = "url", nullable = true, length = -1)
    private String url;

    public EntityCoffeeProduct(){

    }

    public EntityCoffeeProduct(String nameCoffee, int price) {
        this.nameCoffee = nameCoffee;
        this.price = price;
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
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityCoffeeProduct that = (EntityCoffeeProduct) o;

        if (id != that.id) return false;
        if (price != that.price) return false;
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
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameCoffee != null ? nameCoffee.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + (grow != null ? grow.hashCode() : 0);
        result = 31 * result + (degreeOfRoast != null ? degreeOfRoast.hashCode() : 0);
        result = 31 * result + (grainGrade != null ? grainGrade.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (information != null ? information.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
