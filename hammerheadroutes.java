import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

class Main {

    public static void main(String[] args) {

      class User {

        int userInt = 71;

      }

      class Service {

        boolean strava = false;
        boolean rwgps = true;
        boolean komoot = true;

      }

      class Strava {
      
          String serviceName = "Strava";
          String[] stringArray = new String[] {"SRT", "CVT", "Perkiomen"};
      
      }
      
      class RWGPS {

          String serviceName = "RWGPS";
          String[] stringArray_RWGPS = new String[] {"CVT", "Perkiomen", "Welsh Mountain"};
      
      }
      
      class Komoot {

          String serviceName = "Komoot";
          String[] stringArray_Komoot = new String[] {"SRT", "Welsh Mountain", "Oaks to Philly"};
      
      }

      User user = new User();
      Service service = new Service();
      Strava strava = new Strava();
      RWGPS rwgps = new RWGPS();
      Komoot komoot = new Komoot();
        
      List<String> list_AllRoutes = new ArrayList<>();
      Collections.addAll(list_AllRoutes,strava.stringArray);
      Collections.addAll(list_AllRoutes,rwgps.stringArray_RWGPS);
      Collections.addAll(list_AllRoutes,komoot.stringArray_Komoot);
      String[] stringArray_AllRoutes = list_AllRoutes.toArray(new String[list_AllRoutes.size()]);

      ArrayList<String> arrayList_Routes = new ArrayList<String>();
      arrayList_Routes.addAll(Arrays.asList(stringArray_AllRoutes));
      System.out.println("All Routes: " + arrayList_Routes);

      String[] stringArray_UniqueRoutes = stringArray_AllRoutes.clone();
      ArrayList<String> arrayList_UniqueRoutes = new ArrayList<String>();
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
      linkedHashSet.addAll(Arrays.asList(stringArray_UniqueRoutes));
      arrayList_UniqueRoutes.addAll(linkedHashSet);
      System.out.println("Unique Routes: " + arrayList_UniqueRoutes);

      for (int i = 0; i < strava.stringArray.length; i++) {
            String stringBuilder = user.userInt +
                    strava.stringArray[i];
            strava.stringArray[i] = stringBuilder;
      }
      for (int i=0; i < rwgps.stringArray_RWGPS.length; i++) {
            String stringBuilder = rwgps.stringArray_RWGPS[i] +
                    user.userInt;
            rwgps.stringArray_RWGPS[i] = stringBuilder;
      }
      for (int i=0; i < komoot.stringArray_Komoot.length; i++) {
            String stringBuilder = user.userInt +
                    komoot.stringArray_Komoot[i] +
                    user.userInt;
            komoot.stringArray_Komoot[i] = stringBuilder;
      }
      String[] stringArray_StravaUserRoutes = strava.stringArray;
      String[] stringArray_RWGPSUserRoutes = rwgps.stringArray_RWGPS;
      String[] stringArray_KomootUserRoutes = komoot.stringArray_Komoot;
      list_AllRoutes = new ArrayList<>();
      Collections.addAll(list_AllRoutes,stringArray_StravaUserRoutes);
      Collections.addAll(list_AllRoutes,stringArray_RWGPSUserRoutes);
      Collections.addAll(list_AllRoutes,stringArray_KomootUserRoutes);
      stringArray_AllRoutes = list_AllRoutes.toArray(new String[list_AllRoutes.size()]);
      arrayList_Routes = new ArrayList<String>();
      arrayList_Routes.addAll(Arrays.asList(stringArray_AllRoutes));
      System.out.println("For User " + user.userInt + ": " + arrayList_Routes);

      List<String> list_Services = new ArrayList<>();

      List<String> list_UserRoutesByService = new ArrayList<>();

      if (service.strava) {

          list_Services.add(strava.serviceName);
          for (int i = 0; i < strava.stringArray.length; i++) {
            String stringBuilder = user.userInt +
                    strava.stringArray[i];
            strava.stringArray[i] = stringBuilder;
          }
          stringArray_StravaUserRoutes = strava.stringArray;
          Collections.addAll(list_UserRoutesByService,stringArray_StravaUserRoutes);

      }

      if (service.rwgps) {

          list_Services.add(rwgps.serviceName);
          for (int i=0; i < rwgps.stringArray_RWGPS.length; i++) {
            String stringBuilder = rwgps.stringArray_RWGPS[i] +
                    user.userInt;
            rwgps.stringArray_RWGPS[i] = stringBuilder;
          }
          stringArray_RWGPSUserRoutes =  rwgps.stringArray_RWGPS;
          Collections.addAll(list_UserRoutesByService,stringArray_RWGPSUserRoutes);

      }

      if (service.komoot) {

          list_Services.add(komoot.serviceName);
          for (int i=0; i < komoot.stringArray_Komoot.length; i++) {
            String stringBuilder = user.userInt +
                    komoot.stringArray_Komoot[i] +
                    user.userInt;
            komoot.stringArray_Komoot[i] = stringBuilder;
          }
          stringArray_KomootUserRoutes = komoot.stringArray_Komoot;
          Collections.addAll(list_UserRoutesByService,stringArray_KomootUserRoutes);

      }

      String[] stringArray_UserRoutesByService = list_UserRoutesByService.toArray(new String[list_UserRoutesByService.size()]);

      arrayList_Routes = new ArrayList<String>();
      arrayList_Routes.addAll(Arrays.asList(stringArray_UserRoutesByService));

      System.out.println("For User " + user.userInt + " Services: " + list_Services + ": " + list_UserRoutesByService);

    }

}


