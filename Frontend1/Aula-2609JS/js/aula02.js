// sorteou um número entre 0 e 1
// let primeiroNumero = Math.random();
// console.log(primeiroNumero);

// multiplicação para ter o número com parte inteira
// primeiroNumero = primeiroNumero * 100;
// console.log(primeiroNumero);

//pegando apenas a parte inteira do número 
//cuidado pois a parte irá perder
// primeiroNumero = parseInt(primeiroNumero);


//retornar o próximo número inteiro
// primeiroNumero = Math.ceil(primeiroNumero);

// retorna o próprio inteiro
// primeiroNumero = Math.floor(primeiroNumero);

// retorna o próximo inteiro, caso decimal seja maior ou igual a 50
// retorna o mesmo inteiro. caso decima seja menor que 50
// primeiroNumero = Math.round(primeiroNumero);

const primeiroNumero = Math.ceil(Math.random() * 100);
const segundoNumero = Math.ceil(Math.random() * 100);

document.querySelector('#primeiroNumero').textContent = primeiroNumero;
document.querySelector('#segundoNumero').textContent = segundoNumero;

let resultado = (primeiroNumero + segundoNumero);
document.querySelector('#soma').textContent = resultado;

resultado = (primeiroNumero - segundoNumero);
document.querySelector('#subtracao').textContent = resultado;

resultado = (primeiroNumero * segundoNumero);
document.querySelector('#multiplicacao').textContent = resultado;

resultado = (primeiroNumero / segundoNumero);
document.querySelector('#divisao').textContent = resultado.toFixed(2);

// resultado = (primeiroNumero ** segundoNumero);
resultado = Math.pow(primeiroNumero, segundoNumero);
document.querySelector('#potencia').textContent = resultado;


// método construtor
const meuArray = new Array();

const numeros = [];
// pegar o botão, atribuir um listener ao botão e chamar uma função

document.querySelector('#btnArray').addEventListener('click', function () {
    for (let i = 0; i <= 9; i++) {
        numeros[i] = Math.floor(Math.random() * 100);
    }
    document.querySelector('#array').textContent = numeros;
});



document.querySelector('#btnMaior').addEventListener('click', function () {
    let maior = Math.max(...numeros);
    //"..." representa o spread (colocando o array do lado ele "esparrama" os valores e nao aparece "NaN" no site)

    // for (let i = 0; i <= 9; i++) {
    //     if (numeros[i] > maior) {
    //         maior = numeros[i];
    //     }
    // }
    document.querySelector('#maiorArray').textContent = maior;
});

//retorna o menor número no array
document.querySelector('#btnMenor').addEventListener('click', () => {
    document.querySelector('#menorArray').textContent = Math.min(...numeros);
});

//faz a multiplicação do array
const numerosMultiplicados = [];
document.querySelector('#btnMultiplicado').addEventListener('click', () => {
    // for(let i = 0; i < numeros.length; i++){
    //     numerosMultiplicados[i] = numeros[i] * 2
    // }

    numerosMultiplicados.splice(0);
    numeros.forEach(numero => {
        numerosMultiplicados.push(numero * 2);
    });

    document.querySelector('#arrayMultiplicado').textContent = numerosMultiplicados;
});

const pessoas = ['Eu', 'Tu', 'Ele', 'Nós', 'Vós', 'Eles'];

// Inserindo no inicio do array
pessoas.unshift('Eu mesmo');
//

//excluir o primeiro indice do array
pessoas.shift();
//

//inserir no final do array
pessoas.push('Eu mesmo');
//

//excluir o ultimo indice do array
pessoas.pop();
//

// excluir em qualquer parte do array
pessoas.splice(2, 2);
//

//inserir em qualquer parte do array
pessoas.splice(2, 0, 'Eles', 'Nós')
//

document.querySelector('#btnPessoas').addEventListener('click', () => {
    document.querySelector('#arrayPessoas').textContent = pessoas;
});