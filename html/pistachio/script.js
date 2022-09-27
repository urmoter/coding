function cat() {document.getElementById("image").style.display = "block";
	document.getElementById("btn").style.display = "none";
}
function time() {var date = new Date();
    document.getElementById("time").style.color = "black";
    document.getElementById("time").innerHTML = date;
}