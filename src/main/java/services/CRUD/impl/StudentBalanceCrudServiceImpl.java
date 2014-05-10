/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.CRUD.impl;

import java.awt.print.Book;
import java.util.List;
import model.StudentBalance;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import services.CRUD.StudentBalanceCrudService;
import services.CRUD.StudentCrudService;

/**
 *
 * @author sbm
 */
public class StudentBalanceCrudServiceImpl implements StudentBalanceCrudService
{
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public StudentBalance find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public StudentBalance persist(StudentBalance entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public StudentBalance merge(StudentBalance entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public StudentBalance remove(StudentBalance entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<StudentBalance> findAll() {
        return null;
    }

}
