const readSites = () => {

    const url = "sites.json";
    fetch(url).then((promise) => {
        let objects = JSON.parse(promise)
        return objects;
    }).then((json) => {

        const sites = document.getElementById("sites");

        for (let i = 0; i < json.lenght; i++) {
            let siteObject = i;

            const link = document.createElement("a");
            link.setAttribute("target", "_blank");
            link.setAttribute("href", siteObject.link)

            const card = document.createElement("div");
            card.setAttribute("class", "card");

            const image = document.createElement("img");
            image.src = siteObject.image;
            image.alt = siteObject.title;

            link.appendChild(image);
            card.appendChild(link);
            sites.appendChild(card);
        }

    })
}


readSites();