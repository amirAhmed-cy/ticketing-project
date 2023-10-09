package com.cydeo.service;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;

import java.util.List;

//save, findById, delete, findAll,
public interface RoleService extends CrudService<RoleDTO, Long> {

    /*
    RoleDTO save(RoleDTO role);
    RoleDTO findByID(Long id);
    List<RoleDTO> findAll();
    void delete(RoleDTO roleDTO);
    void deleteById(long id);
     */

    //RoleDTO myLogic(RoleDTO user, String str);

}
