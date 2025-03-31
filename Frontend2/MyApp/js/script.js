// recuperar o tbody para escrever os dados do formulário nele
const tbody = document.querySelector('#historico');


// pegar o formulario - adicionar um listener para o submit - criar uma função - cancelar o submit para poder exibir os dados na tabela

document.querySelector('form').addEventListener('submit', function (e) {
    // cancelar o evento padrão
    e.preventDefault();
    // alert('A função foi chamada e os dados nao sumiram');

    // pegar dados dos campos do formulario e colocar em um array
    const campos = [
        document.querySelector('#usuario'),
        document.querySelector('#email'),
        document.querySelector('#data'),
        document.querySelector('#tipoConta')
    ];

    console.log(campos);
    // criar a tr
    const tr = document.createElement('tr');

    campos.forEach(campo => {
        // criar uma coluna da tabela
        const td = document.createElement('td');

        // passar para a td a informação que foi digitada
        td.textContent = campo.value;

        // colocar a td dentro da tr criada
        tr.appendChild(td);
    });

    tbody.appendChild(tr);

    // limpar os campos do formulario
    this.reset();
});