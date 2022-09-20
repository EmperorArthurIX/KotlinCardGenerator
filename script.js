let name = document.querySelector("#name")
let day = document.querySelector("#day")
let month = document.querySelector("#month")
let year = document.querySelector("#year")
let email = document.querySelector("#email")
let phone = document.querySelector("#phone")
let address = document.querySelector("#address")
let image = document.querySelector("imgimg")
function getQueries()
{
    return window.location.search.substring(1).split("&");
}
function getQueryVariable(variable)
{
       var vars = getQueries()
       for (var i=0;i<vars.length;i++) {
               var pair = vars[i].split("=");
               if(pair[0] == variable){return pair[1].replaceAll("%20", " ");}
       }
       return(null);
}

function insertValues()
{
    {
    name.innerText = getQueryVariable("name") || name.innerText;
    day.innerText = getQueryVariable("day") || day.innerText;
    month.innerText = getQueryVariable("month") || month.innerText;
    year.innerText = getQueryVariable("year") || year.innerText;
    email.innerText = getQueryVariable("email") || email.innerText;
    phone.innerText = getQueryVariable("phone") || phone.innerText;
    address.innerText = getQueryVariable("address") || address.innerText;
    imgimg.src = getQueryVariable("image") || imgimg.src
    }
}

insertValues()