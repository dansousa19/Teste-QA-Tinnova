#Author: your.email@your.domain.com


Feature: Exemplo de cadastro de usuarios
  Eu como usuario quero realizar cadastro de ususarios


  Scenario: Cadastro de usuarios
    Given que entre no site da empresa "https://tinnova-teste-qa.vercel.app/"
    And que clico em entrar
    And que clico em adicionar
    When preencho o nome
    And preencho o email
    And preencho o cpf
    And preencho o telefone
    Then que clico em guardar