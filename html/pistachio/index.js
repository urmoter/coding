var arr = [];
var x = 1;
var max;
function cat() {
    document.getElementById("image").style.display = "block";
    document.getElementById("btn").style.display = "none";
}
;
function time() {
    var date = new Date();
    document.getElementById("time").style.color = "black";
    document.getElementById("time").innerHTML = date.toDateString();
}
;
function pr() {
    var value = document.getElementById("num").value;
    if (value != null) {
        if (Number(value) != value) {
            document.getElementById("prompt").innerHTML = "Not a number!";
        }
        else {
            max = Number(value);
            while (x <= max) {
                arr.push(x);
                x++;
            }
            ;
            document.getElementById("prompt").innerHTML = arr.toString();
        }
        ;
    }
    else {
        document.getElementById("prompt").innerHTML = "You cancelled!!";
    }
}
window.onload = function () {
    var bttn = document.getElementById("btn3");
    bttn.onclick = function () {
        pr();
    };
};
