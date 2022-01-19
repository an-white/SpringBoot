package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/* debe colocarse a las clases de los controladores y deben estar en la misma carpeta que el spring app para poder
ser detectados por el app*/

@Controller
public class homeController {
    @GetMapping("/")
    public String greeting( Model model ) {
        var msg = "hello";
        model.addAttribute( "msg", msg );
        return "greeting";
    }
}
