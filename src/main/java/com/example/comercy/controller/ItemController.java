package com.example.comercy.controller;

import com.example.comercy.model.vendas.Item;
import com.example.comercy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity listAll(){
        return new ResponseEntity(service.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity saveItem(@RequestBody Item item) {
        Item added = service.add(item);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteItem(@PathVariable("id") String itemId) {
        if (service.delete(itemId)) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
