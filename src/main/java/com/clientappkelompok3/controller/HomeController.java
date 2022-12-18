/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clientappkelompok3.controller;

import com.clientappkelompok3.service.ProdukService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Ilham
 */
@Controller
public class HomeController {
    
    private ProdukService produkService;
    
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("produk", produkService.getAll());
        return "index";
    }   
}