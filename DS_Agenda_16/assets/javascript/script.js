
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

    const element_main = document.getElementById("main");

    if (atribute === "menu--logo") {

        document.getElementById("sidebar").style.width = "0px";
        menu_button.setAttribute("class", "menu--logo--active");

        element_main.style.marginLeft = "0px";
    }
}

function navBar(idTag) {

    document.getElementById("home--content").style.display = "none";
    document.getElementById("about--content").style.display = "none";
    document.getElementById("grade--content").style.display = "none";
    document.getElementById("docentes--content").style.display = "none";
    document.getElementById("mercado--content").style.display = "none";
    document.getElementById("tecnologias--content").style.display = "none";
    document.getElementById("contato--content").style.display = "none";


    document.getElementById(idTag).style.display = "flex";
}

function defultPage() {
    document.getElementById("home--content").style.display = "flex";
}
defultPage();


const sliderSetings = {
    elements: {
        widthElement: document.querySelector(".slider--width"),
        itemsElements: document.querySelectorAll(".slider--item"),
    },

    width: function () {
        this.widthElement.style.width = `calc(100% * ${this.elements.itemsElements.length}`
    },

    behindEvent: function () {
        document.querySelector(".behind").addEventListener("click", ()=>{
            console.log("behind!")
        })
    },
    afterEvent: function () {
        document.querySelector(".after").addEventListener("click", ()=>{
            console.log("after!")
        })
        
    }
}



sliderSetings.width();
sliderSetings.behindEvent();
sliderSetings.afterEvent();



