package battleShips;

import java.util.ArrayList;



public class dotCom{

    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }
    public String checkYourself(String userInput) {
        String result = "Miss";

        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";

            } else {
                result = "hit";

            }
        }

        return result;
    } // close method

}
