# Exercicios_POO
 
Repositório com os exercícios que fiz ao longo da disciplina de POO

# Enunciados

## Semana3

### Paralelogramo

Exercício de programação orientada a objetos. Implementação de uma classe que represente um paralelogramo, com sobrecarga de construtor.

Tarefa
Para esse exercício, queremos uma classe que represente um paralelogramo, figura geométrica de 4 lados onde os lados opostos são paralelos (para este exercício, assuma que todos os ângulo são de 90 graus e, portanto, a figura geométrica poderá ser um retângula ou um quadrado). O construtor deve ser sobrecarregado para receber um único valor (nesse caso, estamos criando um quadrado) ou dois valores (nesse caso, o paralelogramo é um retângulo se os valores forem diferentes).

Construtores da classe Paralelogramo:

Paralelogramo(ladoA : int)
Construtor que recebe apenas um valor de lado, indicando que todos os lados são iguais. Neste caso, o paralelogramo criado é um quadrado.
Paralelogramo(ladoA : int, ladoB : int)
Construtor que recebe dois valores de lado, cada valor corresponde a um par de lados opostos. Neste caso se os lados forem de tamanhos diferentes, o paralelogramo criado é um retângulo, caso contrário, é um quadrado.
Métodos da classe Paralelogramo:

getArea() : int
Calcula e retorna a área do paralelogramo.
getTipo() : String
Retorna uma String no formato "Paralelogramo <tipo>", onde "<tipo>" é "quadrado" caso todos os lados sejam de mesmo tamanho, ou "retangulo" caso cada par de lados opostos tenha tamanhos diferentes.
Crie a classe Paralelogramo em um arquivo contendo apenas a implementação da classe (nomeie o arquivo como <Paralelogramo.java> para a submissão).

Importante: O programa principal já existe no sistema de correção automática. Submeta apenas a classe Paralelogramo. A classe Paralelogramo não pode realizar impressão de dados ou utilizar import.

Casos de teste
Sua solução deve implementar apenas a classe, sem realizar leitura de entrada.

Sua classe passará por vários casos de teste onde a primeira linha consiste no número n de valores que será passado para o seu construtor. Em seguida, n valores serão lidos e um paralelogramo será criado. Finalmente, o retorno dos métodos getArea e getTipo serão impressos para verificação do resultado.

Exemplo de entrada e saída esperada de um caso teste
Entrada	Saída
1
10
100
Paralelogramo quadrado
2
10
12
120
Paralelogramo retangulo

Main
Exemplo de uso da classe
    Paralelogramo quadrado  = new Paralelogramo(10);
    Paralelogramo retangulo = new Paralelogramo(10, 20);
    Paralelogramo oQueSou   = new Paralelogramo(15, 15);

    // imprime "Paralelogramo quadrado"
    System.out.println(quadrado.getTipo());

    // imprime "Paralelogramo retangulo"
    System.out.println(retangulo.getTipo());

    // imprime "Paralelogramo quadrado"
    System.out.println(oQueSou.getTipo());
 
 ---
 
 ### ContaCorrente (construtor) 2
 
 Este exercício é uma versão adaptada e estendida do exercício Conta Corrente com Construtores de Guilherme Aldeia (2020).

Escreva uma classe com o nome ContaCorrente para representar uma conta corrente conforme especificado a seguir.

Construtores da classe ContaCorrente (todos os construtores são públicos):

ContaCorrente(String nome)
construtor que armazena o nome do titular da conta e inicializa o saldo com zero.
ContaCorrente(String nome, double saldo)
construtor que armazena o nome do titular da conta e inicializa o saldo com o valor especificado no parâmetro.
Métodos da classe ContaCorrente:

public double getSaldo()
retorna o saldo da conta.
public String getTitular()
retorna uma string com o nome do titular da conta.
public boolean depositar(double valor)
recebe um valor para ser depositado, verifica se é um valor positivo válido. Apenas valores positivos podem ser depositados. O método deve retornar true ou false, indicando se o depósito ocorreu (true) ou não (false).
public boolean sacar(double valor)
recebe um valor para ser retirado da conta. Apenas valores positivos podem ser retirados. Além disso, a operação só ocorre se a conta tiver saldo disponível. O método não realiza retirada parcial, portanto, é necessário que a conta tenha saldo disponível suficiente para que a operação seja realizada. O método deve retornar true ou false, indicando se a retirada ocorreu (true) ou não (false).
public static boolean transferir(ContaCorrente de, ContaCorrente para, double valor)
Realiza a transferência do valor informado da primeira conta (de) para a segunda (para), se isso for possível. Se não for possível, o saldo de nenhuma das contas deve ser alterado. O método deve retornar true ou false, indicando se a transferência ocorreu (true) ou não (false).
public static int getQuantidadeContas()
Retorna a quantidade de instâncias de ContaCorrente (dica: use um campo static para realizar a contagem de instâncias)


Importante: O programa principal já existe no sistema de correção automática. Submeta apenas a classe ContaCorrente. A classe ContaCorrente não pode realizar impressão de dados, utilizar import, java.util e System.out.

Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

nomes das operações executadas (a cada conta instanciada, o programa de correção armazena em um vetor):
instanciar_nome [nome_titular]
instanciar_nome_saldo [nome_titular] [saldo]
getTitular [índice da conta]
getSaldo [índice da conta]
depositar [índice da conta] [valor]
sacar [índice da conta] [valor]
transferir [índice da conta 1] [índice da conta 2] [valor]
getQuantidadeContas
Saída:

resultados obtidos após executar cada uma das operações
 
 ---
 
 ### Frações (construtor) 2
 
 Este exercício é uma versão adaptada e estendida do exercício Classe Fração com Construtores de Guilherme Aldeia (2020).

Escreva uma classe com o nome Fracao (a classe deve estar no pacote matematica) para representar um número racional conforme especificado a seguir (numerador e denominador são números inteiros, mas o denominador não pode ser zero).

Construtores da classe Fracao (todos os construtores são públicos):

Fracao()
construtor sem parâmetros, inicializa o numerador e o denominador como 1.
Fracao(int numerador)
construtor que recebe apenas o valor do numerador (o denominador é definido como 1).
Fracao(int numerador, int denominador)
construtor que recebe os valores do numerador e do denominador, simplifica a fração e então armazena o valores de numerador e denominador após a simplificação.
Métodos da classe Fracao:

public String getRepresentacao()
retorna uma String com a fração no formato "numerador/denominador".
public Fracao somar(Fracao f2)
retorna uma nova instância de Fracao, que é resultado da soma da instância atual (this) com a fração f2.
public static Fracao somar(Fracao f1, Fracao f2)
recebe duas frações e retorna uma nova instância de Fracao correspondendo à soma das frações;
public static Fracao somar(Fracao[] fracoes)
recebe um vetor de frações e retona uma nova instância de Fracao com o resultado do somatório de todas as frações no vetor.
public static Fracao multiplicar(Fracao f1, Fracao f2)
recebe duas frações e retorna uma nova instância de Fracao correspondendo ao produto das frações.


Importante: O programa principal já existe no sistema de correção automática. Submeta apenas a classe Fracao (que deve estar no pacote matematica). A classe Fracao não pode realizar impressão de dados, utilizar import, java.util e System.out.

Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

nomes das operações executadas (a cada conta instanciada, o programa de correção armazena em um vetor)
instanciar
instanciar_numerador [numerador]
instanciar_numerador_denominador [numerador] [denominador]
getRepresentacao [índice da fração]
somar_this [índice da fração 1] [índice da fração 2]
somar_static_fracoes [índice da fração 1] [índice da fração 2]
somar_static_vetor [frações instanciadas no vetor]
multiplicar [índice da fração 1] [índice da fração 2]
Saída:

resultados obtidos após executar cada uma das operações
 
 ---
 
 ### Caça palavras
 
 O professor ABC desenvolveu parte de um programa de caça palavras, mas falta implementar duas classes: Tabuleiro e PalavraEncontrada. Neste exercício, você irá escrever essas duas classes para serem utilizadas pelo programa desenvolvido pelo professor ABC. As duas classes devem estar no pacote palavras.

O tabuleiro lido tem o seguinte formato (os valores indicam os índices das linhas e colunas):





A classe Tabuleiro (pacote palavras) deve possuir dois construtores:

public Tabuleiro(char[][] matriz): instancia o tabuleiro com uma matriz de caracteres.
public Tabuleiro(int qtdLinhas, int qtdColunas, char[] dadosMatriz): instancia o tabuleiro com os caracteres passados no parâmetro dadosMatriz; Neste caso, o vetor dadosMatriz possui todas as linhas da matriz do tabuleiro concatenadas em um mesmo vetor. Por essa razão, também são passadas duas informações adicionais: quantidade de linhas e quantidade de colunas. Assim é possível separar os dados recebidos no vetor.
A classe Tabuleiro (pacote palavras) deve possuir os métodos a seguir:

public PalavraEncontrada buscar(String palavra): recebe uma palavra e retorna uma instância da classe PalavraEncontrada caso a palavra passada no parâmetro seja encontrada na instância atual de Tabuleiro. Se a palavra não for encontrada, retorne null.
public PalavraEncontrada[] buscar(String[] palavras): recebe um vetor de palavras e retorna uma instância da classe PalavraEncontrada para cada palavra encontrada na instância atual de Tabuleiro. As instâncias da classe PalavraEncontrada são retornadas como um vetor dessa classe. O vetor retornado deve ser do tamanho da quantidade de palavras encontradas (e não deve possuir elementos null). Por exemplo, se o método receber um vetor com 5 palavras para buscar, mas apenas 3 forem encontradas, o vetor de retorno possuirá tamanho 3. Caso nenhuma palavra seja encontrada, retorne null.


A classe PalavraEncontrada (pacote palavras) deve possuir os métodos a seguir:

public String getPalavra(): retorna a palavra armazenada na instância da classe PalavraEncontrada
public int[] getPosicao(): retorna a posição com um vetor de tamanho 2. No índice 0 está a linha e no índice 1 a coluna. A posição refere-se à localização do primeiro caractere da palavra no tabuleiro.
public int getTipo(): retorna o tipo de acordo com a forma que a palavra foi encontrada no tabuleiro:
tipo=1: linha
tipo=2: coluna
tipo=3: diagonal
public int getDirecao(): retorna o código da direção. Este código pode ser 1 ou 2 para os tipos linha e coluna. Para o tipo diagonal, o código pode ser 1, 2, 3 ou 4. A figura a seguir ilustra os valores possíveis para o código de direção.

![image](https://user-images.githubusercontent.com/57016670/150580809-18eb7e1a-795a-4b25-9dd3-72460e71004d.png)

 
Importante: Submeta apenas o código das classes Tabuleiro e PalavraEncontrada (as duas classes devem estar no pacote palavras, portanto lembre-se de incluir package palavras na primeira linha de cada classe). As classes submetidas não podem realizar impressão na tela e utilizar import, java.util e System.out. O programa (com main) já existe no sistema de correção. O programa recebe entradas no seguinte formato:

5 6 (quantidade de linhas e de colunas do tabuleiro)
Y T X W B I
R E V P D F
O S T H F I
C T K M F P
G E P W V L
vetor (tipo de construtor usado para instanciar a classe Tabuleiro: matriz ou vetor)
2 (quantidade de palavras a buscar)
TESTE (palavra 1)
PALAVRA (palavra 2)
A saída para esta entrada é:

buscar palavras: 2
palavras encontradas: 1
TESTE(L=0 C=1: Coluna-1)
 
---
 
 ##Semana 4
 
 ### Vínculo com a Universidade
 
 Nesse exercício, você criará três classes pertencentes ao pacote universidade: Pessoa, Professor e Aluno.

Classe Pessoa:

Construtor sem parâmetros: Pessoa();
Métodos:
void setNomeSobrenome(String nome, String sobrenome): recebe duas strings contendo nome e sobrenome, e guarda os valores em atributos na instância da classe.
String getEmail(): retorna uma string com email no formato "<nome>.<sobrenome>@dominio.generico.com.br". 
String getVinculo(): retorna uma string com o vínculo da pessoa com a UFABC (nesta classe Pessoa, retorna "Sem vinculo com a UFABC")
Subclasses Professor e Aluno: estendem a classe Pessoa (herdam a classe Pessoa). Ambas as classes devem possui o construtor sem parâmetros. Essas subclasses devem sobrepor os métodos getEmail() e getVinculo() da classe Pessoa. O email de um professor tem o formato "<nome>.<sobrenome>@ufabc.edu.br", enquanto que o de um aluno tem o formato "<nome>.<sobrenome>@aluno.ufabc.edu.br". O método getVinculo() deve retornar, respectivamente, "Professor da UFABC" e "Aluno da UFABC" nas classes Professor e Aluno.

Submeta apenas as classes Pessoa, Professor e Aluno. As classes devem ser públicas e estar no pacote universidade (incluir package universidade).

Importante: O programa principal já existe no sistema de correção automática. As classes submetidas não pode realizar impressão de dados ou utilizar import. Todas as classes devem possuir o construtor sem parâmetros, que será usado pelo sistema de correção automática para instanciar as classes.

Casos de teste
Formato dos casos de teste (esse é o formato do que aparece ao avaliar o programa no sistema de correção automática; o código submetido não deve realizar leitura de dados ou impressão, isso já é realizado pelo sistema de correção).

As classes serão instanciadas da seguinte forma pelo sistema de correção (observe que o tipo da variável é sempre Pessoa, isso é possível, pois as classes Aluno e Professor são subclasses de Pessoa):

Pessoa pe = new Pessoa();
pe.setNomeSobrenome(nomePessoa, sobrenomePessoa);
Pessoa al = new Aluno();
al.setNomeSobrenome(nomeAluno, sobrenomeAluno);
Pessoa pr = new Professor();
pr.setNomeSobrenome(nomeProfessor, sobrenomeProfessor);
Entrada:
NomePessoa SobrenomePessoa
NomeAluno SobrenomeAluno
NomeProfessor SobrenomeProfessor
Saída:
Saída dos métodos getEmail() e getVinculo() para uma instância de Pessoa
Saída dos métodos getEmail() e getVinculo() para uma instância de Aluno
Saída dos métodos getEmail() e getVinculo() para uma instância de Professor
 
 ---
 
 ### Veículos
 
 Crie uma superclasse Veiculo, que representa um veículo genérico, com o método getTipo que retorna uma String "Veiculo generico modelo <modelo>". Esse método será sobreposto pelas subclasses que herdam de Veiculo: Carro e Motocicleta, que retornam respectivamente "Carro modelo <modelo>" e "Motocicleta modelo <modelo>", onde <modelo> é uma String representando o modelo do veículo, passado no método setModelo. Adicionalmente, a classe Carro deve ter um atributo que guarde o número de portas, enquanto a classe Motocicleta tem um atributo informando se tem ou não um carro lateral acoplado.

![image](https://user-images.githubusercontent.com/57016670/150581157-f9348d5d-37bf-464c-afd8-3e3b4c47ccae.png)


Importante: submeta apenas as classes públicas Veiculo, Carro e Motocicleta. Todas as classes devem estar no pacote automotores. As classes não podem realizar impressão de dados ou utilizar import. Todas as classes devem possuir o construtor sem parâmetros, que será usado pelo sistema de correção automática para instanciar as classes.

Casos de teste (que aparecem ao avaliar o exercício no sistema de correção automática):

Entrada:
Modelo (para classe Veiculo)
Modelo e número de portas (para classe Carro)
Modelo e indicação se tem ou não carro lateral (parra classe Motocicleta)
Saída:
Resultado de getTipo() para o Veiculo
Resultado de getTipo() para o Carro
Resultado de getNumeroPortas() para o Carro
Resultado de getTipo() para a Motocicleta
Resultado de getTemCarroLateral para a Motocicleta
 
---
 
### Quadriláteros
 
Nesse exercício você criará classes pertencentes ao pacote quadrilateros: Quadrilatero, Paralelogramo, Retangulo, Quadrado. Um quadrilátero é qualquer figura geométrica com quatro lados.

A classe Quadrilatero armazena os tamanhos dos quatro lados da figura. Essa classe deve ter três métodos:

setLados(ladoAB: double, ladoBC: double, ladoCD: double, ladoDA: double) : armazena os tamanhos dos lados do quadrilátero;
getPerimetro(): double : retorna o perímetro de um quadrilátero convexo genérico;
getPropriedades(): String : retorna uma string com propriedades da figura. No caso da superclasse Quadrilátero, o retorno é "Figura de quatro lados.".
Além da classe Quadrilatero, o pacote quadrilateros deve possuir algumas classes de quadriláteros notáveis, que são casos específicos (subclasses) de um quadrilátero:

Paralelogramo (subclasse de Quadrilatero), em que os lados opostos são paralelos. Nesse caso, deve possuir uma sobrecarga do método setLados que recebe apenas dois argumentos (dois lados). O método getPropriedades() da superclasse imediata deve ser sobreposto para retornar uma string com as propriedades de um quadrilátero concatenada com "Lados opostos paralelos.". Ou seja, o retorno será "Figura de quatro lados. Lados opostos paralelos.".
Retangulo (subclasse de Paralelogramo), em que os lados opostos são paralelos e todos os lados possuem um ângulo de 90° entre eles. O método getPropriedades() deve ser sobreposto, retornando a string obtida com getPropriedades() da superclasse Paralelogramo concatenada com "Angulo de 90 graus em todos os vertices.";
Quadrado (subclasse de Retangulo), em que os lados opostos são paralelos, todos os lados possuem um ângulo de 90° entre eles, e todos os lados possuem o mesmo tamanho. Nesse caso, deve possuir uma sobrecarga do método setLados que recebe apenas um argumento (um lado).O método getPropriedades() deve ser sobreposto para retornar as propriedades da superclasse Retangulo concatenada com "Todos os lados tem o mesmo tamanho.".
Note que cada classe é um caso cada vez mais específico da superclasse. Ao concatenar, adicione um espaço entre as strings da superclasse e da classe. Por exemplo, o método getPropriedades() de Retangulo deve retornar "Figura de quatro lados. Lados opostos paralelos. Angulo de 90 graus em todos os vertices.".

Importante: Submeta apenas as classes públicas Quadrilatero, Paralelogramo, Retangulo e Quadrado (todas devem estar no pacote quadrilateros). As classes não podem realizar impressão de dados ou utilizar import. Todas as classes devem possuir o construtor sem parâmetros, que será usado pelo sistema de correção automática para instanciar as classes.

Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistemas de correção automática):

Entrada
quantidade de quadriláteros
lista com tipos dos quadriláterios a serem instanciados (quadrilatero, paralelogramo, retangulo, quadrado) seguido dos tamanhos dos lados
operações no formato: [índice quadriláterro] [código operação]
operação 1: getPerimetro()
operação 2: getPropriedades()
Saída
classes instanciadas
métodos executados e saídas obtidas (o caso de teste indica o índice do quadrilátero envolvido em cada operação)
 
---
 
### Cartões
 
Nesse exercício, você criará as classes CartaoDebito, CartaoCredito e CartaoLimitado, conforme diagrama a seguir (todas as classes devem estar no pacote cartoes):

![image](https://user-images.githubusercontent.com/57016670/150581379-d11b58ed-eb5d-41d2-ab27-a64c78533462.png)

Classe CartaoDebito:

<ul>
<li>setTitular(titular: String): armazena o nome do titular do cartão</li>
<li>adicionarSaldoDebito(valor: double): aumenta o saldo para débito. O saldo inicial é zero (quando o cartão é instanciado).</li>
<li>verificarSaldoDebito(): double : retorna o saldo disponível</li>
<li>pagarComDebito(valor: double): boolean : caso tenha saldo disponível, debita o valor passado no parâmetro. Quando o débito ocorre, retorna true, caso contrário, retorna false.</li>
</ul>
 
 Classe CartaoCredito:

<ul>
<li>pagarComCredito(valor: double): boolean : aumenta o valor devido com crédito e retorna true. Quando a classe é instanciada, o valor devido com crédito é zero.</li>
<li>quitarCredito(valor: double): quita o valor devido com crédito (seria como pagar a fatura do cartão). Após pagar, o crédito devido é diminuido (dependendo do valor passado no parâmetro do método).</li>
<li>verificarExtrato(): double : retorna o valor devido com crédito.</li>
</ul>
  
Classe CartaoLimitado:

<ul>
<li>pagarComCredito(valor: double): boolean : funcionamento similar ao método da classe CartaoCredito, mas agora possui um limite de crédito de $200,00 (para pagamentos com crédito). Portanto, se o valor devido com crédito somado ao valor do pagamento passar do limite, o pagamento não é realizado. Nesse caso, o método retorna false. Caso contrário, retorna true.</li>
</ul>

Importante: Submeta apenas as classes públicas CartaoDebito, CartaoCredito e CartaoLimitado (todas no pacote cartoes). O programa principal já existe no sistema de correção automática. As classes submetidas não podem realizar impressão de dados ou utilizar import. Todas as classes devem possuir o construtor sem parâmetros, que será usado pelo sistema de correção automática para instanciar as classes.

Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada
<ul>
<li>quantidade de cartões</li>
<li>lista com tipos dos cartões a serem instanciados (debito, credito, limitado)</li>
<li>operações no formato: [índice cartão] [nome operação] (valor)</li>
 </ul>
Saída
<ul>
<li>classes instanciadas</li>
<li>métodos executados e saídas obtidas (o caso de teste indica o índice do cartão envolvido em cada operação)</li>
</ul>
 
---
 
## Semana 5 
 
### Cifra de César
 
 Nesse exercício, considere a interface Cifra (que já está implementada no sistema de correção). Essa interface define o mínimo que uma classe de criptografia deve ter: um método para receber uma mensagem e cifrá-la; e um método para receber uma mensagem cifrada e decifrá-la.

Sua tarefa será escrever a classe CifraCesar (que implementa a interface Cifra), uma forma simples de esconder o conteúdo de mensagens. Considere o alfabeto como uma lista de 26 elementos, cada elemento seria uma letra na ordem alfabética. Aplicar um shift positivo nessa lista implica em mover todos os elementos 1 índice para frente, e o último passa a ser o primeiro (um valor negativo implica em um shift na direção contrária, e n pode ser qualquer valor inteiro).

A cifra de César recebe uma mensagem e substitui cada letra pela letra correspondente à realização de n shifts. Por exemplo, para a mensagem "abc z" e n=2, a mensagem cifrada é "cde b". O processo de decifrar uma mensagem consiste em aplicar a quantidade de shifts na direção contrária (portanto o receptor da mensagem cifrada deve ter conhecimento de n), e então substituir as letras pelo mesmo esquema.

![image](https://user-images.githubusercontent.com/57016670/150582534-c7e1c122-e715-45a3-be58-1e351e09887c.png)
UML - Interface Cifra e classe CifraCesar

Classe CifraCesar:

CifraCesar(nShifts : int): Construtor que recebe o número de shifts que essa classe irá realizar ao cifrar/decifrar uma mensagem. O valor de n é secreto, portanto deve ser um atributo privado;
cifrar(mensagem: String): String : Recebe uma mensagem (apenas caracteres alfabéticos e espaço, sem nenhum acento) e retorna a mensagem cifrada (usando o valor de n armazenado pelo construtor);
decifrar(mensagem: String): String : Utiliza seu valor interno de n para decifrar a mensagem.
Importante: Submeta apenas a classe pública CifraCesar (pacote criptografia). O programa principal e a interface Cifra já existem no sistema de correção automática (a interface Cifra já está no pacote criptografia). A classe submetida não pode realizar impressão de dados ou utilizar import.

Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

mensagem inicial
valor n para a instância 1 de CifraCesar
valor n para a instância 2 de CifraCesar
Saída:

mensagem inicial
instanciação de CifraCesar 1
instanciação de CifraCesar 2
cifrar usando instância 1
decifrar usando instância 2
 
---
 
### ZENIT-POLAR
 
Nesse exercício, considere a interface Cifra (que já está implementada no sistema de correção). Essa interface define o mínimo que uma classe de criptografia deve ter: um método para receber uma mensagem e cifrá-la; e um método para receber uma mensagem cifrada e decifrá-la. Considere o alfabeto como uma lista de 26 elementos, e que a mensagem é composta apenas de letras em mínusculo e espaço.

Sua tarefa será implementar uma classe ZENITPOLAR, uma forma simples de esconder o conteúdo de mensagens. O processo de cifrar a mensagem consiste em substituir as letras da linha de cima pelas letras da linha de baixo (e vice versa):

Z	E	N	I	T
P	O	L	A	R
Por exemplo, todo 'z' é trocado 'p', assim como todo 'p' é trocado por 'z'. O processo de decifrar consiste em repetir o processo de cifrar sobre uma mensagem que já está cifrada.

![image](https://user-images.githubusercontent.com/57016670/150582632-45f34753-8ddc-4e5f-acfd-4a1a59b6a303.png)
UML - Interface Cifra e classe ZenitPolar

Classe ZenitPolar:

cifrar(mensagem: String): String : Recebe uma mensagem (apenas caracteres alfabéticos e espaço, sem nenhum acento), e retorna a mensagem cifrada;
decifrar(mensagem: String): String : Decifra a mensagem.
Importante: Submeta apenas a classe pública ZenitPolar (que deve pertencer ao pacote criptografia). O programa principal e a interface Cifra já existem no sistema de correção automática (a interface Cifra já está no pacote criptografia). A classe submetida não pode realizar impressão de dados ou utilizar import. A classe deve possuir o construtor sem parâmetros, que será usado pelo sistema de correção automática para instanciar as classes.

Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

mensagem inicial
Saída:

mensagem inicial
instanciação de ZenitPolar
cifrar
decifrar
 
---
 
### Crachá
 
Implemente as classes Cracha, CrachaEstudante e CrachaFuncionario conforme apresentado no diagrama UML a seguir:

![image](https://user-images.githubusercontent.com/57016670/150582745-860beb79-e5d1-46f2-b3ff-dfc227a2275e.png)
UML - Classe abstrata Cracha e suas duas subclasses: CrachaEstudante e CrachaFuncionario.

A seguir, é apresentada uma descrição das classes apresentadas no diagrama UML.

Classe abstrata Cracha:

public void setNome(String nome): armazena o nome.
public abstract void imprimir(): método abstrato que será implementado pelas subclasses.


Classe CrachaEstudante (subclasse de Cracha):

public void setCurso(String curso): armazena o nome do curso.
public void imprimir(): sobrepõe o método imprimir da classe Cracha. Em CrachaEstudante, a impressão deve ser de acordo com o seguinte formato:
ESTUDANTE
Nome: <nome do estudante>
Curso: <nome do curso>


Classe CrachaFuncionario (subclasse de Cracha):

public void setCargo(String cargo): armazena o cargo.
public void setDataAdmissao(int m, int a): armazena o mês (parâmetro m) e o ano (parâmetro a) de admissão.
public void imprimir(): sobrepõe o método imprimir da classe Cracha. Em CrachaFuncionario, a impressão deve ser de acordo com o seguinte formato:
FUNCIONARIO
Nome: <nome do funcionário>
Cargo: <cargo do funcionário>
Admissao: <mes/ano de admissão do funcionário>


Para realizar a impressão, use Impressao.imprimirLinha(String texto), por exemplo:

Impressao.imprimirLinha("FUNCIONARIO");
A classe Impressao com o método static imprimirLinha já existe no sistema de correção automática.



Importante: Submeta apenas as classes públicas Cracha, CrachaEstudante e CrachaFuncionario. O programa principal já existe no sistema de correção automática. As classes submetidas podem realizar impressão apenas por meio da classe Impressao.imprimirLinha(texto). Não é permitido utilizar import. Todas as classes devem possuir o construtor sem parâmetros, que será usado pelo sistema de correção automática para instanciar as classes.

Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada
quantidade de crachás a serem instanciados
tipos dos crachás a serem instanciados ("estudante" ou "funcionario")
sequência de operações no formato: [índice do crachá] [método chamado] (parâmetros para o método)
Saída
verificação inicial das classes
resultados obtidos após executar cada uma das operações
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
