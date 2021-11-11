package Neightborhood;

import Base.AbstractBaseManager;
import com.protectionapp.sd2021.dto.localization.CityDTO;
import com.protectionapp.sd2021.dto.localization.NeighborhoodDTO;

public class NeighborhoodManager extends AbstractBaseManager {
    public NeighborhoodManager(){super();}

    public String pathToResource = "/neighborhoods";

    public void addNeighborhood(String name, String description, Integer city_id){
        System.out.println("TEST POST /neighborhoods [name: "+name+", "+"descripcion: "+description+"]");
        NeighborhoodDTO nDTO = new NeighborhoodDTO();
        nDTO.setName(name);
        nDTO.setDescription(description);
        nDTO.setCity_id(city_id);
        NeighborhoodDTO response = getJerseyClient().resource(getBaseUrl()+pathToResource).entity(nDTO).post(NeighborhoodDTO.class);
        System.out.println("TEST POST RESPONSE /cities  "+response.toString());
    }

    public NeighborhoodDTO getById(Integer id){
        return  getJerseyClient().resource(getBaseUrl()+pathToResource+"/"+id).get(NeighborhoodDTO.class);
    }

    public void updateNeighborhood(Integer city_id){
        NeighborhoodDTO nDTO =  getJerseyClient().resource(getBaseUrl()+pathToResource+"/1").get(NeighborhoodDTO.class);

        System.out.println("TEST PUT /neigbourhoods/1 update: " +nDTO.toString());

        String newName = "B.San Isidro";
        String newDescription = "Test description updated!";

        nDTO.setName(newName);
        nDTO.setDescription(newDescription);
        nDTO.setCity_id(city_id);

        System.out.println("With values: "+newName+" "+newDescription+" "+ city_id);

        NeighborhoodDTO newDTO = getJerseyClient().resource(getBaseUrl()+pathToResource+"/1").entity(nDTO).put(NeighborhoodDTO.class);
        System.out.println("TEST PUT /neigbourhoods/1 update: " +nDTO.toString());

    }
}
