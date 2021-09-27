package com.ilongross.patterns.structural.home_work_lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserRepoImpl implements UserRepo {

    private List<User> users = Collections.synchronizedList(new ArrayList<>());

    public UserRepoImpl(List<User> users) {
        this.users.addAll(users);
    }

    @Override
    public Stream<User> getAll() {
        return users.parallelStream();
    }

    @Override
    public synchronized void changeUsers(List<User> changedList) {
        users.clear();
        users.addAll(changedList);
    }

    @Override
    public String toString() {
        return users.parallelStream()
                .map(User::toString)
                .collect(Collectors.joining("\n", "Users[" + users.size() + "]:\n", "\n"));
    }
}
