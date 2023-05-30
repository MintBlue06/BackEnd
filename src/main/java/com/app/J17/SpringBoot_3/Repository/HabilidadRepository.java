package com.app.J17.SpringBoot_3.Repository;

import com.app.J17.SpringBoot_3.Model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository <Habilidad, Integer> {
}
