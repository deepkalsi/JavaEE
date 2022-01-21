var jewelleryInfo;
var details;
var xhr = new XMLHttpRequest();
xhr.open('GET','jsondata/data.json', true);
xhr.responseType = "text";
xhr.send();

xhr.onload = function () {
    if(xhr.status===200) {
        jewelleryInfo= JSON.parse(xhr.responseText);
        console.log(jewelleryInfo);
    }// end if

}// end function

function display(x){
    console.log(jewelleryInfo[x].items[0]);
    document.getElementById('jewelleryName').innerHTML= jewelleryInfo[x].type;
    document.getElementById('photo').src = jewelleryInfo[x].items[0].photo;
    document.getElementById('type').innerHTML = jewelleryInfo[x].items[0].name;
    document.getElementById('cost').innerHTML = jewelleryInfo[x].items[0].cost;
    document.getElementById('details').innerHTML = jewelleryInfo[x].items[0].desc;
    document.getElementById('desc').innerHTML = jewelleryInfo[x].items[0].desc;

}// end function
