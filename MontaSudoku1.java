/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author franc
 */
public class MontaSudoku1 {
  public static void main(String[] args) {
    final int n = 3;
    //aqui vai o numero de elementos do seu sudoku(3 vai ser um sudoku 3x3
	
    final int[][] field = new int[n*n][n*n];
	//matriz onde será armazenado o sudoku
	
    int x = (int)((Math.random()*10)%10);
    //semente aleatória para não gerar o mesmo sudoku
	for(int i = 0; i < n; i++, x++)
            for(int j = 0; j < n; j++, x+=n)
        	for(int k = 0; k < n*n; k++, x++) {
                    field[n*i+j][k] = (x % (n*n)) + 1;
                    if (k <= 8 )
				System.out.print("| " + field[n*i+j][k] + " ");
                    if (k == 8 )
				System.out.print("|\n");
                }
  }    
}
