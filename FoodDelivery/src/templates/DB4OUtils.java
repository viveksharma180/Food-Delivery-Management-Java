/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templates;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viveksharma
 */
public class DB4OUtils {
    private static final DateFormat FORMATTER = new SimpleDateFormat(
            "YYYY-MM-DD");
    // Input validators
    private static final String nameRegex = "^[a-zA-Z ]+$";
    private static final String numberRegex = "^[0-9.]*$";
    private static final String nameNumberRegex = "^[a-zA-Z0-9-, ]+$";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");

    public static boolean validateName(String inputName) {
        return inputName.matches(nameRegex);
    }

    public static boolean validateNumber(String numberInput) {
        return numberInput.matches(numberRegex);
    }

    public static boolean validateNameNumber(String nameNumberInput) {
        return nameNumberInput.matches(nameNumberRegex);
    }

    public static boolean isValidDate(String input) {
        try {
            dateFormat.parse(input);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static String readFile(String filepath) {
        BufferedReader reader = null;
        try {
            String s = "";
            reader = new BufferedReader(new FileReader(new File(filepath)));
            while (true) {
                String p = reader.readLine();
                if (p == null) {
                    break;
                } else {
                    s = s + p;
                }
            }
            reader.close();
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFile(String filepath, String content) {
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(filepath))));
            pw.println(content);
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(DB4OUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<RestaurantTemplate> readRestaurants() {
        Gson g = new Gson();
        String json = DB4OUtils.readFile("src/data/restaurantsDirectory.json");
        return g.fromJson(json, new TypeToken<ArrayList<RestaurantTemplate>>() {
        }.getType());
    }

    public static void writeRestaurants(ArrayList<RestaurantTemplate> restaurantList) {
        Gson g = new GsonBuilder().setPrettyPrinting().create();
        writeFile("src/data/restaurantsDirectory.json", g.toJson(restaurantList));
    }

    public static ArrayList<CustomerTemplate> readCustomer() {
        Gson g = new Gson();
        String json = DB4OUtils.readFile("src/data/customerDirectory.json");
        return g.fromJson(json, new TypeToken<ArrayList<CustomerTemplate>>() {
        }.getType());
    }

    public static void writeCustomer(ArrayList<CustomerTemplate> customeList) {
        Gson g = new GsonBuilder().setPrettyPrinting().create();
        writeFile("src/data/customerDirectory.json", g.toJson(customeList));
    }

    public static ArrayList<DeliveryManTemplate> readDeliveryMan() {
        Gson g = new Gson();
        String json = DB4OUtils.readFile("src/data/deliveryManDirectory.json");
        return g.fromJson(json, new TypeToken<ArrayList<DeliveryManTemplate>>() {
        }.getType());
    }

    public static void writeDeliveryMan(ArrayList<DeliveryManTemplate> deliverManList) {
        Gson g = new GsonBuilder().setPrettyPrinting().create();
        writeFile("src/data/deliveryManDirectory.json", g.toJson(deliverManList));
    }
    
     public static ArrayList<DishTemplate> readDish(String restaurantName) {
        Gson g = new Gson();
        String fileName = "src/data/" + restaurantName + ".json";
        String json = DB4OUtils.readFile(fileName);
        if (json == null) {
            return new ArrayList<DishTemplate>();
        }
        return g.fromJson(json, new TypeToken<ArrayList<DishTemplate>>() {
        }.getType());
    }
    
    public static void writeDish(ArrayList<DishTemplate> dishList, String restaurantName) {
        Gson g = new GsonBuilder().setPrettyPrinting().create();
        String fileName = "src/data/" + restaurantName + ".json";
        writeFile(fileName, g.toJson(dishList));
    }
    
    public static ArrayList<OrderTemplate> readOrder(String customerName) {
        Gson g = new Gson();
        String fileName = "src/data/orders/" + customerName + "_order.json";
        String json = DB4OUtils.readFile(fileName);
        if (json == null) {
            return new ArrayList<OrderTemplate>();
        }
        return g.fromJson(json, new TypeToken<ArrayList<OrderTemplate>>() {
        }.getType());
    }
    
    public static void writeOrder(ArrayList<OrderTemplate> orderList, String customerName) {
        Gson g = new GsonBuilder().setPrettyPrinting().create();
        String fileName = "src/data/orders/" + customerName + "_order.json";
        writeFile(fileName, g.toJson(orderList));
    }
    
    public static ArrayList<OrderTemplate> readDeliveryOrder(String deliveryManName) {
        Gson g = new Gson();
        String fileName = "src/dataDelivery/" + deliveryManName + "_order.json";
        String json = DB4OUtils.readFile(fileName);
        if (json == null) {
            return new ArrayList<OrderTemplate>();
        }
        return g.fromJson(json, new TypeToken<ArrayList<OrderTemplate>>() {
        }.getType());
    }
    
    public static void writeDeliveryOrder(ArrayList<OrderTemplate> order, String deliveryManName) {
        Gson g = new GsonBuilder().setPrettyPrinting().create();
        String fileName = "src/dataDelivery/" + deliveryManName + "_order.json";
        writeFile(fileName, g.toJson(order));
    }
    
    public static int findFirstAvailableDeliveryMan(ArrayList<DeliveryManTemplate> deliveryMan) {
        int index = -1;
        for (int i = 0; i < deliveryMan.size(); i++) {
            if (deliveryMan.get(i).isAvailable()) {
                //deliveryMan.get(i).setAvailable(false);
                index = i;
                break;
            }
        }
        return index;
    }
}
