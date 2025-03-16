//package net.engineeringdigest.journalApp;
//
//import com.mongodb.assertions.Assertions;
//import net.engineeringdigest.journalApp.repository.UserRepository;
//import net.engineeringdigest.journalApp.service.UserDetailsServiceImpl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.test.context.ActiveProfiles;
//
//import java.util.ArrayList;
//
//import static org.mockito.Mockito.*;
//import static org.springframework.security.core.userdetails.User.*;
//
//@ActiveProfiles("dev")
//public class UserDetailsServiceImplTests {
//    @InjectMocks
//    private UserDetailsServiceImpl userDetailsService;
//
//    @Mock
//    private UserRepository userRepository;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
////    @Test
////    void loadUserByUsernameTest() {
////        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().username("ram").password("ramshyam").roles(new ArrayList<>()).build());
////        UserDetails user = userDetailsService.loadUserByUsername("ram");
////        Assertions.assertNotNull(user);
////    }
//}
