# My Personal Project

## A subtitle

A *bulleted* list:
## Purpose:
My application will be aimed at a demographic of people that care about their local produce. A customer can look up a local store (or see stores nearby (possibly)) and see where their exports come from as well as a **sustainability rating** for that store. It is of interest to me because I think its cool and interesting idea.

- item 2
- item 3

An example of text with **bold** and *italic* fonts. 

# User stories:
- As a user I want to add a store to my "favorites" list Done
- As a user I want to lookup stores to see their rating Done
- As a user I want to filter searches based on names, countries or rating Done
- As a user I want to leave a store a rating Done
- As a user I want my account to be saved when its created so that it doesn't have to be created again (Load function)
- As a user I want my favorites list to be saved every time I add to it (Writing function)


# Structure:
- The project will have 2 main classes that everything else builds upon:
-   1. The User Class that has a list of favorite shops, nickname,    password,id
        It will have a method to add a shop to the list of favorite shops
        Possibly in the future implement a method that summarizes the shops and presents the statisitics of the user.
    2. The Shop Class that has a rating, a list of countries of imports, name, location, id.
        It will have getter methods for now as well as method for adding imports.

# The Flow of the interface:
1. The user will be presented with the following message when the program is run: "Welcome to GreenApp!" and will have the options to lookup stores, create or log in into an account. 
2. They can decide not to log in into an account but that will remove functuanality such as adding the shops to the list of favorites, or other features like changing a password.
3. They can create an account, which will add that account to the list of the existing accounts. That does not log them in, however, they will be put to the main screen again and have the same options as before.
4. They can lookup stores based on their names, their location or by inputing the minimal rating that the store needs. After they have looked up a store, they can view their import list.

In the future, the interface will add more functuonality such as pie charts, a map and more.

# Further course of action:
1. In the next phase of the project, I believe it is necessary to add newer concepts covered in class such as exceptions, which will prevent unnexpectable errors as well as refine the user experience (if user left a review they will overwrite their current one and not add a new onem etc.).
2. The main focus, however, is saving data so that the user won't have to create an account each time they run the application but just once.


# Phase 4: Task 2
Events during this session:
Sat Mar 29 19:20:26 PDT 2025
Event log cleared.
Sat Mar 29 19:20:33 PDT 2025
Created a new User: dgfd
Sat Mar 29 19:20:45 PDT 2025
Created a new User: dfgewrg

# Phase 4: Task 3
Looking at the uml design diagram, I can see some improvements I can make in the future. My first mistake was that while I was doing the project I only really focused on its functionality and did not pay enough attention to the classes relationships.

Next time, If I keep that in mind from the beggining I can focus on creating subclasses, superclasses and overall a more effective and clear implementation of the code.