package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    /** INSTRUCTIONS
     * Implement a solution to find the length of the longest word in the given sentence below
     * Your solution should return a map containing the length of the word as the key & the word itself as the value
     * "10: biological"
     */

    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);


    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        class GFG {

            static int LongestWordLength(String str)
            {
                String[] words = str.split(" ");
                int length = 0;

                for(String word:words){
                    if(length < word.length()){
                        length = word.length();
                    }
                }
                return length;
            }

            // Driver code
            public static void main(String args[])
            {
                String str = "I am an intern at geeksforgeeks";

                System.out.println(LongestWordLength(str));
            }
        }
        Output:
        13






        Like
        7
        Next
        Program to find Smallest and Largest Word in a String
        RECOMMENDED ARTICLES
        Page :
        1
        2
        3
        Find the word from a given sentence having given word as prefix
        23, Sep 20
        Python program to find the longest word in a sentence
        09, Feb 21
        Print longest palindrome word in a sentence
        18, Apr 18
        C++ Program To Find Longest Common Prefix Using Word By Word Matching
        21, Dec 21
        Java Program To Find Longest Common Prefix Using Word By Word Matching
        21, Nov 21
        Python Program To Find Longest Common Prefix Using Word By Word Matching
        21, Nov 21
        Javascript Program To Find Longest Common Prefix Using Word By Word Matching
        21, Nov 21
        Longest Common Prefix using Word by Word Matching
        21, Jun 16
        Frequency of smallest character in first sentence less than that of second sentence
        30, Apr 20
        Program to replace a word with asterisks in a sentence
        25, Apr 18
        Python program to find the smallest word in a sentence
        16, Feb 21
        Java program to count the characters in each word in a given sentence
        26, Dec 17
        Find the word with most anagrams in a given sentence
        16, Jul 20
        Remove last occurrence of a word from a given sentence string
        24, Jun 21
        How to input or read a Character, Word and a Sentence from user in C?
                21, Sep 21
        Check if a word is present in a sentence
        15, Jan 20
        Sums of ASCII values of each word in a sentence
        03, Dec 17
        Print each word in a sentence with their corresponding average of ASCII values
        19, Nov 18
        C program to find and replace a word in a File by another given word
        30, Apr 20
        C program to Replace a word in a text by another given word
        12, Jun 17
        Length of longest Palindromic Subsequence of even length with no two adjacent characters same
        04, Feb 20
        Generate an N-length string having longest palindromic substring of length K
        14, Dec 20
        Lexicographically smallest permutation of a string that can be reduced to length K by removing K-length prefixes from palindromic substrings of length 2K
        11, Nov 20
        Find the first maximum length even word from a string
        05, Mar 19
        Article Contributed By :
        https://media.geeksforgeeks.org/auth/avatar.png
        Anshika Goyal
        @Anshika Goyal
        Vote for difficulty
        Current difficulty : Easy
                Easy
        Normal
                Medium
        Hard
                Expert
        Improved By :
        Vigneshwaran A
        nitin mittal
        manishshaw1
        Vivekkumar Singh
        Rajput-Ji
        rdtank
                simmytarika5
        hardikkoriintern
        Article Tags :
        Strings
        Practice Tags :
        Strings
        Improve Article
        Report Issue

        Practice Problems, POTD Streak, Weekly Contests & More!
                View Details


        WHAT'S NEW

        Data Structures & Algorithms- Self Paced Course
        Extra 20% Off I View Offer
        View Details

        Complete Interview Preparation- Self Paced Course
        Extra 20% Off I View Offer
        View Details



        A-143, 9th Floor, Sovereign Corporate Tower,
        Sector-136, Noida, Uttar Pradesh - 201305
        feedback@geeksforgeeks.org
                Company
        About Us
        Careers
        In Media
        Contact Us
        Privacy Policy
        Copyright Policy
        Learn
                Algorithms
        Data Structures
        SDE Cheat Sheet
        Machine learning
        CS Subjects
        Video Tutorials
        Courses
                News
        Top News
        Technology
        Work & Career
        Business
                Finance
        Lifestyle
                Knowledge
        Languages
                Python
        Java
                CPP
        Golang
        C#
        SQL

        return map;
    }
}
