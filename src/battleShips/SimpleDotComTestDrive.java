package battleShips;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper Helper = new GameHelper();

        int randonNum = (int)(Math.random()* 5);

        int[] locations = {randonNum, randonNum + 1, randonNum + 2};

        SimpleDotCom dotcom = new SimpleDotCom();

        dotcom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String guess = Helper.getUserInput("Enter a number");
            String result = dotcom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("you took" + numOfGuesses + "guesses");
            }
        }




    }
}


