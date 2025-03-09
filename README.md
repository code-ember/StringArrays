# StringArrays
Store and Manage superheroe information efficiently

## INTRODUCTION
Throughout this lesson, you’ve learned about Strings and arrays—key building blocks in Java programming. These fundamentals are essential stepping stones on your journey to becoming a software developer. If you need a quick refresher, don’t hesitate to revisit the earlier readings and videos. Now, let’s dive in and put your new skills to use! You've got this!
In this lab, you’ll help Kyle build a simple program for keeping track of various superheroes and the years they were introduced. Kyle isn’t sure how best to develop his program, so you tell him that arrays are probably the best way to store and manage this information efficiently. 

## THE GOAL
Help Kyle develop his program by printing the superheroes' names and dates of introduction, changing that information in an array of Strings and Int, and comparing the length of the String and int arrays?

## PRINT THE SUPERHEROES NAMES AND YEAR OF INTRODUCTION
Let's help Kyle develop his program by printing out superhero names and the years they were introduced. 

STEP 1: Explore the starter code
- In the starter code, within the main method, there is a predefined array of Strings with superhero names and another array of int with the year of introduction. 

STEP 2: Print every superhero name stored in the String array
- Print the names of the superheroes by accessing the index of the String element. For example, System.out.println(superheroes[0]); will fetch you “*Batman*”. 

EXPECTED OUTPUT:
- Superhero Names:
- Batman
- Superman
- Wonder Woman
- Spider-Man
- Iron Man

STEP 3: Print the years of introduction stored in the int array  
- Once you’ve printed all the superhero names from the String array, it's time to print the int array for the year these superheroes were introduced. 

EXPECTED OUTPUT:
- Superhero Names:
- Batman
- Superman
- Wonder Woman
- Spider-Man
- Iron Man
- Introduction Years:
- 1939
- 1938
- 1941
- 1962
- 1963

## CHANGE THE SUPERHERO NAME AND YEAR OF INTRODUCTION IN AN ARRAY OF STRING AND INT
Now you can declare and initialize a String array and an int array to fetch text String and number int variables. Unfortunately, Kyle made a mistake listing out his superheroes, and you need to change the name and introduction date of one of them.

STEP 4: Change the name of one of the superheroes in the String array.
- Change or modify the name of one of the superheroes. Using a statement like *superheroes[0] = "Black Widow";*. Can you guess which element of the array you would change with this statement? That’s right, the first! 

EXPECTED OUTPUT:
- Superhero Names:
- Batman
- Superman
- Wonder Woman
- Spider-Man
- Iron Man
- Introduction Years:
- 1939
- 1938
- 1941
- 1962
- 1963
- Original superhero name at position 3: Wonder Woman
- Modified superhero name at position 3: Thor

Step 5: Change the year of introduction of the changed superhero
- Changed the superhero at position 3, you might have noticed that their introduction date needs to change too. Kyle tells you that Thor was introduced in 2011. This means you must change the related introduction date in the int array. 

EXPECTED OUTPUT:
- Superhero Names:
- Batman
- Superman
- Wonder Woman
- Spider-Man
- Iron Man
- Introduction Years:
- 1939
- 1938
- 1941
- 1962
- 1963
- Original superhero name at position 3: Wonder Woman
- Modified superhero name at position 3: Thor
- Original introduction year for superhero at position 3: 1941
- Modified introduction year for superhero at position 3: 2011

## CHECK IF THE LENGTH OF THE STRING ARRAY AND LENGTH OF THE INT ARRAY ARE THE SAME
Now that some changes have been made to Kyle’s list of superheroes, you’ll probably want to check that you made no errors, like accidentally missing an introduction date or superhero name. To do this, you can write a statement to confirm that the length of the String array and of the int array are the same. 

STEP 6: Check that the String array and the int array contain the same number of elements
- Checking the length of the array containing the superheroes' names is the same as the length of the array of their introduction year. Use a statement like *arrayName.length*.

FINAL EXPECTED OUTPUT:
- Superhero Names:
- Batman
- Superman
- Wonder Woman
- Spider-Man
- Iron Man
- Introduction Years:
- 1939
- 1938
- 1941
- 1962
- 1963
- Original superhero name at position 3: Wonder Woman
- Modified superhero name at position 3: Thor
- Original introduction year for superhero at position 3: 1941
- Modified introduction year for superhero at position 3: 2011
- Total superheroes names in String array: 5
- Total superheroes introduction year in int array: 5

## CONCLUSION
Kyle is pleased with his superhero list, and you’re well on your way to becoming an array pro! In this lab, you helped Kyle manipulate his list of superheroes and their introduction dates. The list was stored as a String array and an int array, and you used code to print out superhero names and dates from each array and modify elements in each. You also used length to check the number of elements in each array and confirm that each superhero had an associated date. Kyle is now clear on which superhero appeared when! 
Understanding arrays is crucial for managing collections of data efficiently. This knowledge lays the groundwork for more advanced programming tasks that involve data structures and algorithms. Keep practicing by experimenting with arrays of different data types and sizes to solidify your understanding. 

## Software Used: IntelliJ
