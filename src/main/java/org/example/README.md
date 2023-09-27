# Snap Java game

Welcome to my Snap Java game! This project is a simple implementation of the classic snap game in the Java
console. It's a great way to practice your Java programming skills while having fun.

## Table of Contents

- [How to Play](#how-to-play)
- [Game Features](#game-features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [About Me](#about-me)

## How to Play

1. Clone or download this repository to your local machine.

2. Open the project in your favorite Java development environment (e.g., IntelliJ IDEA, Eclipse, or any other).

3. Run the `Main` class to start the game.

4. Follow the on-screen instructions to play the game. Here's a brief overview of the gameplay:

- You start by designating the names of player 1 and player 2
- You take it in turns to press enter, pulling a new card from the deck each time
- When the previous card matches the current you have 5 seconds to type snap in order to win the point
- When one player successfully "snaps", the game is over

## Game Features

- Classic Snap gameplay.
- Interactive console interface.
- Randomly generated deck.
- Clear instructions for new players.

## Project Structure

This project implements a simple card game and consists of several Java classes organized in a structured manner. Here's
an overview of the project's structure:

### `org.example` Package

This package contains the core classes of the card game project.

- `CardGame`: An abstract class representing the base functionality of card games. Specific card games can extend this
  class to implement their unique rules and gameplay. It includes methods for dealing, sorting, and shuffling cards.

- `Card`: An enum representing playing cards with suits, string values, and integer values.

- `Player`: Represents a player in the card game, including their name and score.

- `Snap`: Extends `CardGame` and adds specific logic for playing the "Snap" game.

## Object-Oriented Programming (OOP) Concepts

This project demonstrates various OOP concepts, including:

### Encapsulation

Encapsulation is the concept of bundling data (attributes) and methods (functions) that operate on that data into a
single unit called a class. It helps in controlling access to the data and ensures that the internal state of an object
remains consistent.

Example:

```java
// Player class encapsulates the name and score attributes
public class Player {
    private String name;
    private int score;

    // Getter and setter methods provide controlled access to attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ...
}
```

### Inheritance

Inheritance allows a new class (subclass or derived class) to inherit properties and behavior from an existing class (
superclass or base class). It promotes code reuse and supports the "is-a" relationship.

Example:

```java
// Snap class extends CardGame to inherit its functionality
public class Snap extends CardGame {
    // Additional methods and behavior specific to the Snap game
    // ...
}
```

### Polymorphism

Polymorphism allows objects of different classes to be treated as objects of a common superclass. It supports method
overriding and dynamic method dispatch, enabling flexibility in method implementation.

Example:

```java
// Polymorphism: currentPlayer can refer to objects of Player class
Player currentPlayer=player1;
        currentPlayer.incrementScore();
```

### Abstraction

Abstraction involves simplifying complex systems by modeling classes with essential attributes and methods while hiding
unnecessary details. It focuses on what an object does rather than how it does it.

Example:

```java
// CardGame class abstracts the operations related to a deck of cards
public abstract class CardGame {
    // Methods for dealing, sorting, and shuffling cards
    // ...
}
```

## Getting Started

To run the game on your local machine, follow these steps:

1. Clone the repository to your computer using Git or download it as a ZIP file.

2. Open the project in your Java development environment (e.g., IntelliJ IDEA, Eclipse, or any other).

3. Run the `Main` class to start the game in the console.

4. Follow the on-screen instructions to play the game.

## About-Me

I am a Junior Software Developer on the \_nology program, a comprehensive course that has transformed me into a
full-stack developer. With a passion for creating accessible and user-centric software, I am dedicated to crafting
innovative solutions that address real-world challenges. Through continuous learning and hands-on experience, I am
excited to contribute my skills to the tech industry and create meaningful impact.

