# My Personal Project


## Purpose:
My application will be aimed at an middle-upper/upper class of workers. It is aimed at people who have enough energy and time to take a step toward a healthier life, but feel like its a bit overwhelming to do so. To do research, downoloading multiple apps and just generally starting a revised version of a meal plan can take a lot of thought and energy out of a person, leaving them burned out before they even start.

The purpose of this product aims at seamlessly incorporating the app into our life, without taking too much energy and effort of our customer. To provide resources such as diet plan (meal recipes), where to buy them, a calorie tracker and statistic on progress. To make the process more engaging I could also add a system of minigames based on tasks and a friend system.

### However, it is important to note that while these features seem cool, if done without balance or intent to fit the client they can backfire and overwhelm the client. Sometimes it is better to do few features but make them good. For now, it is better to build a project by steps and see how the features incorporate with eachother and adapt on the go.

A customer can look up a local store (or see stores nearby (possibly)) and see where their exports come from as well as a sustainability rating for that store.


# Structure:
- The project will have 2 main classes that everything else builds upon:
-   1. The User Class that has a list of favorite shops, nickname,    password,id
        It will have a method to add a shop to the list of favorite shops
        Possibly in the future implement a method that summarizes the shops and presents the statisitics of the user.
    2. The Shop Class that has a rating, a list of countries of imports, name, location, id.
        It will have getter methods for now as well as method for adding imports.

    3. The Milestone Class has a title, rarity (0-100%), status, image, condition, user.
        It took me some thinking to realize which way I would want to implement my Milestone class. Each milestone could fall in certain groups but have a different user (since we need one milestone tied to one user), so I thought it would make sense to create general interfaces for each type of milestone. The conflict was that I wanted to have milestones check themselves based on their condition and what the user achieved so far, so it would be easier to update milestones down the line. That is why, for now, I decided to have just one single class for Milestone and create each one. If, however, further down the line I'll realize that Milestones behave way different and their condition satisfaction coul not be fit into one method, it would be best to create a more abstract structure.
       Edit: in the end, for now I figured it would be best to just have one class and track their behaviour when checking the condition through a seperate field "type". As much as I wanted to implement more abstract structure for less fog, I feel like this approach would make it redundant.
       
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
