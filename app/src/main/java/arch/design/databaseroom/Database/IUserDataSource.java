package arch.design.databaseroom.Database;

import java.util.List;

import arch.design.databaseroom.Model.User;
import io.reactivex.Flowable;

public interface IUserDataSource {

    Flowable<User> getUserById(int userId);

    Flowable<List<User>> getAllUsers();

    void insertUser(User... users);

    void updateUser(User... users);

    void deleteUser(User user);

    void deleteAllUsers();
}
