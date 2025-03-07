package com.example.antifraud.controller;

import com.example.antifraud.service.AntifraudService;

@RestController
@RequestMapping("/antifraud")
public class AntifraudController {

    @com.example.antifraud.controller.Autowired
    private AntifraudService antifraudService;

}