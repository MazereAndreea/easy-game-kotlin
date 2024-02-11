package com.example.kotlinbasics

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice")
    playerChoice = readln()

    val randomNumber = (1..3).random()
    if(randomNumber == 1)
        computerChoice = "rock"
    else if(randomNumber == 2)
        computerChoice = "paper"
    else
        computerChoice = "scissors"
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }

    println(winner)
}