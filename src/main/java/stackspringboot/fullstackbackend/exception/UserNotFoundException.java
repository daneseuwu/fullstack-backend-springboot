package stackspringboot.fullstackbackend.exception;

import stackspringboot.fullstackbackend.model.User;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user with id "+id);
    }
}
