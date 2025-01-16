package org.example.helloworld;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HelloWorldController {

    private ArrayList<String> items = new ArrayList<>();

    // GET Mapping: Fetch all items
    @GetMapping("/items")
    public ArrayList<String> getItems() {
        return items; // Returns the list of items
    }

    // POST Mapping: Add a new item
    @PostMapping("/items")
    public String addItem(@RequestBody String item) {
        items.add(item); // Adds the item to the list
        return "Item added successfully!";
    }

    @DeleteMapping("/items")
    public String delItem(@RequestBody String item){
        items.remove(item);
        return "Item delete successfully";
    }

    @PatchMapping("/items")
    public String patchItem (@RequestBody String item ){
        items.set(0,item);
        return "item patch";
    }
}
