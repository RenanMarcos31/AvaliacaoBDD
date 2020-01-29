#language: pt
#enconding: utf-8
Funcionalidade: Pesquisa pela barra

Contexto: entrar na pagina
Dado que estou na pagina inicial

@PelaBarraComSucesso
Cenario: Pesquisar produto pela barra com suacesso 
Quando clico na lupa 
E pesquiso o produto
Entao clico no produto


@PelaBarraComFalha
Cenario: produto nao encontrado
Quando clico novamente na lupa
E pesquiso o produto com falha
Entao o site me retorna produto nao cadastrado