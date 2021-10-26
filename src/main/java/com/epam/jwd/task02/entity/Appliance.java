package com.epam.jwd.task02.entity;

import com.epam.jwd.task02.constant.ApplianceName;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Appliance implements Parameterizable {
    private float price;

    public Appliance() {

    }

    public Appliance(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Appliance appliance = (Appliance) o;
        return Float.compare(appliance.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "Appliance{" + "price=" + price +
                '}';
    }

    @Override
    public Map<String, String> getParams() {
        return new HashMap<>() {{
            put("CATEGORY", ApplianceName.APPLIANCE);
            put(ApplianceParam.PRICE, String.valueOf(price));
        }};
    }
}
