import java.util.*;

class TicTac{

       public static void main(String args[])
       {

	char[] board=CreateBoard();


       }


	public static void CreateBoard()
	{
         	char[] board=new char[9];
		for(int a=0;a<board.length;a++)
		{
			board[a]=' ';
		}
	}
}
