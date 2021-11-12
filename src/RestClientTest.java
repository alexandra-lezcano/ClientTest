import City.CityManager;
import Neightborhood.NeighborhoodManager;
import User.UserManager;

public class RestClientTest {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();



      CityManager cityManager = new CityManager();



    NeighborhoodManager neighborhoodManager = new NeighborhoodManager();

        cityManager.addCity("Encarnacion", "Test 1");
        cityManager.addCity("Ciudad2", "Test 2");
        // cityManager.getById(2);
        // cityManager.updateCity();

        neighborhoodManager.addNeighborhood("Barrio1","test description..", 1);
        neighborhoodManager.addNeighborhood("Barrio2","test description..", 1);
        //  neighborhoodManager.addNeighborhood("San Pedro","test description..", 1);
        //  neighborhoodManager.updateNeighborhood(2);

        userManager.addUser();
         //userManager.getUser();
        // userManager.updateUser();
        //userManager.deleteUser(1);
    }
}
