package com.empresa.WebController;


import com.empresa.entity.Empleado;
import com.empresa.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class HomeController {

    @Autowired
    EmpleadoService webController;
//------------------------------get--------------------------------------------

    @GetMapping
    private String tablaEmpleados(Model model) {
        model.addAttribute("list_empleados", webController.verEmpleados());
        return "ver_e";
    }

    //-------------------------post-------------------------------------

    @PostMapping
    private void crearYActualizarTabla(@RequestBody Empleado empleado) {
        webController.crearYActualizarEmpleado(empleado);
    }
}
