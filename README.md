# Inventory-Management-System
We are building a generic inventory system, for our project, that could be used for any business. 
The system can be customized for, or by, a business to suit their specific type of inventory.
It can help to manage a business’ stock by keeping track of all inventory on hand,
the rate at which the inventory is reduced,and suggested dates to reorder new stock.
This allows the system to send alerts to warn of low inventory or reminders to place an order with a product vendor. 
Alerts can also be generated to warn of vendor changes such as price changes or new products added. 
The user can select specific inventory to generate an order to send out to product vendors and they can also generate reports with any pertinent information that the system stores about the inventory.

# LIST OF API FOR THE INDIVIDUAL PROJECT
1. I have implemented the google translate api using the google apps script so the translate method translates the keywords of the low products list page and returns a string of translated keywords. 
2. I have also implemented the iTextpdf api library so the report method produces a pdf with the list of products at a designated directory. 

# WHAT THE TEAM DID LAST TIME
1. We migrated from the fileserver system to mySQL(Library) database to store the products
2. In addition to the previous classes, we added two classes: Supplier class, User class and supply class
3. We used the commons apache email library to send alerts to Users about products that are low in inventory
4. We used the java preferences library to store the database connection credentials
5. We created a graphical user interface using java swing library
6. We used the java time library to calculate the rate at which products are moving. This helps determine which stocks are moving fast and recalibrate what we will order next time
7. We also generated reports for specific queries which we can send to vendors if need be

# WHAT I HAVE DONE THIS ITERATION
1. I have implemented 2 public apis to allow the system to:
    - translate the low products list into any language the user chooses 
    - Produce a pdf that includes the product list
2. To implenment the above, I have added a method on db that returns String of the list of products in the system
3. I have also added 3 methods on lowlist 
    - translate() that returns string of the translated word
    - trans() that opens a new window so the user can enter the language to be translated to
    - set() that opens another window with the translated product list 
4. I have also added a report() method on Look.java so it produces a pdf. 

# Setting up the database
1. Download docker desktop
2. Download visual studio code
3. Open your terminal and navigate it to the COSC 310 folder in you local repository of the project
4. Run the command: docker-compose up -d
 If everything is successful, the MySQL database will start on port 3306. If there is a port conflict, change the port to 3307 in the docker-compose.yml file in the COSC 310 folder
5. Run the command: docker exec -it inventorySystem-mysql bash
6. Run the command: mysql -u team22 -p
    The password is in the docker-compose.yml file
7. Enter password(The password is in the docker-compose.yml file)
If successful
Open VS code and create a connection to the database using the username and password from the docker-compose.yml file

# HOW TO COMPILE AND RUN THE PROGRAM
1. Clone the repository to your computer
2. Import the files in the repository as a project in you IDE that supports java preferebly VS CODE/eclipse
3. Open the COSC 310 Folder
4. Open the src folder
5. Open the proj folder
6. Run the java files in the proj folder. The program should execute

# README 2
1. I have added a translate button on the Lowlist page
<img width="1200" alt="Screen Shot" src="https://github.com/kokoroimafuku/Inventory-Management-System-individual/blob/6abc13958c59f0c3cbbd189d23efdcd22c224b08/Screen%20Shot%202022-12-05%20at%203.37.25%20PM.png">

2. When translate is pressed, new window will open that asks the user to input language 
<img width="1200" alt="Screen Shot" src="https://github.com/kokoroimafuku/Inventory-Management-System-individual/blob/b4432b06e958aade537a0c0b02c5956d98ead9ad/Screen%20Shot%202022-12-05%20at%203.37.36%20PM.png">
<img width="1200" alt="Screen Shot" src="https://github.com/kokoroimafuku/Inventory-Management-System-individual/blob/b4432b06e958aade537a0c0b02c5956d98ead9ad/Screen%20Shot%202022-12-05%20at%203.37.48%20PM.png">

3.When return in pressed, the page will be translated .
<img width="1200" alt="Screen Shot" src="https://github.com/kokoroimafuku/Inventory-Management-System-individual/blob/b4432b06e958aade537a0c0b02c5956d98ead9ad/Screen%20Shot%202022-12-05%20at%203.38.03%20PM.png">

4. I have added a Produce Report button on the List page
<img width="1200" alt="Screen Shot" src="https://github.com/kokoroimafuku/Inventory-Management-System-individual/blob/04898b366c00512dafb9aea4b38cd464f1f8d00a/Screen%20Shot%202022-12-05%20at%204.02.06%20PM.png">

5. When the produce report button is pressed, a pdf document is created in the designated place with the list of products in the inventory 
<img width="1200" alt="Screen Shot" src="https://github.com/kokoroimafuku/Inventory-Management-System-individual/blob/04898b366c00512dafb9aea4b38cd464f1f8d00a/Screen%20Shot%202022-12-05%20at%204.02.40%20PM.png">
<img width="1200" alt="Screen Shot" src="https://github.com/kokoroimafuku/Inventory-Management-System-individual/blob/04898b366c00512dafb9aea4b38cd464f1f8d00a/Screen%20Shot%202022-12-05%20at%204.13.26%20PM.png">
<img width="1200" alt="Screen Shot" src="https://github.com/kokoroimafuku/Inventory-Management-System-individual/blob/04898b366c00512dafb9aea4b38cd464f1f8d00a/Screen%20Shot%202022-12-05%20at%204.13.34%20PM.png">

