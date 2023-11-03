package codestudy.dev.domain.service;

import codestudy.dev.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
