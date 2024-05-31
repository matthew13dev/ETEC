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
        this.elements.widthElement.style.width = `calc(100% * ${this.elements.itemsElements.length}`
    },

   behindEvent: function () {
        document.querySelector(".behind").addEventListener("click", ()=>{
            
            if(this.elements.widthElement.style.marginLeft === "0%"){
                this.elements.widthElement.style.marginLeft = "-100%";
            }
            else {
                this.elements.widthElement.style.marginLeft = "0%";
            }
        })
    },
    afterEvent: function () {
        document.querySelector(".after").addEventListener("click", ()=>{
            if(this.elements.widthElement.style.marginLeft === "-100%"){
                this.elements.widthElement.style.marginLeft = "0%";
            }
            else {
                this.elements.widthElement.style.marginLeft = "-100%";
            }
        })
        
    }
}



sliderSetings.width();
sliderSetings.behindEvent();
sliderSetings.afterEvent();



