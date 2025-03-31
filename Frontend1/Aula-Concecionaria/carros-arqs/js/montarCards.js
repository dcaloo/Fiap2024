const gridCards = document.querySelector('#gridCards')

carros.forEach(carro => {
    gridCards.innerHTML += `
        <div class="col-md-6 col-lg-4 my-2">
            <div class="card">
                <img src="${carro.foto}" class="card-img-top" alt="Foto do carro ${carro.modelo}">
                <div class="card-body">
                <h5 class="card-title">${carro.modelo} - ${carro.marca}</h5>
                <div class = "d-flex justify-content-between">
                    <h5>${carro.cor}</h5>
                    <h5 class= "fw-bold">${carro.ano}</h5>
                </div>
                <h4 class="text-center text-danger my-4">
                ${formatarMoeda(carro.preco)}</h4>
                </div>
            </div>
        
        
        </div>
    `
});