#language: pt
#coding:utf-8
Funcionalidade: Cadastro

Contexto: entrar na pagina
Dado que estou na pagina inicial

@CadastroSucesso
Cenario: Cadastrar usuario novo com sucesso 
Quando clico no botao login
E clico no botao cadastro
E preencho meus dados 
Entao cadastrado com sucesso

@CadastroFalha
Cenario: Nao conseguir cadastrar usuario	
Entao nao consigo registrar o usuario