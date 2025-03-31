// console do navegador
// mostrar o que foi processado - mostrar erros - verificar informações que são passadas
console.log('Eu sou console');
console.log('Exibindo dados.');

// variaveis
// usar 2 palavras reservadas: let / const
// JS é fracamente tipada
// JS tem tipagem automatica - 
// A tipagem ocorre confrme a informação atribuida
let nomeUsuario = 'Eduardo Caló';
let emailUsuario = 'eduardo.calo0304@gmail.com';
let idUsuario = 555933;
let logado = true;
const DATA_NASCIMENTO = '08/03';

// exibir
console.log(nomeUsuario, emailUsuario);
console.log(idUsuario, logado);
console.log(DATA_NASCIMENTO);

//exibir o tipo usando typeof
console.log(nomeUsuario, typeof nomeUsuario);
console.log(emailUsuario, typeof emailUsuario);
console.log(idUsuario, typeof idUsuario);
console.log(logado, typeof (logado));
console.log(DATA_NASCIMENTO, typeof (DATA_NASCIMENTO));

logado = false;
// gera um erro pois temos uma constante
// DATA_NASCIMENTO = '01/11';

// ctrl + D para selecionar ocorrencias


// contagem de 0 a 10
for (let i = 0; i <= 10; i++) {
    console.log(i);
}

// gera um erro pois o i foi declarado com let e só existe no for acima
// console.log('Valor final de i:', i);

// Template String - Template Literal
// deve iniciar e terminar com o sinal de CRASE (`)
// Placeholder ${Variavel - metodo - objeto - calculo - tags HTML}

console.log(`Usuário: ${nomeUsuario}
email: ${emailUsuario}
ID: ${idUsuario}
Usuario logado: ${logado}`);

// pegar a div usuario que esta no html
const divUsuario = document.getElementById('usuario');
console.log(divUsuario);
// divUsuario.textContent= 'eu mesmo'

divUsuario.innerHTML = `
<ul>
    <li>${nomeUsuario}</li>
    <li>${idUsuario}</li>
    <li>${emailUsuario}</li>
    <li>${logado}</li>
</ul>


`