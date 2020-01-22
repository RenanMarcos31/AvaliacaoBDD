#language: pt
#coding: utc-8

Funcionalidade: Cadastra Usuario
Contexto:
Dado que estou na pagina inicail
Quando clico no botao login
E clico no botao cadastro
E preecho meus dados

@CadastroComSucesso
Cenário: 
Então cadastrado com sucesso

@CdastroComFaalha
Cenário:
Entao cadastro com falha


