import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nQueensTest
{

  @Test void solve_0(){
    nQueens nQ = new nQueens(0);
    nQ.solve();
  }

  @Test void solve_1(){
    nQueens nQ = new nQueens(1);
    nQ.solve();
  }

  @Test void solve_3(){
    nQueens nQ = new nQueens(3);
    nQ.solve();
  }

  @Test void solve_5(){
    nQueens nQ = new nQueens(5);
    nQ.solve();
  }

  @Test void solve_7(){
    nQueens nQ = new nQueens(7);
    nQ.solve();
  }

  @Test void solve_11(){
    nQueens nQ = new nQueens(11);
    nQ.solve();
  }

  @Test void solve_25(){
    nQueens nQ = new nQueens(25);
    nQ.solve();
  }
}