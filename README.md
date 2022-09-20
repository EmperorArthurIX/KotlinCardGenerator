# [Kotlin Card Generator]()

This application receives user-input from a Kotlin Source File through the Command Line, parsed as query parameters. JavaScript then renders this information on the screen.

# How To Use

The main idea is to generate a card for the user using query parameters in the URL.

If a parameter is not included in the query, it's default value is printed in the card.

We will use this link as the ```base``` URL, after which query parameters may be inserted after a question mark:

- By running the Kotlin File in the Command Line
- By making the query string by hand

## Parameters

### name

- Single Word:
```base?name=firstName```

- Multiple Words:
```base?name=firstName%20middleName%20lastName```

### email
```base?email=youremail@example.com```

### phone
```base?phone=yourPhoneNumber```

### address
```base?address=very%20long%20string%20without%20special%20characters```

### day
```base?day=dayOfBirthAsNumber```

### month
```base?month=monthOfBirthAsNumber```

### year
```base?year=yearOfBirthAsNumber```

### image
```base?image=linkToImageOnline```

## Format

We must note that all these parameters may be combined in any order, just like any other query string in a URL, using ```&```.

Also, please do not enter any special character apart from ```@``` as part of the values for these parameters. Handling them has not been programmed yet.

# Notes

If running the Kotlin Program, we must note that all parameters, except for ```image``` are necessary to be filled. The Kotlin File acts as a Form for generating this card.

# Tech Stack

- Kotlin
- HTML 5
- CSS 3
- JavaScript
- GitHub

# Thank you! Enjoy testing the site out!
