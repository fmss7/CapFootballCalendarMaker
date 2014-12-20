package capfootballcalendarmaker;

class CapFootballCalendar {

    int[][][] matrix;
    int teams;
    int files;
    int columns;
    

    public CapFootballCalendar(int teams) {
        this.teams = teams;
        files = this.teams-1;
        columns = this.teams/2;
        
        matrix = new int[teams - 1][teams / 2][2];
        int begin_odds = teams / 2;
        int evens;
        int odds = begin_odds;
        
        for (int i = 0; i < teams - 1; i++) {
            if (i % 2 == 0) {
                matrix[i][0][0] = i / 2;
                matrix[i][0][1] = teams - 1;
            } else {
                matrix[i][0][0] = teams - 1;
                matrix[i][0][1] = odds++;
            }
        }

        for (int i = 0; i < teams - 1; i++) {
            evens = i / 2 + 1;
            if (evens == teams - 1) {
                evens = 0;
            }

            odds = i / 2 + 1 + begin_odds;
            if (odds == teams - 1) {
                odds = 0;
            }

            for (int j = 1; j < teams / 2; j++) {
                if (evens == teams - 1) {
                    evens = 0;
                }
                if (odds == teams - 1) {
                    odds = 0;
                }

                if (i % 2 == 0) { //pares ida 
                    matrix[i][j][0] = evens;
                } else {  //impares ida
                    matrix[i][j][0] = odds;
                }
                evens++;
                odds++;
            }

            for (int j = teams / 2 - 1; j > 0; j--) {
                if (evens == teams - 1) {
                    evens = 0;
                }
                if (odds == teams - 1) {
                    odds = 0;
                }
                if (i % 2 == 0) { //pares vuelta
                    matrix[i][j][1] = evens;
                } else {  //impares vuelta
                    if (odds == teams - 1) {
                        odds = 0;
                    }
                    matrix[i][j][1] = odds;
                }
                evens++;
                odds++;
            }
        }
    }

    public int[][][] getMatrix() {
        return matrix;
    }

    public int getTeams() {
        return teams;
    }

    public int getFiles() {
        return files;
    }

    public int getColumns() {
        return columns;
    }
    

}
