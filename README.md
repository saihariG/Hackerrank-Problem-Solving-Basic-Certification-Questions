# Hackerrank-Problem-Solving-Basic-Certification-Questions
This repository contains two coding problems which is questioned in Hacker Rank's-Problem Solving (basic) Certification test

### Certificate : 
![problem solving (Basic)](https://user-images.githubusercontent.com/52252342/123290778-2c661980-d52f-11eb-8b36-d692dd123d2c.png)
# Problem 0:
## Active Traders
Given a list of String representing the trades of customers , return a list of customers who made at least 5% of the total sales in a sorted order
     
        Eg Input : customers -> ['alpha', 'beta', 'omega', 'omega', 'alpha' ]
        Eg Output : answer  -> ['alpha', 'beta','omega'] NOTE : returned list is in sorted alphabetical order
     
        Here alpha occurs 2 times out of 5 so alpha's contribution = 2 / 5(size of customers list) * 100 = 40%
        Here beta occurs 1 times out of 5 so beta's contribution = 1 / 5(size of customers list) * 100 = 20%
        Here omega occurs 2 times out of 5 so omega's contribution = 2 / 5(size of customers list) * 100 = 40%
     
        so every items contributed more than 5% so add them to result list if not, dont add
## [Solution 0: TimeComplexity O(m+n)](https://github.com/saihariG/Hackerrank-Problem-Solving-Basic-Certification-Questions/blob/master/ActiveTraders.java)       
# All Test Cases passed

# Problem 1:
## String Anagram
Given 2 arrays of Strings check the total no of Anagrams found in the dictionary list for each String in query list
     
        Eg Input : dictionary -> ['heater', 'cold', 'clod', 'reheat', 'dolc']
             query -> ['codl', 'heatre', 'abcd']
     
        Eg Output: 3 2 0
     
        Explanation : 'codl' in query[0] has three anagrams in dictionary list such as 'cold', 'clod', 'dolc'
                      'heatre' in query[1] has two anagrams in dictionary list such as 'heater', 'reheat'
                      'abcd' in query[2] has zero anagrams in dictionary list
     
## [Solution 1: TimeComplexity O(m+n)](https://github.com/saihariG/Hackerrank-Problem-Solving-Basic-Certification-Questions/blob/master/stringAnagram.java)
   

# All Test Cases passed
     
