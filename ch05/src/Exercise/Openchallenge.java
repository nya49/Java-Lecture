package Exercise;

public class Openchallenge {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] b = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int[][] result = new int[2][2];

        for (int i = 0; i < a.length; i++) {

               for (int j = 0; j < b.length; j++) {

                      for(int k = 0 ; k < 3; k++)

                            result[i][j] += a[i][k] * b[k][j];
                      
                      System.out.print(result[i][j]+ " ");

               }

               System.out.println(); 

        }

	}
}
