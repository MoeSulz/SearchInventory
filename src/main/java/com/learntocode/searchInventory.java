package com.learntocode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class searchInventory {
    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        Collections.sort(inventory, Comparator.comparing(Product::getName));
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }











    public static ArrayList<Product> getInventory() throws IOException {
        ArrayList<Product> inventory =
                new ArrayList<Product>();

        String fileName = "inventory.txt";

        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while (!((line = reader.readLine()) != null){
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                String price = tokens[2];
                inventory.add(new Product()
            }
        }



        /*inventory.add(new Product(638, "Remote", 6.5f));
        inventory.add(new Product(357, "Table", 54.9f));
        inventory.add(new Product(482, "Chair", 34.9f));
        inventory.add(new Product(284, "Television", 499.9f));
        inventory.add(new Product(394, "Queen Bed", 350.0f));
        return inventory;
    }

}
