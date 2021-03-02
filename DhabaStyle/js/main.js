var continentInfo;
var details;
var xhr = new XMLHttpRequest();
xhr.open('GET','jsondata/data.json', true);
xhr.responseType = "text";
xhr.send();

xhr.onload = function () {
    if(xhr.status===200) {
        continentInfo= JSON.parse(xhr.responseText);
        console.log(continentInfo);
    }// end if

}// end function

function display(x){
    console.log(x);
    document.getElementById('continentName').innerHTML= continentInfo[x].cousine;
    document.getElementById('photo').src = continentInfo[x].dishes[x].photo;
    document.getElementById('dish').innerHTML = continentInfo[x].dishes[x].name;
    document.getElementById('cost').innerHTML = continentInfo[x].dishes[x].cost;
    document.getElementById('details').innerHTML = continentInfo[x].dishes[x].desc;

}// end function
