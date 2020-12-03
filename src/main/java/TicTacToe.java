public class TicTacToe {

    private int[][] table = new int[3][3];
    private int currentPlayerNumber = 1;
    private int winnerNumber = 0;
    private boolean isGameEnded = false;
    private boolean isTableFull = false;



    public void place(int row, int col) throws Exception {
        do {
            try {
                if (table[row][col] == 0) {
                    table[row][col] = currentPlayerNumber;
                } else if (isGameEnded) {
                    gameEnded();
                } else if (table[row][col] != 0) {
                    System.out.println("The cell is already occupied - try again!");
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Invalid row/column position - try again!");
            }

            if (isPlayerWon()) {
                System.out.println("Player " + currentPlayerNumber + " won!!!");
                winnerNumber = currentPlayerNumber;
            } else {
                getNextPlayer();
            }

        } while (!this.isGameEnded);
    }

    public boolean gameEnded() {
        return this.isGameEnded;
    }



    public int getNextPlayer() {
        if (isGameEnded) {
            gameEnded();
        } else if (currentPlayerNumber == 1) {
            currentPlayerNumber = 2;
        } else if (currentPlayerNumber == 2) {
            currentPlayerNumber = 1;
        }
        return currentPlayerNumber;
    }
    public int getCellContent(int row, int col) {
        return table[row][col];
    }
    public int[][] getTable() {
        int[][] copyTable = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                copyTable[row][col] = table[row][col];
            }
        }
        return table;
    }
    public int getWinnerNumber() {
        return winnerNumber;
    }


    private boolean isTableFull() {
        for (int row = 0; row < table[row][0]; row++) {
            for (int col = 0; row < table[row][col]; row++) {
                if (table[row][col] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isPlayerWon () {
        for (int row = 0; row < 3; row++) {
            if (isRowMatched(currentPlayerNumber, row)){
                return true;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (isColMatched(currentPlayerNumber, col)){
                return true;
            }
        }
        if (isDiagonalMatched(currentPlayerNumber)) {
            return true;
        }
        return false;
    }

    private boolean isRowMatched(int currentPlayerNumber, int row) {
        for (int i = 0; i < 3; i++){
            if (table[row][i] != currentPlayerNumber){
                return false;
            }
        }
        return true;
    }

    private boolean isColMatched(int currentPlayerNumber, int col) {
        for (int i = 0; i < 3; i++){
            if (table[i][col] != currentPlayerNumber){
                return false;
            }
        }
        return true;
    }

    private boolean isDiagonalMatched(int currentPlayerNumber) {
        if (table[0][0] == currentPlayerNumber && table[1][1] == currentPlayerNumber && table[2][2] == currentPlayerNumber) {
            return true;
        }
        if (table[2][0] == currentPlayerNumber && table[1][1] == currentPlayerNumber && table[0][2] == currentPlayerNumber){
            return true;
        }
        return false;
    }


    /*
    Feladata, a kozismert tictactoe jatek szabalyainak es a jatek menet allapotainak kezelese.
    Nem ir ki semmit, nem rajzol ki semmit az egy masik osztaly feladata. Ez csak maganak a jateknak a mukodeset encapsulalja.
    A kirajzolast masik osztaly vegzi a getTable() metods alapjan. A jatek menetet (jatekosoktol bekerni hova akarnak rakni, stb) is masik osztaly vegzi.

    Metodusok:
    //getNextPlayer(): int -> megmondja ki a kovetkezo jatekos 1, 2. Hibat dob ha a jatek veget ert.
    //place(int row, int col): void -> az aktualis jatekos megjelol egy mezot. Ellenoriznie kell, hogy meg szabad-e az adott mezo.
        //Hibat dob, ha mar veget ert a jatek, vagy ha az adott mezo mar foglalt
    //isGameEnded(): boolean -> true ertekkel ter vissza, ha mar veget ert a jatek, es false-al ha meg tart
    getWinner(): int -> megmondja ki nyert. 1es vagy 2es jaekos, vagy 0-t ad vissza, ha dontetlen. Hibat dob ha meg nem ert veget a jatek
    getCellContent(int row, int col): int -> megmondja, hogy egy adott cellaban mi van. 1: 1es jatekos rakott oda, 2: 2-es jatekos rakott oda, 0: ures cella
    getTable(): int[][] -> visszaadja a 3x3-as tablank allapotat ketdimenzios tombben. 0: ures mezo, 1: 1es jatekos mezoje, 2: 2es jatekos mezoje
     */
}
