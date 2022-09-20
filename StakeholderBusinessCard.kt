package com.example.kotlinbasics

import kotlin.UByte

fun main()
{
    val url = "http://localhost:63342/-1fzdyqhjplm33a7t1su6x13o6n8kchfydsfht/KotlinBasics/com/example/kotlinbasics/index.html"
    var confirmDetails: Boolean?             // = null
    var name: String?             // = null
    var email: String?             // = null
    var phone: String?             // = null
    var month: UByte?             // = null
    var day: UByte?             // = null
    var year: UShort?             // = null
    var address: String?             // = null
    var imageLink: String?             // = null
    // Loop till correct data is available
    do
    {
        println("Kindly enter details to mention on the card")
        do
        {
            print("Name: ")
            name = readln()
            if (name.isNullOrBlank()) println("Please enter a non-empty string for Name")
        }while (name.isNullOrBlank())
        do
        {
            print("Year of birth: ")
            year = try {
                readLine()?.toUShort()
            } catch (exp: NumberFormatException) {
                println("Please enter a valid year of birth")
                null
            }
        }while (year == null || year < 1940u || year > 2020u)
        do
        {
            print("Month of birth as number: ")
            month = try {
                readLine()?.toUByte()
            } catch (exp: NumberFormatException) {
                println("Please enter a valid month of birth, 1 for January and 12 for December")
                null
            }
        }while(month == null || month > 12u || month < 1u)
        do
        {
            print("Day of birth as number: ")
            day = try {
                readLine()?.toUByte()
            } catch (exp: NumberFormatException) {
                println("Please enter a valid day of birth, 1 to 31")
                null
            }
        }while(day == null || day > 31u || day < 1u)
        do
        {
            print("Email: ")
            email = readln()
            if (email.isNullOrBlank()) println("Please enter a non-empty string for Email")
        }while(email.isNullOrBlank())
        do
        {
            print("Phone: ")
            phone = readln()
            if (phone.isNullOrBlank()) println("Please enter a non-empty string for Phone")
        }while(phone.isNullOrBlank())
        do
        {
            print("Address: ")
            address = readln()
            if (address.isNullOrBlank()) println("Please enter a non-empty string for Address")
        }while(address.isNullOrBlank())

        // No loop here, optional value
        print("Image Link (Optional):")
        imageLink = readln()
        // If empty, make null to save memory
        if (imageLink.isNullOrBlank()) imageLink = null

        repeat(10) {print("*")}
        println()
        print("Kindly confirm the entered details are correct (Y/N): ")
        confirmDetails = when(readln().lowercase())
        {
            "y" -> true
            "n" -> false
            else -> {
                println("Could not parse the command")
                null
            }
        }
    }while (confirmDetails != true)
    repeat(10) {print("*")}
    println()
    // By now, all values are non-null, we can replace safely
    val updatedURL = when(imageLink) {
        "", null -> "${url}?name=${name?.replace(" ", "%20")}&year=$year&month=$month&day=$day&email=${email?.replace(" ", "%20")}&phone=${phone?.replace(" ", "%20")}&address=${address?.replace(" ", "%20")}"
        else -> "${url}?name=${name?.replace(" ", "%20")}&year=$year&month=$month&day=$day&email=${email?.replace(" ", "%20")}&phone=${phone?.replace(" ", "%20")}&address=${address?.replace(" ", "%20")}&image=${imageLink}"
    }
        println("URL with required card: $updatedURL")
}