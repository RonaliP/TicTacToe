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
	  t.play();

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

			System.out.println("_||_||_");
			System.out.println(board[0]+"  "+board[1]+"   "+board[2]);
			System.out.println("_||_||_");
                        System.out.println(board[3]+"  "+board[4]+"  "+board[5]);
			System.out.println("_||_||_");
                        System.out.println(board[6]+"  "+board[7]+"  "+board[8]);

	}

	public void  CheckInput()
	{
		System.out.println("USER INPUT A CHARACTER \n 'x' OR 'o' ");
		char choice=sc.next().toUpperCase().charAt(0);
		switch(choice)
		{
		case 'X':
	        	System.out.println("User chose x so opponent will take o");
		        User='X';
			//board[1]=User;
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

	public void play()

	{
	    System.out.println("HEY USER CHOOSE A POSITION from 1-9");
	    int choice=sc.nextInt();
	    if(choice<9)
	    {
	          if(board[choice]==' ')
	          {
		    board[choice]=User;
		    Displayboard();
		  }
	          else
		    System.out.println("WRONG MOVE");
	            System.out.println("TRY ANOTHER POSITION");
                    play();

	    }
	else
		System.out.println("WRONG INPUT,GAME BOARD HAS ONLY 9 CELLS");
	}

}
