package User;

import Base.AbstractBaseManager;
import com.protectionapp.sd2021.dto.user.UserDTO;

public class UserManager extends AbstractBaseManager {

    public UserManager(){
        super();
    }

    public void addUser(){
        UserDTO userTest = new UserDTO();
        userTest.setName("Test");
        userTest.setSurname("User");
        userTest.setUsername("User-Test");
        userTest.setPhone(0); // refactor this should be string
        userTest.setCn(3996354); // could be string also
        userTest.setAddress("742 Evergreen Terrace");

        getJerseyClient().resource(getBaseUrl()+"/users").entity(userTest).post(UserDTO.class);
    }

    public void getUser(){
        getJerseyClient().resource(getBaseUrl()+"/users/2").get(UserDTO.class);
    }
    public void updateUser(){
        UserDTO userTest = new UserDTO();
        userTest.setName("Test");
        userTest.setSurname("User");
        userTest.setUsername("User-Test");
        userTest.setPhone(0); // refactor this should be string
        userTest.setCn(3996354); // could be string also
        userTest.setAddress("742 Evergreen Terrace");

        getJerseyClient().resource(getBaseUrl()+"/users").entity(userTest).post(UserDTO.class);

        userTest.setName("asdf");
        userTest.setUsername("asdf");

        getJerseyClient().resource(getBaseUrl()+"/users/2").entity(userTest).put(UserDTO.class);

    }
}
