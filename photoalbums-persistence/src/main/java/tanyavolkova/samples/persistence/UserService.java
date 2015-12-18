package tanyavolkova.samples.persistence;

import tanyavolkova.samples.persistence.jpa.User;

import java.util.Collection;

/**
 * @author Tetiana Volkova
 */
public interface UserService {

    User create(User user);

    User update(User user);

    Long delete(User user);

    User findById(Long id);

    Collection<User> findAll();
}
