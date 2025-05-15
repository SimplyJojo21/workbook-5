package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<Asset>();

        assets.add(new House("My House", "2015-06-01", 250000.00, "123 Elm St", 1, 1800, 6000));
        assets.add(new House("Vacation Home", "2019-07-10", 175000.00, "456 Lakeview Dr", 2, 1400, 4000));
        assets.add(new Vehicle("Tom's Truck", "2020-08-15", 32000.00, "Ford F-150", 2020, 45000));
        assets.add(new Vehicle("Family Car", "2016-05-22", 28000.00, "Toyota Camry", 2016, 110000));
        assets.add(new Cash("Emergency Fund", "2023-01-01", 5000.00));

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year & Make/Model: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }

            System.out.println("---------------");
        }
    }
}
