package com.yanevskyy.shoesFactory;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
import javax.persistence.*;

/**
 * Create and update shoes models.
 */

@Entity
@Table(name = "shoes")
public class Shoes {
    /*id in DB*/
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /*Shoes article*/
    @Column(name = "SHOES_ART")
    private String shoesArt;
    /*Shoes type - feminine or male */
    @Column(name = "SHOES_TYPE")
    private String shoesType;
    /*Model shoes - shoe, boots*/
    @Column(name = "SHOES_MODEL")
    private String shoesModel;
    /*price on the shoes*/
    @Column(name = "SHOES_PRICE")
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShoesArt() {
        return shoesArt;
    }

    public void setShoesArt(String shoesArt) {
        this.shoesArt = shoesArt;
    }

    public String getShoesType() {
        return shoesType;
    }

    public void setShoesType(String shoesType) {
        this.shoesType = shoesType;
    }

    public String getShoesModel() {
        return shoesModel;
    }

    public void setShoesModel(String shoesModel) {
        this.shoesModel = shoesModel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "id=" + id +
                ", shoesArt='" + shoesArt + '\'' +
                ", shoesType='" + shoesType + '\'' +
                ", shoesModel='" + shoesModel + '\'' +
                ", price=" + price +
                '}';
    }
}
