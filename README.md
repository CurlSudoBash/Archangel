# Enigma

>  A voting ecosystem from the future

Enigma aims to make election voting procedure more secure and reliable by leveraging the features of blockchain. The voters can register themselves and place their votes with the help of an android application and their votes will be stored on Azure Blockchain. The entire electoral procedure can be broken down into 3 stages:- Registration, Voting and Counting.

## 1. Registration phase

The users can register themselves as voters with the help of the android app. The app will first verify if the user is a citizen of India or not with the help of [Voter ID Verification API](https://aadhaarapi.com/voter-id-verification/). The API will take the voter id number as input and will return user details such as gender, name, address, age and constituency. These details are automatically used to create a user account on **Enigma**. The user is then required to secure his account via a password or fingerprint or face ID all captured by the android app. After successful registration on **Enigma**, the user can login and vote anytime with the help of any of the above security measures(password/faceID/fingerprint) as set by him. Note:- In case the voter id number is already associated with an existing account, then the registration procedure will fail on purpose so as to prevent fraudulent votes.

## 2. Voting phase

In the dashboard of the application, the user will be shown ongoing elections as well as their candidates in his/her constituency. The user can vote a single candidate per election following which his choice is locked and uploaded to Azure Blockchain. Each candidate's manifesto, fund utilization, attendance in house, criminal records if any and other details will also be listed to help the users in their voting decision.

The electoral vote data will be stored in 2 Blockchains. The first blockchain will store status of voters and the second one will store status of votes. The voter accounts will be present in blockchain 1 and the candidate accounts will be present in blockchain 2. The currency over the blockchain is **votes**. The nodes in the blockchain 1 will be arranged and connected in the following heirarchy corresponding to the government structure:-

           O      State Nodes
          / \
         /   \
        O - - O   Constituency Nodes
      / |     |
     O--O - - O   Polling Booth Nodes

In blockchain 1 the voter will be given a unique ID and the currency in his/her will be initialized to 0. When a voter will be registered for an election, a transaction will occur on blockchain 1 in which **1 vote** will be transferred to the voter from a government account which will have infinite number of votes. The voter can then use the given vote to vote for a candidate in that particular election.

Blockchain 2 will contain the actual vote tally corresponding to candidates such as :-
```
Candidate 1 : 10 votes
Candidate 2 : 6 votes
```
When a voter votes for a candidate, a transaction occurs wherein **1 vote** is transferred from the voter's account in blockchain 1 to the candidate's account in blockchain 2. All candidate accounts in blockchain 2 are initialized to 0 at the start of the election. 

## 3. Counting phase

After the end of election, blockchain 2 is locked i.e no more transactions will take place. All the candidate votes are counted and tallied in blockchain 2 and the results are displayed instantly in the android app.

## Admin Panel

The ecosystem will also have an admin panel in the form of a webapp which will be used for creating elections with specified duration, adding candidates to a specific election with their details and for overseeing the entire electoral procedure.

## Tech stack

* Azure Blockchain
* Solidity
* Truffle.js
* Android
* Java
* Node.js

