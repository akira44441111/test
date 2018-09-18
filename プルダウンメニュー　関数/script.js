document.write("問1","<br>");

function menseki(hankei){
    return "面積は"+hankei*hankei*3.14+"㎠です。";
}
    document.write(menseki(5));
    document.write("<br>");
document.write(menseki(7));
document.write("<br>");
document.write(menseki(10));


document.write("<br>","問2","<br>");

function ryoukin(otona,kodomo){
    return (500*otona)+(200*kodomo)+"円です。";
}
    document.write(ryoukin(2,4));
    document.write("<br>");
document.write(ryoukin(1,5));
document.write("<br>");
document.write(ryoukin(3,7));