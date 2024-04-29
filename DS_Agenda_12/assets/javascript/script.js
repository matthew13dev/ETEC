function siteForm() {
    const form_Element = document.getElementById("siteForm");

    document.getElementById("submit").addEventListener("click", (submit) => {

        submit.preventDefault();

        const formData = new FormData(form_Element);
        const siteObject = Object.fromEntries(formData);

        console.log(siteObject);
        addSite(siteObject);
    })
}

function addSite(siteObjtec) {
    const list_Element = document.getElementById("siteList");
    const itemList_Element = document.createElement("li");

    const link_Element = document.createElement("a");
    link_Element.setAttribute("href", siteObjtec.link)
    link_Element.innerHTML = siteObjtec.name;
    link_Element.setAttribute("target", "_blank")

    itemList_Element.appendChild(link_Element);
    list_Element.appendChild(itemList_Element);
}

siteForm();