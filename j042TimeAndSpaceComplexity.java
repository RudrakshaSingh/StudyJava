//Time complexity of an algorithm quantifies the amount of time taken by an algorithm to run as a function 
//of the length of the input. 
//Relationship between input size(from scanner class we t6ake input) and runningtime(operations)
//Scanner se n input liya use in for loop 100times so 100unit time is taken
//relation can be linear,square ,cubic ,log,root
//time complexity is directly prop to input n and is linear relation

//3 cases(best case(min time),average case,wrost case(code cannot exceed this time))
// Ω(1)       seraching for 1 in [1 2 3 4 5]=1 operation best case
// θ((n+1)/2) [2 3 4 1 5]=avg of all cases=1+2+3+4+5(on 5th place)/n=n(n+1)/2n=(n+1)/2
// O(n)       wrost case[2 3 4 5 1]=n opearation

// in general we talk in terms of wrost case O(n)

//for loop inside for loop 
//outerloop run for n times and inner also n times
//time complexity =n^2
//outerloop run for n times and inner also m times
//time complexity =nm

//two loops with n and m taken but in 2 different loops not nested
//O(n+m)

// 1.O(n) 2.O(n^2)  3.O(n^3)  
//for 1 operation n=1  all perform only 1 opeartion
//for n=2 in 2.4operation in 3.8 opeartion
//dynamic programming in optimizing time complexity

public class j042TimeAndSpaceComplexity {
    public static void main(String[] args) {
        
    }
}

//Space Complexity
//-code mem me kitni jagah le rha hai(how many variable store in mem due to that code)
//Space complexity of an algorithm quantifies the amount of time taken by a program to run as a function of length of the input. 
//It is directly proportional to the largest memory your program acquires at any instance during run time. 
//For example: int consumes 4 bytes of memory.

//space compexity=constant for for loop
//in arrays-space complexity changes
//you can either make 6 variable to save 6 values or make one array
//so space complexity is affected by memory used