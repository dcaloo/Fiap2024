function formatarMoeda(precoCarro){
    const valorFormatado = new Intl.NumberFormat('pt-BR', {
        // definir o que sera formatado
        style: 'currency',
        // como ficara essa formatação - modelo de moeda
        currency: 'BRL'

        // chamar o objeto de formatação

    }).format(precoCarro);

    // retornar o valor formatado
    return valorFormatado;
};