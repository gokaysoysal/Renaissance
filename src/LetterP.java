public class LetterP {
    public static void main(String[] args) {
        String[][] matris = new String[6][3];

        for (int i = 0; i<matris.length;i++){
            for (int j = 0;j<matris[i].length;j++){
                if (i==0||i==2){
                    matris[i][j]=" * ";
                } else if (j==0) {
                    matris[i][j]=" * ";                    
                } else if (i==1&&j==2) {
                    matris[i][j]=" * ";
                }else {
                    matris[i][j]= "   ";
                }
            }
        }
        for (String[] row: matris){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
