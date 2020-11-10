import java.util.*;

class TicTac
{
      char[] board=new char[9];
      Scanner sc=new Scanner(System.in);
      char User;
      char Opponent;

       public static void main(String args[])
       {
	  TicTac t=new TicTac();
	  char[] CreateBoard=t.CreateBoard();
	  t.Displayboard();
	  t.CheckInput();
	  t.Displayboard();

   	}
	public char[] CreateBoard()
	{

		for(int a=0;a<board.length;a++)
		{
			board[a]=' ';
		}
		return board;
	}

	public void Displayboard()
	{

			System.out.println("________||____________||__________");
			System.out.println(board[0]+""+board[1]+""+board[2]);
			System.out.println("________||____________||__________");
                        System.out.println(board[3]+""+board[4]+""+board[5]);
			System.out.println("________||____________||__________");
                        System.out.println(board[6]+""+board[7]+""+board[8]);

	}

	public void  CheckInput()
	{
		System.out.println("USER INPUT A CHARACTER \n 1.'x' 2.'o' ");
		char choice=sc.next().toUpperCase().charAt(0);
		switch(choice)
		{
		case 'X':
	        	System.out.println("User chose x so opponent will take o");
		        User='X';
			board[1]=User;
			Opponent='O';
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
