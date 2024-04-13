public class App {
    public static void main(String[] args) throws Exception {
       
        int row = 3;
        int collumn = 3;

        int[][] numbers = new int[row][collumn];

        int total = 0;
        for(int x = 0; x < row; x++){

            for(int y = 0; y < collumn; y++){
                numbers[x][y] = Integer.parseInt(Messages.enter_InputNumber());
                total = total + numbers[x][y];
            }
        }

        String results = String.format("Results:%n");
        for(int x = 0; x < row; x++){

            for( int y = 0; y < collumn; y++){
               int value = numbers[x][y];
               results = results + String.format(" %d", value);
            }
           results = results + String.format("%n");
        }

        results = results + String.format("total: %d",total);
        Messages.printrResults(results);
    }
}
