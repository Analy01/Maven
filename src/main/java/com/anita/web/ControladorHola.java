package com.anita.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/hola2")
public class ControladorHola {

@RequestMapping(value="/mensaje",method=RequestMethod.GET,headers={"Accept=text/html"})
 public @ResponseBody String algo(){
    String facil="Mi primer servicio en java con REST y Spring";
    return facil;
    }

}
