package edu.miu.cs.cs425.mystudentmgmtwebappsec1.service;



import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.User;

import java.util.List;

public interface UserService {

    public abstract List<User> getAllUsers();
    public abstract User saveUser(User user);
    public abstract User getUserById(Integer userId);

}
