package com.app.J17.SpringBoot_3.Service;

import com.app.J17.SpringBoot_3.Model.Habilidad;
import com.app.J17.SpringBoot_3.Repository.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class habilidadService implements iHabilidadService{
    @Autowired
    public HabilidadRepository habilidadRepository;
    @Override
    public List<Habilidad> verHabilidad() {
        return habilidadRepository.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad habilidad) {
        habilidadRepository.save(habilidad);
    }
    //return

    @Override
    public void eliminarHabilidad(int id_habilidad) {
        habilidadRepository.deleteById(id_habilidad);
    }

    @Override
    public Habilidad buscarHabilidad(int id_habilidad) {
        return habilidadRepository.findById(id_habilidad).orElse(null);
    }

    @Override
    public Habilidad actualizarHabilidad(Habilidad habilidad) {
        return habilidadRepository.save(habilidad);
    }
}
