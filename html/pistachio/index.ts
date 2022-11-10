var arr: number[] = [];
let x = 1;
let max;
function cat() {
    document.getElementById("image").style.display = "block";
	document.getElementById("btn").style.display = "none";
};
function time() {
    var date = new Date();
    document.getElementById("time").style.color = "black";
    document.getElementById("time").innerHTML = date.toDateString();
};
function pr() {
    var value = (<HTMLInputElement>document.getElementById("num")).value;
    if (value != null) {
        if(isNaN(Number(value))) {
            document.getElementById("prompt").innerHTML = "Not a number!";
        } else {
            max = Number(value);
            while(x<=max) {
                arr.push(x);
                x++;
            };
            document.getElementById("prompt").innerHTML = arr.toString();
        };
    } else { document.getElementById("prompt").innerHTML = "You cancelled!!"; }
}

window.onload = () => {
    var bttn = < HTMLButtonElement > document.getElementById("btn3");
    bttn.onclick = function() {
        pr();
    };
};