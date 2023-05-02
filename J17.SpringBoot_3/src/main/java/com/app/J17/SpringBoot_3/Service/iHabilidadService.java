package com.app.J17.SpringBoot_3.Service;

import com.app.J17.SpringBoot_3.Model.Habilidad;
import java.util.List;

public interface iHabilidadService {
    public List<Habilidad> verHabilidad();
    public void crearHabilidad (Habilidad habilidad);
    public void eliminarHabilidad (int id_habilidad);
    public Habilidad buscarHabilidad (int id_habilidad);
    public Habilidad actualizarHabilidad (Habilidad habilidad);
}
