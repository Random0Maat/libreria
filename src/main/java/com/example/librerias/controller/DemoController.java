/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.librerias.controller;

/**
 *
 * @author PC
 */
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DemoController {
    
    @CrossOrigin(origins = "*")
    @PostMapping(value = "demo")
    public String welcome()
    {
        return "Welcome from secure endpoint";
         
    }
}
