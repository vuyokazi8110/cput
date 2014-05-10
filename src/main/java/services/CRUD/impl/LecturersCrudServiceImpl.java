/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.CRUD.impl;

import java.awt.print.Book;
import java.util.List;
import model.Lecturers;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import services.CRUD.LecturersCrudService;

/**
 *
 * @author sbm
 */
public class LecturersCrudServiceImpl implements LecturersCrudService
{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Lecturers find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Lecturers persist(Lecturers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Lecturers merge(Lecturers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Lecturers remove(Lecturers entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Lecturers> findAll() {
        return null;
    }


}
