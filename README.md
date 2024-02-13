# Fuel Consumption Calculator
## Overview
This repository contains the source code and layout files for a simple Android app that serves as a fuel consumption calculator. The app allows users to input information such as fuel consumption, distance traveled, and fuel price per liter, and then calculates the average fuel consumption and cost for a specified distance.

## Project Structure
### Layout Design
The layout of the app is defined in the activity_main.xml file using the ConstraintLayout. It includes a header, three input fields, and a button to initiate calculations.


### Default Styles and Colors
Default styles and colors are defined in the colors.xml file for consistent design. The font used throughout the app is sourced from Google Fonts and specified in the lato.xml file.

### Input Fields
The app features three input fields:

1. Fuel Used in Liters
1. Run Kilometers
1. Price per Liter of Fuel
### Calculation Button
A "Calculate" button triggers the calculation of average fuel consumption and cost.

## Usage
1. Clone the repository to your local machine.
1. Open the project in Android Studio.
1. Run the app on an emulator or a physical Android device.
## Business Logic
The Java code for the app is located in the MainActivity.java file. It handles the logic for fetching user inputs, validating data, and calculating fuel consumption and cost. The results are displayed in an AlertDialog.

## Dependencies
The app utilizes Android's ConstraintLayout for layout design and Google Fonts for font styling.

## Contributing
Feel free to contribute to the project by submitting issues or pull requests. Your feedback and suggestions are highly appreciated.
