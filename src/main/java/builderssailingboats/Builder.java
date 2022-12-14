package builderssailingboats;

import boats.HullMaterial;
import boats.HullType;

public interface Builder {                             // interface Builder stores setter method

    void setBrand(String brand);
    void setModel(String model);
    void setCountryOfOrigin(String countryOfOrigin);
    void setLength(double length);
    void setPrice(double price);
    void setSeats(int seats);
    void setProjectCategory(char projectCategory);
    void setHullMaterial(HullMaterial hullMaterial);
    void setHullType(HullType hullType);
    void setWeight(double weight);
}
