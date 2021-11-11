package City;

import Base.AbstractBaseManager;
import com.protectionapp.sd2021.dto.localization.CityDTO;
import com.protectionapp.sd2021.dto.user.UserDTO;

import java.util.HashSet;
import java.util.Set;

public class CityManager extends AbstractBaseManager {
    public CityManager(){super();}

    // Post
    public void addCity(){
        CityDTO cityTest = new CityDTO();
        cityTest.setName("Encarnacion2");
        cityTest.setDescription("xyz habitantes");
        //cityTest.setNeighborhood();
        //cityTest.setNeighborhood();

        getJerseyClient().resource(getBaseUrl()+"/cities").entity(cityTest).post(CityDTO.class);
    }

    //Get by id
    public void getCity(){
        getJerseyClient().resource(getBaseUrl()+"/cities/1").get(CityDTO.class);
    }

    //Put
    public void updateCity(){
        CityDTO cityTest = new CityDTO();
        /*cityTest.setName("Asuncion2");
        cityTest.setDescription("xy habitantes y apestosa");

        getJerseyClient().resource(getBaseUrl()+"/cities").entity(cityTest).post(CityDTO.class);*/

        cityTest.setDescription("apestosa! pero interesante.");
        Set<Integer> user_ids = new HashSet<>();
        user_ids.add(2);
        user_ids.add(3);
        user_ids.add(4);

        cityTest.setUsers(user_ids);
        getJerseyClient().resource(getBaseUrl()+"/cities/4").entity(cityTest).put(CityDTO.class);
    }

    // todo GET ALL
    // todo DELETE
    // todo RELATIONSHIPS DAMN



}
