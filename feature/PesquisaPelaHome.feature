#language: pt
#encoding: utf-8
Funcionalidade: Pesquisar produto pela home page

Contexto: entrar na pagina
Dado que estou na pagina inicial

@PesquisaComSucesso
Cenario: pesquisa com sucesso
Quando clico no produto
Então ele abre

@pesquisaComFalha
Cenario:
Quando clico em um produto
Entao e aberto outro produto
