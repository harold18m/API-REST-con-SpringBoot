package pe.tecsup.microservicios_2978.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.tecsup.microservicios_2978.model.Pais;
import pe.tecsup.microservicios_2978.service.PaisServicio;

import java.util.List;

@RestController
public class PaisControlador {

    @Autowired
    private PaisServicio servicio;

    @GetMapping("/paises")
    public List<Pais> listarPaises(){
        return servicio.listarPais();
    }

    @GetMapping("/paises/{id}")
    public ResponseEntity<Pais> obtenerPais(@PathVariable Integer id){
        try{
            Pais pais = servicio.obtenerPaisPorId(id);
            return new ResponseEntity<Pais>(pais, HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<Pais>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/paises")
    public ResponseEntity<String> guardarPais(@RequestBody Pais pais){
        servicio.guardarPais(pais);
        return ResponseEntity.status(HttpStatus.OK).body("Pais agregado con éxito");
    }

    @PutMapping("/paises/{id}")
    public ResponseEntity<?> actualizarPais(@RequestBody Pais pais, @PathVariable Integer id){
        try{
            Pais paisExistente = servicio.obtenerPaisPorId(id);
            paisExistente.setNombre(pais.getNombre());
            paisExistente.setContinente(pais.getContinente());
            paisExistente.setProvincias(pais.getProvincias());
            paisExistente.setBeach(pais.isBeach());
            servicio.guardarPais(paisExistente);
            return ResponseEntity.status(HttpStatus.OK).body("Pais editado con éxito");
        }catch (Exception exception){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pais not found");
        }
    }

     @DeleteMapping("/paises/{id}")
     public ResponseEntity<String> EliminarPais(@PathVariable Integer id){
            servicio.eliminarPais(id);
         return ResponseEntity.status(HttpStatus.OK).body("Pais eliminado con éxito");
        }

}

