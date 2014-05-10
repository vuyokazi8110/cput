/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import java.util.List;

/**
 *
 * @author sbm
 */
public interface CrudService<s, ID>
{
    public s find(ID id);
    public s persist(s entity);
    public s merge(s entity);
    public s remove(s entity);
    public List<s> findAll();
    
    
}
