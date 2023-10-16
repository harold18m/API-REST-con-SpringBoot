package pe.tecsup.microservicios_2978.service;

import pe.tecsup.microservicios_2978.model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.tecsup.microservicios_2978.repository.PaisRepository;

import java.util.List;

@Service
public class PaisServicio {

    @Autowired
    private PaisRepository repositorio;

    public List<Pais> listarPais(){
        return repositorio.findAll();
    }

    public void guardarPais(Pais pais){
        repositorio.save(pais);
    }

    public Pais obtenerPaisPorId(Integer id){
        return repositorio.findById(id).get();
    }

    public void eliminarPais(Integer id){
        repositorio.deleteById(id);
    }
}
