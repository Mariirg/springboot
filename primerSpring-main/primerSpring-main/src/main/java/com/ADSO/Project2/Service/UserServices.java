package com.ADSO.Project2.Service;

import com.ADSO.Project2.repository.IUserRepository;
import com.ADSO.Project2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private IUserRepository iUserRepository;

    //obtener todos los usuarios
    public List<User> GetAllUsers(){
        return iUserRepository.findAll();
    }
    //Guardar un usuario
    public User SaveUser(User User){
        return iUserRepository.save(User);
    }

    //obtener un usuario por Id
    public User GetUserById(Long id){
        return iUserRepository.findById(id).orElse(null);
    }

    //Actualizar un usuario
    public User UpdateUser(User Users){
        return iUserRepository.save(Users);
    }

    //Borrar un usuario
    public void DeleteUser(Long id){
        iUserRepository.deleteById(id);
    }
}
