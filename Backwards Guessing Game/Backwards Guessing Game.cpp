// Nichole Watson - CSC 200 - Backwards Guessing Game in C++ - August 12, 2023 

#include <iostream>
#include <string>
using namespace std;

int main() {
	string hint;
	int max = 100, min = 1, guesses = 0, number = 0;

	cout << "\nPlease think of a number ranging from 1 to 100" << endl;

	do {
		number = (max + min) / 2; // Starting algorithm to guess number 
		cout << endl << "I think the number is: " << number << endl; //Computer's initial guess of 50 based on initial function
		cout << "How'd I do? (high, low, or correct): ";
		cin >> hint; 
		cin.get();

		//Loop to establish if computer needs to guess higher or lower, also increments the number of guesses
		if (hint == "high")
			max = number - 1;
		else if (hint == "low")
			min = number + 1;
		++guesses;
		
	} 
	
	//Establishes 5 guesses unless "correct" is entered by user
	while (guesses < 5 && hint != "correct"); {

	if (guesses == 5 && hint != "correct") 
	{
		cout << "\nI lost! Let's try again next time!"; //If computer hits 5 guesses and does not guess correctly
	}
	else
	{
		cout << "\nYes! I won!" << endl; //If computer guesses correctly
		cout << "\nThanks for playing!";
	}
	return 0;
	}
}
