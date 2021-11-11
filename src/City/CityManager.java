package City;

import Base.AbstractBaseManager;
import Neightborhood.NeighborhoodManager;
import com.protectionapp.sd2021.dto.localization.CityDTO;

import java.util.HashSet;
import java.util.Set;

public class CityManager extends AbstractBaseManager {
    public CityManager(){super();}

    public String pathToResource = "/cities";

    // Post
    public void addCity(String name, String description){
        System.out.println("TEST POST /cities [name: "+name+", "+"descripcion: "+description+"]");
        CityDTO cityTest = new CityDTO();
        cityTest.setName(name);
        cityTest.setDescription(description);

        CityDTO response = getJerseyClient().resource(getBaseUrl()+pathToResource).entity(cityTest).post(CityDTO.class);
        System.out.println("TEST POST RESPONSE /cities  "+response.toString());
    }

    //Get by id
    public void getById(Integer id){
        NeighborhoodManager nManager = new NeighborhoodManager();
       System.out.println("TEST GET BY ID "+id);
       CityDTO cityDTO =  getJerseyClient().resource(getBaseUrl()+pathToResource+"/"+id).get(CityDTO.class);
        System.out.println("TEST GET BY ID "+ cityDTO.toString());
        System.out.println("Neighborhoods in city: ");
        System.out.println(cityDTO.getNeighborhoods());
        //cityDTO.getNeighborhoods().forEach(nID -> nManager.getById(nID).toString() );
    }


    //Put
    public void updateCity(){
        String cityName= "Asuncion";
        String newDescription = "Test descripcion";

        CityDTO cityTest = getJerseyClient().resource(getBaseUrl()+pathToResource+"/1").get(CityDTO.class);
        System.out.println("TEST PUT RESPONSE /cities  update: "+cityTest.toString());
        System.out.println("with new params: "+cityName+" "+newDescription);

        cityTest.setName(cityName);
        cityTest.setDescription(newDescription);

        CityDTO updatedCity =  getJerseyClient().resource(getBaseUrl()+pathToResource+"/2").entity(cityTest).put(CityDTO.class);
        System.out.println("TEST PUT RESPONSE /cities  "+updatedCity.toString());

    }


    // todo GET ALL
    // todo DELETE
    // todo RELATIONSHIPS DAMN
}
