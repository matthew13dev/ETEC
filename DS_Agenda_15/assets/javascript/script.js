function buttonActive() {
    const menu_button = document.getElementById("menu--logo");
    let atribute = menu_button.getAttribute("class");

    if (atribute === "menu--logo--active") {

        document.getElementById("menu--areas").style.display = "none";
        document.getElementById("sidebar").style.width = "70px";
        document.getElementById("main").style.marginLeft = "70px";
        document.querySelector(".sidebar").style.borderRight = "0"
        menu_button.setAttribute("class", "menu--logo");

    }
    else {
        document.getElementById("menu--areas").style.display = "flex";
        menu_button.setAttribute("class", "menu--logo--active")
        document.getElementById("sidebar").style.width = "240px";
        document.querySelector(".sidebar").style.borderRight = "1px solid #2f3336"

        document.getElementById("main").style.marginLeft = "240px";
        
    }

    console.log(atribute);
}