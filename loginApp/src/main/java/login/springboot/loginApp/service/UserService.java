package login.springboot.loginApp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import login.springboot.loginApp.model.User;
import login.springboot.loginApp.web.dto.UserRegistrationDto;

//import net.javaguides.springboot.model.User;
//import net.javaguides.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
