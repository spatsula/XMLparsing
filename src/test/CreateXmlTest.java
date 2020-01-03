package test;

import com.gmail.spatsula.CreateXml;
import com.gmail.spatsula.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateXmlTest {

    @org.junit.jupiter.api.Test
    void createDOM() {
        User firstUser = new User("Sophia","Merly", "+12879335587");
        User secondUser = new User("Sophia","Merly", "+12879335587");

        List<User> usersList = new ArrayList<>();
        usersList.add(firstUser);
        usersList.add(secondUser);

        assertTrue(CreateXml.createDOM(usersList, "result.xml")); 
    }
}