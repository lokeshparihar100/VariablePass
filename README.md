# VariablePass
Get the start time from beginning of Program method

Main Method: ClassP1.java 
I've created three objects in main method:
1. ClassComP1 -> Calling startTime Method to capture the start time.
2. ClassP2 -> Calling doSomething for some delay
3. ClassP3 -> Calling program to print 'Start Time' & 'End Time'.
           -> In Program Method I've created an object of ClassComP1 to get the startTime which I've captured at beginning (Point 1)
           

Output:
03-05-2023 09:27:07            // This is start time which I've printed in Point 1
Start Time: null
End Time: 03-05-2023 09:27:08

Desired Output:
Start Time: 03-05-2023 09:27:07
End Time: 03-05-2023 09:27:08
