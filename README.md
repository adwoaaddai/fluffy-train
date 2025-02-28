# Connect Four

---

## Description

The connect four game is a six row by seven column column grid game played by two people, with each player having a piece that represents their moves. The game is won when the same pieces are aligned either horizontally, vertically, or diagonally. This java program follows the rules of the connect four program and allows user to make moves on the grid by asking and validating their input.

  

## Table of Contents

- [Installation](#installation)

- [Input](#input)

- [Output](#Output)

- [Features](#features)

- [Technology Used](#technologies-used)

- [License](#license)

- [Contact](#contact)

  

## Installation

1. Clone the repository:

```sh

git clone https://github.com/yourusername/project-name.git

```

  

1. Navigate to the project directory:

```sh

cd project-name

```

1. Install dependencies (if applicable):

```sh

pip install -r requirements.txt # For Python

npm install # For Node.js

```

  

## Input

  The Scanner class is imported to read user input

```java
import java.util.Scanner;

Scanner scnr = new Scanner(System.in);
int positon
```

### OUTPUT

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

  

- importation of the Scanner class and the InputMismatchException class
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
	e.printStackTrace();
}
```

  

## Technologies Used

  

- Java Development Kit
  
  

## License

  

This project is licensed under the MIT [License] - see the LICENSE file for details.

  

## Contact

  

- GitHub: [@adwoaaddai](https://github.com/adwoaaddai)

- Email: [addaia@g.cofc.edu]
