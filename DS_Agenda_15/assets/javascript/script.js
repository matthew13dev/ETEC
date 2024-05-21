
function buttonActive() {
    const menu_button = document.getElementById("menu--logo");
    let atribute = menu_button.getAttribute("class");

    if (atribute === "menu--logo--active") {
        openMenu();
    }
    else {
        closeMenu();
    }
}

function openMenu() {
    const menu_button = document.getElementById("menu--logo");
    let atribute = menu_button.getAttribute("class");

    document.getElementById("sidebar").style.width = "240px";
    menu_button.setAttribute("class", "menu--logo");

    document.querySelector("main").style.marginLeft = "240px";
}

function closeMenu() {
    const menu_button = document.getElementById("menu--logo");
    let atribute = menu_button.getAttribute("class");

    document.getElementById("sidebar").style.width = "0px";
    menu_button.setAttribute("class", "menu--logo--active")

    document.querySelector("main").style.marginLeft = "0px";
}

function menuOff() {
    const menu_button = document.getElementById("menu--logo");
    let atribute = menu_button.getAttribute("class");

    if (atribute === "menu--logo--active") {

        document.getElementById("sidebar").style.width = "0px";
        menu_button.setAttribute("class", "menu--logo");

    }
}