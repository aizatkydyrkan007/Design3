package utils;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import model.Edge;
import model.Graph;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class JsonIO {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static List<Graph> readGraphs(String filename) {
        try (FileReader reader = new FileReader(filename)) {
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            Type graphListType = new TypeToken<List<Graph>>() {}.getType();
            return gson.fromJson(jsonObject.get("graphs"), graphListType);
        } catch (Exception e) {
            System.err.println("Error reading file: " + filename);
            return Collections.emptyList();
        }
    }
    public static void writeResults(String filename, Map<Integer, Object> results) {
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(results, writer);
            System.out.println("Results written to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing file: " + filename);
        }
    }
}
