function buttonActive() {
    const menu_button = document.getElementById("menu--logo");
    let atribute = menu_button.getAttribute("class");

    if (atribute === "menu--logo--active") {

        document.getElementById("menu--areas").style.display = "none";
        document.getElementById("sidebar").style.width = "70px";
        menu_button.setAttribute("class", "menu--logo");
        document.getElementById("sidebar").style.borderRight = "#999";

    }
    else {
        document.getElementById("menu--areas").style.display = "flex";
        document.getElementById("sidebar").style.width = "240px";
        document.getElementById("sidebar").style.borderRight = "1px solid #999";

        menu_button.setAttribute("class", "menu--logo--active")
        
    }
}

function menuOff() {
     const menu_button = document.getElementById("menu--logo");
    let atribute = menu_button.getAttribute("class");

    if (atribute === "menu--logo--active") {

        document.getElementById("menu--areas").style.display = "none";
        document.getElementById("sidebar").style.width = "70px";
        menu_button.setAttribute("class", "menu--logo");
        document.getElementById("sidebar").style.borderRight = "#999";

    }
}