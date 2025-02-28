# Connect Four

---

## Overview

The connect four game is a six row by seven column column grid game played by two people, with each player having a piece that represents their moves. The game is won when the same pieces are aligned either horizontally, vertically, or diagonally. This java program follows the rules of the connect four program and allows user to make moves on the grid by asking and validating their input.


  
## Input

  The Scanner class is imported to read user input

```java
import java.util.Scanner;

Scanner scnr = new Scanner(System.in);
int positon
```

### OUTPUT

This is how the program is displayed on the console
```
Welcome to Connect Four!

  

0 1 2 3 4 5 6

---------------

| | | | | | | |

| | | | | | | |

| | | | | | | |

| | | | | | | |

| | | | | | | |

| | | | | | | |

---------------

Player X enter a number(0-6):

```

  

## Features

  

- The Scanner class and the InputMismatchException class
```java
import java.util.Scanner;
import java.util.InputMismatchException;
```

- Creation of methods
```java
public void displayBoard() {}
public ConnectFour() {}
public boolean makeMove(int column) {}
public boolean checkWinner() {}
public boolean isBoardFull() {}
public char switchPlayer() {}

```

- Conditional statements, Loops, Arrays and try and catch blocks
```java
if(......) {

}
while (......) {}
public char[][] board;
try {
	.........
}
catch (InputMismatchException e){
	System.out.prinln("Enter a valid data type(number)!");
}
```

  

## Technology Used

  

- Java Development Kit


## Author

- Adwoa Addai
- Email: [addaia@g.cofc.edu]
  
  

## License

  

This project is licensed under the MIT [License](License) - see the LICENSE file for details.

  


