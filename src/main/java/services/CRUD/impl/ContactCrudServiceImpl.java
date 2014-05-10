/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.CRUD.impl;

import java.awt.print.Book;
import java.util.List;
import model.Contact;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import services.CRUD.ContactCrudService;

/**
 *
 * @author sbm
 */
public class ContactCrudServiceImpl implements ContactCrudService {
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Contact find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Contact persist(Contact entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Contact merge(Contact entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Contact remove(Contact entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Contact> findAll() {
        return null;
    }


}
