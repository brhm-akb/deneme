package navigasyon;
public class Navigasyon {
    public static void main(String[] args) {
        int yol[][]={{1,1,0,0,0},{0,1,1,0,0},{0,0,1,1,0},{0,0,0,1,1}};
        cikti(yol);
    }
    public static void cikti(int yol[][]){
        for (int i = 0; i < yol.length; i++) {
            for (int j = 0; j < yol[0].length; j++) {
                if(yol[i][j]==1){
                    System.out.print(i+""+j+" ");
                }
            }
        }
        System.out.println(" ");
    }
}
