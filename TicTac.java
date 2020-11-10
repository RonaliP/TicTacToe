import java.util.*;

class TicTac
{
      char[] board=new char[9];
      Scanner sc=new Scanner(System.in);

       public static void main(String args[])
       {
	TicTac t=new TicTac();
	char[] CreateBoard=t.CreateBoard();
	t.CheckInput();
       }


	public char[] CreateBoard()
	{

		for(int a=0;a<board.length;a++)
		{
			board[a]=' ';
		}
		return board;
	}

	public void  CheckInput()
	{
		System.out.println("USER INPUT A CHARACTER \n 1.'x' 2.'o' ");
		char choice=sc.next().toUpperCase().charAt(0);
		switch(choice)
		{
		case 'X':
	        	System.out.println("User chose x so opponent will take o");
		        char User='X';
			char Opponent='O';
			break;
		case 'O':
			System.out.println("User chose o so opponent will take x");
			User='O';
			Opponent='X';
			break;
		default:
			System.out.println("WRONG INPUT,TRY AGAIN");
			CheckInput();
		}

	}
}
