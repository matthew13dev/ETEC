public class Matriz {

        int row = 0;
        int collumn = 0;
        int[][] matriz_values;
        
        int total = 0;
        String results = String.format("Results:%n");

        Matriz(int row, int collumn){
            this.row = row;
            this.collumn = collumn;
            matriz_values = new int[this.row][this.collumn];
        }

        public void on(){
            enterValues();
            createText();
            showResults();
        }

        private void enterValues(){
            for(int x = 0; x < this.row; x++){

                for(int y = 0; y < this.collumn; y++){

                    this.matriz_values[x][y] = Integer.parseInt(Messages.enter_InputNumber());
                    this.total = this.total + matriz_values[x][y];
                }
            }
        }

        private void createText(){
            for(int x = 0; x < this.row; x++){

                for( int y = 0; y < this.collumn; y++){

                    int value = this.matriz_values[x][y];
                    this.results = this.results + String.format(" %d", value);
                }
                
                results = results + String.format("%n");
            }
        }

       private void showResults(){
        this.results = this.results + String.format("total: %d",total);
        Messages.printrResults(results);
       }
}
