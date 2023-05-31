package com.app.J17.SpringBoot_3.Controller;

import com.app.J17.SpringBoot_3.Model.Habilidad;
import com.app.J17.SpringBoot_3.Service.iHabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="/api/habilidad")
@CrossOrigin(origins="https://portfolio-frontend-ap01.web.app")
//https://portfolio-frontend-ap01.web.app/
// http://localhost:4200/
public class HabilidadController {
    //List<Habilidad> listaHabilidad = new ArrayList();
    @Autowired
    private iHabilidadService IhabilidadService;

    /*@GetMapping ("/hola")
    public String diceHola(){
        return "Hello World";
    }*/

    @GetMapping ("/show/habilidades")
    @ResponseBody
    public List<Habilidad> verHabilidad(){
        return IhabilidadService.verHabilidad();
    }
    @PostMapping ("/new/habilidad")
    public void crearHabilidad (@RequestBody Habilidad habilidad){
        IhabilidadService.crearHabilidad(habilidad);
    }
    @DeleteMapping("/delete/habilidad/{id_habilidad}")
    public void eliminarHabilidad (@PathVariable int id_habilidad){
        IhabilidadService.eliminarHabilidad(id_habilidad);
    }
    @GetMapping ("/find/habilidad/{id_habilidad}")
    public Habilidad buscarHabilidad (@PathVariable int id_habilidad){
        return IhabilidadService.buscarHabilidad(id_habilidad);
    }
    @PutMapping ("/update/habilidad")
    public Habilidad actualizarHabilidad (@RequestBody Habilidad habilidad){
        return IhabilidadService.actualizarHabilidad(habilidad);
    }
}
