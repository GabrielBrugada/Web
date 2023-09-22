package com.App.Crud.Web.servicio;

import com.App.Crud.Web.entidad.Estudiante;
import com.App.Crud.Web.repositorio.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServicioImpl implements EstudianteServicio{

    @Autowired
    private EstudianteRepository repository;
    @Override
    public List<Estudiante> ListarTodosLosEstudiantes() {
        return repository.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstudiantePorId(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        repository.deleteById(id);
    }
}
