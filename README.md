# **Unit Testing**
------------
****

Lab Exercise in witch we will create some classes
with unit test methods. The idea is to get familiar with Unit Testing.

_Code will be in Java_

_Unit Testing Framework is Maven Repository- Junit 4.12_

**_:hand: You should know that :bank: BankAccount and BankAccountTest are created and used 
by us. They are not included below._**
***************
----------

## **Test Axe**

In **test/java folder**, **create** a package called **rpg_tests**

Create a **class AxeTests**

Create the following tests:
-	Test if weapon loses durability after each attack
-	Test attacking with a broken weapon

**Solution**

Create the new package rpg_tests and inside create the class AxeTests

## **Refactor Tests**
   Refactor the tests for Axe and Dummy classes
   
   Make sure that:
   -	Names of test methods are descriptive
   -	You use appropriate assertions \(assert equals vs assert true)
   -	You use assertion messages
   -	There are no magic numbers
   -	There is no code duplication \(Don’t Repeat Yourself)
   
   
   **Hints**
   
   Extract constants and private fields for Axe class

## **Fake Axe and Dummy**

Test if hero gains XP when target dies
To do this, you need to: 

-	Make Hero class testable \(use Dependency Injection)
-	Introduce Interfaces for Axe and Dummy

        -	Interface Weapon 
        -	Interface Target 
        
Create fake Weapon and fake Dummy for the test

**Hints**

-Create Weapon interface

-Create Target interface

-Implement interfaces 

-Modify implementation methods to make use of interfaces

-Modify both Axe and Dummy classes

-Use Dependency Injection for Hero class

-Create HeroTests class and test gaining XP functionality by faking Weapon and Target classes

## **Mocking**

Include Mockito in the project dependencies, then:

1.	Mock fakes from previous problem
2.	Implement Hero Inventory, holding unequipped weapons
    
    a.	method - Iterable<Weapon> getInventory()

3.	Implement Target giving random weapon upon death
    
    a.	field - private List<Weapon> possibleLoot

4.	Test Hero killing a target getting loot in his inventory


[**SOLUTION**](https://github.com/SophiyaYO/UnitTestingLab/tree/master/src)