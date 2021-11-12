package User;

import Base.AbstractBaseManager;
import com.protectionapp.sd2021.dto.user.UserDTO;
import com.sun.javafx.image.IntPixelGetter;

import java.util.HashSet;
import java.util.Set;

public class UserManager extends AbstractBaseManager {

    public UserManager(){
        super();
    }

    public String pathToResource = "/users";

    public void addUser(){
        UserDTO userTest = new UserDTO();
        userTest.setName("Test");
        userTest.setSurname("User");
        userTest.setUsername("User-Test");
        userTest.setPhone(0); // refactor this should be string
        userTest.setCn(3996354); // could be string also
        userTest.setAddress("742 Evergreen Terrace");

        Set<Integer> neighborhoodIds = new HashSet<>();
        neighborhoodIds.add(1);
        neighborhoodIds.add(2);

        userTest.setCityId(1);
        userTest.setNeighborhoods(neighborhoodIds);
        userTest.setRole_id(2);
        UserDTO newUser = getJerseyClient().resource(getBaseUrl()+pathToResource).entity(userTest).post(UserDTO.class);
        System.out.println("TEST POST /users " +newUser.toString());
    }

    public void getUser(){
        getJerseyClient().resource(getBaseUrl()+pathToResource+"/2").get(UserDTO.class);
    }
    public void updateUser(){
        UserDTO userTest = new UserDTO();
        userTest.setName("Test");
        userTest.setSurname("User");
        userTest.setUsername("User-Test");
        userTest.setPhone(0); // refactor this should be string
        userTest.setCn(3996354); // could be string also
        userTest.setAddress("742 Evergreen Terrace");

        getJerseyClient().resource(getBaseUrl()+pathToResource).entity(userTest).post(UserDTO.class);

        userTest.setName("asdf");
        userTest.setUsername("asdf");

        getJerseyClient().resource(getBaseUrl()+pathToResource+"/2").entity(userTest).put(UserDTO.class);

    }

    public void deleteUser(Integer id){
        UserDTO deletedUser =  getJerseyClient().resource(getBaseUrl()+pathToResource+"/"+id).delete(UserDTO.class);

        System.out.println("DELETE TEST "+deletedUser.toString());
    }
}
