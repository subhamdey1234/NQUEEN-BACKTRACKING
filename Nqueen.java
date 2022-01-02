package Nqueen;

public class Nqueen {
final int N=4;

void display(int board[][])
{
	for(int i=0;i<N;i++)
	{
		for(int j=0;j<N;j++)
		
			System.out.print(" "+board[i][j]+" ");	
		
		System.out.println();
	}
	
}
boolean issafe(int board[][],int row,int col)
{
	int i;int j;
	for(i=0;i<col;i++)
	{
		if(board[row][i]==1)
			
		
			return false;
		
	}
	for(i=row,j=col;i>=0&&j>=0;i--,j--)
	
		if(board[i][j]==1)
			
		
			return false;
		
	
	for(i=row,j=col;j>=0&&i<N;i++,j--)
		
	
		if(board[i][j]==1)
			
		
	return false;		
			
		
	
	return true;
}

boolean solve(int board[][],int col)
{
if(col>=N)
{
	return true;
}
for(int i=0;i<N;i++)
{
	if(issafe(board,i,col))
	{
		board[i][col]=1;
		
	
	
	if(solve(board,col+1)==true)
	{
		return true;
	}
	board[i][col]=0;
	}}
return false;
}
boolean solveNQ()
{
	  int board[][] = { { 0, 0, 0, 0 },
              { 0, 0, 0, 0 },
              { 0, 0, 0, 0 },
              { 0, 0, 0, 0 },  };

mirror 
System.out.print("Solution does not exist");
return false;
}
display(board);
return true;
}
public static void main(String[]args)
{
	Nqueen q=new Nqueen();
	q.solveNQ();
}

}
