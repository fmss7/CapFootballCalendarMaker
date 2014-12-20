package capfootballcalendarmaker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CapFootballCalendarUser {

    public static void main(String[] args) throws IOException {
        CapFootballCalendar calendar_one = new CapFootballCalendar(6);
       
        int[][][] calendar_matrix_one = calendar_one.getMatrix();
        int files = calendar_one.getFiles();
        int columns = calendar_one.getColumns();
        String[][][] calendar_matrix_of_teams = new String[files][columns][2];
        String[] teams_array = {"Gofyo", "Dharma U.", "Miguelón 2004", "Tiffosi Sport", "Paugabri", "Killomey"};
                
        for (int i = 0; i < calendar_one.getFiles(); i++) {
            for (int j = 0; j < calendar_one.getColumns(); j++) {
                for (int k = 0; k < 2; k++) {
                    switch (calendar_matrix_one[i][j][k]){
                        case 0: calendar_matrix_of_teams[i][j][k] = teams_array[(calendar_matrix_one[i][j][k])];
                        case 1: calendar_matrix_of_teams[i][j][k] = teams_array[(calendar_matrix_one[i][j][k])];
                        case 2: calendar_matrix_of_teams[i][j][k] = teams_array[(calendar_matrix_one[i][j][k])];
                        case 3: calendar_matrix_of_teams[i][j][k] = teams_array[(calendar_matrix_one[i][j][k])];
                        case 4: calendar_matrix_of_teams[i][j][k] = teams_array[(calendar_matrix_one[i][j][k])];
                        case 5: calendar_matrix_of_teams[i][j][k] = teams_array[(calendar_matrix_one[i][j][k])];
                    }
                }
            }
        }
        for (int i = 0; i < files; i++) {
            System.out.print("Jornada " + (i+1) + ": ");
            for (int j = 0; j < columns; j++) {
                System.out.print(calendar_matrix_of_teams[i][j][0] + " VS " + calendar_matrix_of_teams[i][j][1] + " || ");
            }
            System.out.println("\n");
            System.out.println("------------------------------------------------------------------------------------------");
        }
        String FileDirectory = "C:\\Users\\Francisco\\Desktop\\ejemplo.ppt";
        File archivoXLS = new File(FileDirectory);
        archivoXLS.createNewFile();
        FileOutputStream archivo = new FileOutputStream(archivoXLS);

    }
    
}
