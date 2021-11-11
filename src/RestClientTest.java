import City.CityManager;
import Neightborhood.NeighborhoodManager;
import User.UserManager;

public class RestClientTest {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
       // userManager.addUser();
        /*userManager.getUser();
        userManager.updateUser();*/

       CityManager cityManager = new CityManager();
      // cityManager.addCity("Encarnacion", "Test 1");
        cityManager.getById(2);
      //  cityManager.updateCity();

      NeighborhoodManager neighborhoodManager = new NeighborhoodManager();
      // neighborhoodManager.addNeighborhood("Test abrrio asuncion","test description..", 2);
      //  neighborhoodManager.addNeighborhood("San Pedro","test description..", 1);
    //    neighborhoodManager.updateNeighborhood(2);

    }
}
