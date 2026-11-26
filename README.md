README
(updated 11/26/2026)

# Object-Oriented Programming Team Project | Battle for the Kingdom

## Project Overview

Brief description of the program

## Team Members  

- Marina  
- Audrey  
- Swan  
- Kyle  
- Francisco  
- Jason  

The following is a generalized list of contributions from each student. It was very common for us to error check each other's code, resolve any outstanding issues, implement helper functions for each other, etc. 

| Name | Primary Contributions |
|---|---| 
| Marina | |
| Audrey | |
| Swan | |
| Kyle | |
| Francisco | |
| Jason | |


## Features  

Here is a list of some notable features:

- 
- 
- 

## Class Design  

Some of the more prominent classes used in the program are listed below. 

| Class | Responsibility |
|---|---| 
| | |
| | |
| | |
| | |
| | |
| | |
| | |
| | |
| | |


## Packages

Our package layout closely follows what was recommended by our previous project's guide. 

- App: Includes the `Main.java` file
- Model: Holds all of the class files, object data. 
- Service: Holds the class management files.

## Building  

This specific project was built entirely in VS Code using that program's recommended Java extensions and add-ons, including a JDK. Note that an in-program pdf viewer is required to observe the project's UML diagram.  


## Running  

The program is run through a console menu user-interface; the following are options the user can select when presented with the main menu. Note that some of these options will prompt for additional information from the user.

| # | Option | Description |
|---|---|---|
| 1 | | |
| 2 | | |
| 3 | | |
| 4 | | |
| 5 | | |
| 6 | | |
| 0 | Exit | Terminates the program. |

## Notable Design Decisions and Feedback

Some miscellaneous notes:

- 
- 
- 

## Known Limitations  

- 
- 
- 

Thanks for reading!  


# Bonus Space for Brainstorm Notes

Nothing here is final and is open to revisions; suggestions welcome!  

Some general important classes that spring to mind:
- A Battlefield class to represent the 2D board, similar to Project 2's warehouse grid.
  - It may include an abstract tile class again, with the ability to add or alter tiles if needed. The more modular, the better!
  - Each tile checks for traversability and line-of-sight (the latter is important for ranged unit skills).

- An abstract Unit / Character class
  - Warrior, Archer, and Mage may be derived subclasses.
  - It might hold information about a unit's hit points, movement points, attack strength, special skills, item inventory, etc.
      - Special skills can be an inherent part of the abstract Character class, or we can develop our own abstract Special Skills class to place            into it as a private data member.
      - Item inventory can be modeled as an ArrayList, making it easy to trade items between characters using ArrayList functions.

- A Player class to bundle all units, abilities, and possibly items together.
  - Holds specific instances of each unit character as private members.

- A way to keep track of turns
  - Each player is afforded one character move and one attack / special ability use per turn.
    - We can implement a class that acts like a counter, like movesLeft = 1 and attacksLeft = 1, then decrements accordingly after any move or             action is used. This might fit inside a Player class or Simulation class, for example. 
   
- A Simulation class that helps run the game
  - Might include turn checks, attack damage allocation, item use effects, movement, etc.

- A Movement class
  - Checks for valid unit pathing.
  - Total movement points should be modular and assigned by the Character class depending on the unit (ie Warrior moves 1 space, Archer moves 3)
 
- A Main Menu class
  - An example basic main menu:

| Main Menu |
|---        |
| Warrior   |
| Archer    |
| Mage      |
|           |
| End Turn  |
| Save      |
| Exit      |  

  - We could also show infographics about the current player, available units' current statistics like current HP / Max HP, and more.
  - Offers the player a series of commands, like 'Action', 'Move', 'Attack', 'Defend', or 'Use Item'
  - Could create a nested menu. For example, say we wanted to perform an action with our mage:

| Main Menu | Submenu 1  | Submenu 2                     |
|---        |---         |---                            |
| Warrior   |            |                               |
| Archer    |            |                               |
| >> Mage   | Move       | Move to coordinates           |
|           | Attack     | Attack coordinates            |
|           | Special    | Attack coordinates            |
|           | Defend     |                               |
|           | Use Item   | [Select item type from list]  |
|           | Trade Item | Trade with adjacent target    |
| End Turn  |            |                               |
| Save      |            |                               |
| Exit      |            |                               |

More to be added later...
