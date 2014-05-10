/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.CRUD.impl;

import java.awt.print.Book;
import java.util.List;
import model.Student;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import services.CRUD.StudentCrudService;

/**
 *
 * @author sbm
 */
public class StudentCrudServiceImpl implements StudentCrudService
{
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Student find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Student persist(Student entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Student merge(Student entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Student remove(Student entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Student> findAll() {
        return null;
    }

    
}
