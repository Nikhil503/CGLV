import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class TestJunitCurrentGeneration
{

	@Test
	  public void CurrentOne()
	{
			int l[][] = {{1,2}};
			Board b = new Board(3, l);
			CurrentGeneration c = new CurrentGeneration(b);
		    System.out.println("====TEST ONE EXECUTED=====");
		    Assertions.assertEquals("...\n..*\n...",c.toString());
		}
	}

