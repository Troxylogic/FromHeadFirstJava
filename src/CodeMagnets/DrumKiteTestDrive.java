package CodeMagnets;



class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println("Bang bang ba-bang");

    }

    void playTopHat(){
        System.out.println("ding ding da-dading");
    }

} //end of DrumKit


public class DrumKiteTestDrive {
    public static void main(String[] args) {

        DrumKit d = new DrumKit();

        if (d.snare == true) {
            d.playSnare();
        }// end of if

        d.snare = false;

        d.playTopHat();



    }// end of main


} // end of DumKiteTestDrive
