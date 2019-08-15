# language: pt
Funcionalidade:
  Eu, enquanto Associado
  Preciso preencher o formulário de simulação
  Para ver a tabela de simulação com mês e valor.

  Esquema do Cenário: Simular investimento por mês (Positivo)
    Dado      que configurei ambiente para acessar Simulador
    Quando    abri tela do simulador de investimento
    E         marquei para você em informe seu perfil
    E         informei valor a aplicar <valorAplic>
    E         informei valor a poupar por mês <valorPoupar>
    E         informei o tempo de aplicação por mês <tmpAplic>
    E         cliquei no botão simular
    Então     Retorna a tela com resultado
    Exemplos:
      | valorAplic  | valorPoupar |tmpAplic|
      |  10.000,00  | 100,00      |3       |
      |  20.000,00  | 200,00      |4       |


  Esquema do Cenário: Simular investimento por ano (Positivo)
    Dado      que configurei ambiente para acessar Simulador
    Quando    abri tela do simulador de investimento
    E         marquei para você em informe seu perfil
    E         informei valor a aplicar <valorAplic>
    E         informei valor a poupar por ano <valorPoupar>
    E         informei o tempo de aplicação por ano <tmpAplic>
    E         cliquei no botão simular
    Então     Retorna a tela com resultado
    Exemplos:
      | valorAplic  | valorPoupar |tmpAplic|
      |  10.000,00  | 100,00      |1       |
      |  20.000,00  | 100,00      |2       |

    Esquema do Cenário:  Simular investimento por mês faltando campo valor aplicar (Negativo)
    Dado      que configurei ambiente para acessar Simulador
    Quando    abri tela do simulador de investimento
    E         marquei para você em informe seu perfil
    E         informei valor a poupar por mês <valorPoupar>
    E         informei o tempo de aplicação por ano <tmpAplic>
    E         cliquei no botão simular
    Então     Valida se solicitou campo valor aplicar
    Exemplos:
      | valorAplic | valorPoupar | tmpAplic |
      | 10.000,00  | 100,00      | 1        |

  Esquema do Cenário: Simular investimento por ano faltando campo valor investir (Negativo)
    Dado      que configurei ambiente para acessar Simulador
    Quando    abri tela do simulador de investimento
    E         marquei para você em informe seu perfil
    E         informei valor a aplicar <valorAplic>
    E         informei o tempo de aplicação por ano <tmpAplic>
    E         cliquei no botão simular
    Então     Valida se solicitou campo valor investir
    Exemplos:
      | valorAplic  | valorPoupar | tmpAplic |
      |  10.000,00  | 100,00      | 1        |


  Esquema do Cenário: Simular investimento para empresa por mês (Positivo)
    Dado      que configurei ambiente para acessar Simulador
    Quando    abri tela do simulador de investimento
    E         marquei para você em informe seu perfil
    E         informei valor a aplicar <valorAplic>
    E         informei valor a poupar por mês <valorPoupar>
    E         informei o tempo de aplicação por mês <tmpAplic>
    E         cliquei no botão simular
    Então     Retorna a tela com resultado
    Exemplos:
      | valorAplic  | valorPoupar |tmpAplic|
      |  10.000,00  | 100,00      |3       |
