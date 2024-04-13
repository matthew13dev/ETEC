import java.security.SecureRandom;

public class App {
    public static void main(String[] args) throws Exception {
       
        SecureRandom random = new SecureRandom();
    
        int row = 3;
        int collumn = 3;

        int[][] numbers = new int[row][collumn];

        int total = 0;
        for(int x = 0; x < row; x++){

            for(int y = 0; y < collumn; y++){
                
                numbers[x][y] =  random.nextInt(100);
                System.out.printf("%d ",numbers[x][y]);

                total = total + numbers[x][y];
            }
            System.out.printf("%n");
        }

        System.out.printf("-------------%ntotal: %d",total);

    }
}
