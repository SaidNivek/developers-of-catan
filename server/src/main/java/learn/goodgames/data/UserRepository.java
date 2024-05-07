package learn.goodgames.data;

import learn.goodgames.models.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository {

    List<User> findAll();

    User findById(int userId);

    User add (User user);

    boolean update(User user);

}
