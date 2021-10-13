package com.ilongross.patterns.home_works.lab4;

import java.util.List;
import java.util.stream.Stream;

public interface UserRepo {

    Stream<User> getAll();
    void changeUsers(List<User> users);

}
