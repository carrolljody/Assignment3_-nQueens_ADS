public class nQueens
{
  private int[][] board;
  private int n;
  private int column;
  private int row;

  public nQueens(int n)
  {
    this.n = n;
    this.board = new int[n][n];
    this.column = 0;
    this.row = 0;
  }

  public void solve()
  {
    //check for validity
    if(placeQueen(column))
    printBoard();
  }

  public boolean placeQueen(int currentColumn)
  {
    if (n <= 3)
    {
      System.out.println("n must be greater than 3");
      return false;
    }

    if (currentColumn >= n/*all queens placed*/)
    {
      //return result
      return true;
    }
    else
    {
      for (int currentRow = 0; currentRow < n; currentRow++)
      {
        if(OK(currentRow, currentColumn)/*check placement*/)
        {
          //place queen starting at column 0
          board[currentRow][currentColumn] = 1;
          //Recursive call
          if(placeQueen(currentColumn + 1))
          {
            return true;
          }
          //remove queen if necessary
          board[currentRow][currentColumn] = 0;
        }
      }
    }
    return false;
  }

  public boolean OK(int currentRow, int currentColumn)
  {
    //Scan row
    for (int i = 0; i < currentColumn; i++)
    {
      if (board[currentRow][i] == 1)
      {
        return false;
      }
    }
    //Scan diagonal
    for (int ii = currentRow, jj = currentColumn; ii >= 0 && jj >= 0; ii--, jj--)
    {
      if (board[ii][jj] == 1)
      {
        return false;
      }
    }
    //Scan diagonal
    for (int iii = currentRow, jjj = currentColumn; jjj >= 0 && iii < n; iii++, jjj--)
    {
      if (board[iii][jjj] == 1)
      {
        return false;
      }
    }
    return true;
  }

  public void printBoard()
  {
    //print column
    for (int i = 0; i < n; i++)
    {
      //print row
      for (int j = 0; j < n; j++)
      {
        if(board[i][j] == 0)
        {
          //print 0s in blue
          System.out.print("\u001B[34m " + board[i][j] + "\u001B[34m ");
        } else{
          //print 1s in red
          System.out.print("\u001B[31m " + board[i][j] + " \u001B[31m");

        }
      }
      //new line
      System.out.println();
    }
  }

  public static void main(String[] args)
  {
    nQueens nQ = new nQueens(29);
    nQ.solve();
  }
}
