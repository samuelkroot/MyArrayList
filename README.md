Programming Assignment 12 - MyArrayList object
Computer Science I
Jefferson Highschool
Introduction

 The Arraylist class is a resizable array, which differs from normal arrays in that size can be modified. In this programming assignment, you will be implementing your own ArrayList class, called MyArrayList.
	Since you have yet to learn Generics yet, MyArrayList will only store strings. You may not use any functions from Java.Util or any other libraries to create your object. Go to the following Github link to pull a copy of the project to work on.
https://github.com/cland29/MyArrayList

There will be a series of test cases you must pass in order to earn points on this assignment. Code that hardcodes in solutions will receive a zero, even for work that was not hardcoded. It is suggested you work in the order of the functions below, but not required.

Size
	Returns the current size of MyArrayList.

Add
	Adds an element to MyArrayList by placing it in the stringArr variable. If stringArr is full, then you will need to create a new array of double the size, transfer all contents from stringArr to the new array, then set stringArr to the new array.

Get
	Returns an element at the given position. Allow the object to throw an error if one tries to access an index not part of the array.

Set
	Sets an element at a given position. If an index is specified that is less than 0 or greater than size - 1, don’t set anything.

Remove
	Removes an element at the given position. Allow the object to throw an error if one tries to access an index not part of the array. 
	Once an element is remove, If stringArr is less than ¼ full, then you will need to create a new array of half the size, transfer all contents from stringArr to the new array, then set stringArr to the new array.

Clear
	Removes all elements from the array. Reset stringArr to have size 4.

toArray
	Returns as array of size size and with all contents that MyArrayList holds.

addAll
	Adds all elements of either a String array or another MyArrayList.
