package com.genpact.copilot.userregistration;

import com.genpact.copilot.userregistration.model.User;
import com.genpact.copilot.userregistration.repository.UserRepository;
import com.genpact.copilot.userregistration.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
@DataJpaTest
public class UserControllerTest {
    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {
        User user = new User(1L, "test", "test", "test", "test", "test", "test", "test", "test");
        userRepository.save(user);
        verify(userRepository).save(user);
    }

    @Test
    public void testGetUser() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(new User(1L, "test", "test", "test", "test", "test", "test", "test", "test")));
        Assertions.assertEquals("test", userService.getUser(1L).userName);
    }

}
