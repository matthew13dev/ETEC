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
            alert("behind!")
        })
    },
    afterEvent: function () {
        document.querySelector(".after").addEventListener("click", ()=>{
            alert("afeter!")
        })
        
    }
}



sliderSetings.width();
sliderSetings.behindEvent();
sliderSetings.afterEvent();



