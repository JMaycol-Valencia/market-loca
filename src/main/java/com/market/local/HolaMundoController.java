package com.market.local;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @GetMapping("/inicio")
    public String saludar(){
        return "<h1> Siempre es un buen dia para aprender algo nuevo 🧠 </h1>";
    }
}
