package org.launchcode.preplate.data;


import org.launchcode.preplate.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByEmail(String email);

}
