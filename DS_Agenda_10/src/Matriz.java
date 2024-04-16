public class Matriz {

        int row = 0;
        int collumn = 0;
        int[][] matriz_values;

        int total = 0;
        String results = "";

        // CONSTRUCTOR
        Matriz(int row, int collumn){
            this.setRow(row);
            this.setCollumn(collumn);
            this.setMatriz(row,collumn);
            setResults(String.format("Results:%n"));
        }

        // METHODS
        public void on(){
            enterValues();
            createText();
            showResults();
        }

        private void enterValues(){
            for(int x = 0; x < this.getRow(); x++){

                for(int y = 0; y < this.getCollumn(); y++){

                    this.setMatriz_values(x, y, (Integer.parseInt(Messages.enter_InputNumber())));
                    this.setTotal(this.getMatriz_values(x,y));
                }
            }
        }

        private void createText(){
            for(int x = 0; x < this.getRow(); x++){

                for( int y = 0; y < this.getCollumn(); y++){

                    int value = this.getMatriz_values(x, y);
                    this.setResults(String.format(" %d", value));
                }
                
                this.setResults(String.format("%n"));
            }
        }

       private void showResults(){
        setResults(String.format("total: %d",total));
        Messages.printrResults(getResults());
       }

    

    // GETTERS and SETTERS

    private int getRow() {
        return row;
    }

    private void setRow(int row) {
        this.row = row;
    }

    private int getCollumn() {
        return collumn;
    }

    private void setCollumn(int collumn) {
        this.collumn = collumn;
    }

    private void setMatriz(int row, int collumn) {
        this.matriz_values = new int[row][collumn];
    }

    private void setMatriz_values(int x, int y, int newValue){
        this.matriz_values[x][y] = newValue;
    }

    private int getMatriz_values(int x, int y){
        return this.matriz_values[x][y];
    }
    private int getTotal() {
        return total;
    }

    private void setTotal(int newValue) {
        this.total = getTotal() + newValue;
    }

    private String getResults() {
        return results;
    }

    private void setResults(String addResults) {
        this.results = this.results + addResults;
    }
}
