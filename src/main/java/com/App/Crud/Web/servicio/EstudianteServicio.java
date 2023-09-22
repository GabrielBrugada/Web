package com.App.Crud.Web.servicio;

import com.App.Crud.Web.entidad.Estudiante;

import java.util.List;

public interface EstudianteServicio {
    public List<Estudiante> ListarTodosLosEstudiantes();
    public Estudiante guardarEstudiante(Estudiante estudiante);
    public Estudiante obtenerEstudiantePorId(Long id);
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Long id);
}
