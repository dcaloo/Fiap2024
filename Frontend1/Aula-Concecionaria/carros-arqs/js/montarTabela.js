// pegando o tbody para exibir dados
const tbody = document.querySelector('#table-car');

let totalEstoque = 0;

// percorrer o array e para cada objeto iremos montar uma linha e suas colunas
carros.forEach(carro => {
    tbody.innerHTML += `
        <tr>
            <td>${carro.marca}</td>
            <td>${carro.modelo}</td>
            <td>${carro.ano}</td>
            <td>${carro.cor}</td>
            <td>${carro.transmissao}</td>
            <td>${carro.combustivel}</td>
            <td>${formatarMoeda(carro.preco)}</td>
        </tr>
    `;

    totalEstoque+=carro.preco;
});
document.querySelector('#total').textContent = formatarMoeda(totalEstoque);