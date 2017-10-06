import java.util.Scanner;

public class TicTacToe{

   static String won = "No one";
   
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      char[][] board = new char[3][3];
      int x,y;
      char move = 'O';
      for(char[] t:board)
         for(char e:t)
            e = ' ';

      while(stillPlaying(board, move)) {
         printBoard(board, move);
         x = in.nextInt() - 1;
         y = in.nextInt() - 1;
         
         if(checkMove(board, x, y)) {
            board[x][y] = move;
         } else {
           System.out.println("Wrong move!!! Repeat"); 
         }
         move = move == 'O' ? 'X' : 'O';
      }
      printBoard(board, move);
      System.out.println("Game over! \n" + won + " has won!");
      
   }
   
   
   public static void printBoard(char[][] board, char move) {
      System.out.print("Move:" + move + "\n");
      for(int i=0;i<3;i++) {
         for(int j=0;j<3;j++) {
            System.out.print(board[i][j]);
            if(j<2)
               System.out.print("|");
         }
         if(i<2)
            System.out.println("\n------");
      }
      System.out.println("");
   }
   
   public static boolean stillPlaying(char[][] board, char move) {
      int spaces = 0;
      
      for(char[] t:board)
         for(char e:t)
            if(e != 'O' && e != 'X')
               spaces++;
      
      if(spaces == 0)
         return false;
      
      //Rows
      if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && (board[0][0] == 'O' || board[0][0] == 'X')) {
         if(board[0][0] == 'X')
            won = "X";
         else
            won = "O";
         return false;
      }
      
      if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && (board[1][0] == 'O' || board[1][0] == 'X')){
         if(board[1][0] == 'X')
            won = "X";
         else
            won = "O";
         return false;
      }
      
      if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && (board[2][0] == 'O' || board[2][0] == 'X')){
         if(board[2][0] == 'X')
            won = "X";
         else
            won = "O";
         return false;
      }
      
      //Columns
      if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && (board[0][0] == 'O' || board[0][0] == 'X')){
         if(board[0][0] == 'X')
            won = "X";
         else
            won = "O";
         return false;
      }
      
      if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && (board[0][1] == 'O' || board[0][1] == 'X')){
         if(board[0][1] == 'X')
            won = "X";
         else
            won = "O";
         return false;
      }
      
      if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && (board[0][2] == 'O' || board[0][2] == 'X')){
         if(board[0][2] == 'X')
            won = "X";
         else
            won = "O";
         return false;
      }
      
      //Cross
      if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && (board[0][0] == 'O' || board[0][0] == 'X')){
         if(board[0][0] == 'X')
            won = "X";
         else
            won = "O";
         return false;
      }
      
      if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && (board[2][0] == 'O' || board[2][0] == 'X')){
         if(board[2][0] == 'X')
            won = "X";
         else
            won = "O";
         return false;
      }
      return true;
   }
   
   public static boolean checkMove(char[][] board, int x, int y) {
      if(x>3 || x<0 || y>3 || y<0)
         return false;
      if((int)board[x][y]!=0)
         return false;
      return true;
   }
}