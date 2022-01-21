# Exercicios_POO
 
Repositório com os exercícios que fiz ao longo da disciplina de POO

# Enunciados

[Semana 3](#semana3)
[Semana 4](#paralelogramo)
[Semana 5](#semana5)
[Semana 6](#semana6)
[Semana 7](#semana7)
[Semana 8](#semana8)
[Semana 9](#semana9)
[Semana 10](##semana10)
[Bonus](##bonus)
<a href="##semana10">Heading IDs</a>

----------------------------------------------------------------------------------------------------

## Semana3 - Construtores, sobrecargas {#semana3}

----------------------------------------------------------------------------------------------------

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
 
----------------------------------------------------------------------------------------------------
 
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
 
----------------------------------------------------------------------------------------------------
 
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
 
----------------------------------------------------------------------------------------------------
 
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
 
----------------------------------------------------------------------------------------------------
 
##Semana 4 - Herança, polimorfismo {#semana4}
 
----------------------------------------------------------------------------------------------------
 
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
 
----------------------------------------------------------------------------------------------------
 
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
 
----------------------------------------------------------------------------------------------------
 
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
 
----------------------------------------------------------------------------------------------------
 
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
 
----------------------------------------------------------------------------------------------------
 
## Semana 5 - Interfaces, polimorfismo {#semana5}
 
----------------------------------------------------------------------------------------------------
 
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
 
----------------------------------------------------------------------------------------------------
 
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
 
----------------------------------------------------------------------------------------------------
 
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
 
----------------------------------------------------------------------------------------------------
 
### Navegador
 
O professor ABC projetou um Navegador que possui diferentes tipos de abas. Cada tipo de aba será específico para um tipo de aplicação, como buscador e rede social.

Neste exercício, deverão ser submetidos 4 arquivos (todas as classes a seguir são públicas e devem estar no pacote navegador):

Classe Navegador
Classe abstrata AbaNavegador
Classes AbaBuscador e AbaRedeSocial (ambas subclasses de AbaNavegador)
A seguir são apresentados os métodos necessários em cada classe. Esses métodos podem ser usados pelo sistema de correção e por isso devem seguir a especificação apresentada no enunciado. Você pode incluir atributos e métodos auxiliares adicionais que considerar necessários durante a implementação.

Classe Navegador:

public Navegador(int limiteAbas): construtor que armazena a quantidade limite de abas que podem estar abertas simultaneamente.
public AbaNavegador abrirAba(int tipo, String titulo): instancia uma nova aba no navegador, inclui na lista de abas abertas e retorna esta aba (se atingir o limite de abas, retorna null). A nova aba deve ser do tipo especificado no parâmetro tipo e com o título passado no parâmetro titulo.  Tipos de abas:
tipo 1: AbaBuscador
tipo 2: AbaRedeSocial
public void fecharAba(AbaNavegador aba): rebece uma instância de AbaNavegador e fecha a aba (remove da lista de abas abertas). A instância recebida no parâmetro sempre será uma instância de AbaNavegador que foi instanciada em algum momento anterior pelo método abrirAba.
public String[] getAbas(): retorna uma lista com os tipos e títulos de todas as abas abertas no formato "<tipo aba> <título aba>". A lista deve ser na ordem em que as abas foram abertas (iniciando com a aba aberta mais antiga).
public String[] getHistorico(): retorna uma lista com o histórico do navegador. O histórico deve retornar uma lista com o que foi feito em cada aba em ordem cronológica (iniciando com a ocorrência mais antiga). O histórico deve considerar o que ocorreu em todas abas: tanto as abertas no momento como as que já foram fechadas. Neste exercícios, assuma que haverá no máximo 100 itens/ocorrências no histórico.
Classe abstrata AbaNavegador:

protected String titulo: atributo com o título da aba
public String getTitulo(): retorna o título da aba atual
public abstract String getTipo(): retorna uma string com o tipo da aba. O retorno depende da subclasse que implementar este método.
Classe AbaBuscador: subclasse de AbaNavegador

public void buscar(String expressao): registra operação de busca como "Busca: <expressao>", em que <expressao> é o valor passado no parâmetro expressao. Esse registro vai para o histórico do navegador.
public String getTipo(): retorna a string "Buscador".
Classe AbaRedeSocial: subclasse de AbaNavegador

public void postar(String texto): registra operação de postar texto como "Post: <texto>", em que <texto> é o valor passado no parâmetro texto. Esse registro vai para o histórico do navegador.
public String getTipo(): retorna a string "RedeSocial".


Importante: Submeta apenas as classes públicas descritas no enunciado (todas devem estar no pacote navegador). O programa principal já existe no sistema de correção automática. As classes submetidas não podem realizar impressão de dados ou utilizar import.



Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

limite de abas abertas simultaneamente no navegador
operações no formato: [nome operação] (paramêtros da operação). Algumas operações utilizam um índice de aba. Esse índice é um controle interno do sistema de correção para identificar as abas, cada aba aberta tem a indicação de um índice, exibido na saída.
operação: abrirAba (parâmetros: tipo e título)
operação: buscar (parâmetros: índice da aba e expressão)
operação: postar (parâmetros: índice da aba e texto)
operação: fecharAba (parâmetros: índice da aba)
operação: getAbas
operação: getHistorico
Saída:

verificação das classes
instanciação da classe Navegador
métodos executados e saídas obtidas


Exercício de Paulo H. Pisani - Programação Orientada a Objetos - 2020 (exercício atualizado em 2021)
 
----------------------------------------------------------------------------------------------------
 
## Semana 6 - Construtores, cópia de objetos, final {#semana6}
 
----------------------------------------------------------------------------------------------------
 
### Arquivos multimídia 
 
Neste exercício, serão utilizadas classes para representar arquivos multimídia. Haverá uma classe abstrata chamada ArquivoMultimidia e essa classe possui duas subclasses: ArquivoVideo e ArquivoAudio. A classe ArquivoMultimidia já está implementada na atividade e pode ser acessada na aba Editar (o código desta classe não pode ser modificado). Portanto, neste exercício, devem ser implementadas apenas as subclasses ArquivoVideo e ArquivoAudio, conforme definido a seguir (todas as classes devem estar no pacote multimidia):

Classe ArquivoVideo (subclasse de ArquivoMultimidia):

Construtor: public ArquivoVideo(String nomeArquivo, int largura, int altura) - instancia um ArquivoVideo especificando o nome do arquivo e a resolução (largura e altura).
Método: public String toString() - sobrescreve o método toString() de Object. O retorno do método deve ser no formato "Video: %s (%d x %d)" (observe que não há acento), em que %s é o nome do arquivo e os dois inteiros indicados com %d são respectivamente largura e altura do vídeo.
Classe ArquivoAudio (subclasse de ArquivoMultimidia):

Construtor: public ArquivoAudio(String nomeArquivo, boolean audioHD) - instancia um ArquivoAudio especificando o nome do arquivo e se este arquivo tem áudio HD ou não.
Método: public String toString() - sobrescreve o método toString() de Object. O retorno do método deve ser no formato "Audio: %s (HD = %s)" (obseve que não há acento), em que o primeiro %s é o nome do arquivo e o segundo %s pode assumir o valor "true" ou "false" (true se o arquivo tem áudio HD e false caso contrário).


Importante: Submeta apenas as classes públicas descritas no enunciado (todas devem estar no pacote multimidia). O programa principal já existe no sistema de correção automática. As classes submetidas não podem realizar impressão de dados ou utilizar import.



Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada
quantidade de arquivos a serem instanciados
lista de arquivos a serem instanciados no formato [tipo] [nome do arquivo] [valores de atributos]
Saída
resultado da chamada ao método toString() de cada arquivo instanciado
 
----------------------------------------------------------------------------------------------------
 
### Perfil de usuário
 
Escreva as classes PerfilRedeSocial e PerfilAnonimo (pacote usuarios) conforme descrito a seguir:



Classe PerfilUsuario: o código desta classe está pronto e foi disponibilizado na aba Editar. O código desta classe não pode ser modificado.



Classe PerfilRedeSocial (subclasse de PerfilUsuario):

PerfilRedeSocial(String nome, String login): construtor que inicializa nome e login. Esses atributos devem ser atribuídos na superclasse PerfilUsuario.
PerfilRedeSocial(String nome, String login, String mensagemPaginaInicial): construtor que inicializa nome e login. Esses atributos devem ser atribuídos na superclasse PerfilUsuario. Esse construtor recebe também uma mensagem para a página inicial.
String getPerfil(): retorna uma string no formato: "<nome> <mensagemPaginaInicial>"


Classe PerfilAnonimo (subclasse de PerfilUsuario):

PerfilAnonimo(): construtor que inicializa o nome com a string "Anonimo". Esse atributo deve ser atribuído na superclasse PerfilUsuario.


Importante: O programa principal já existe no sistema de correção automática, assim como a classe PerfilUsuario. Submeta apenas as duas classes públicas especificadas (que pertencem ao pacote usuarios). As classes não pode realizar impressão de dados ou utilizar import.



Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

nome
login
mensagem página inicial
Saída:

verificação das classes
métodos executados e saídas obtidas
 
----------------------------------------------------------------------------------------------------
 
### Playlist
 
Neste exercício, deve ser implementada uma classe chamada Playlist, que irá armazenar uma playlist de arquivos multimídia. Para isso, neste exercício, devem ser implementadas as classes Playlist, ArquivoMultimidia, ArquivoVideo e ArquivoAudio (todas as classes devem estar no pacote multimidia).



Classe abstrata ArquivoMultimidia:

Construtor: public ArquivoMultimidia(String nomeArquivo) - construtor que inicializa o nome do arquivo
Métodos:
public final String getNomeArquivo() - retorna o nome do arquivo
public final void setNomeArquivo(String nomeArquivo) - alterna o nome do arquivo
Classe ArquivoVideo (subclasse de ArquivoMultimidia):

Construtor: public ArquivoVideo(String nomeArquivo, int largura, int altura) - instancia um ArquivoVideo especificando o nome do arquivo e a resolução (largura e altura).
Método: public String toString() - sobrescreve o método toString() de Object. O retorno do método deve ser no formato "Video: %s (%d x %d)" (observe que não há acento), em que %s é o nome do arquivo e os dois inteiros indicados com %d são respectivamente largura e altura do vídeo.
Classe ArquivoAudio (subclasse de ArquivoMultimidia):

Construtor: public ArquivoAudio(String nomeArquivo, boolean audioHD) - instancia um ArquivoAudio especificando o nome do arquivo e se este arquivo tem áudio HD ou não.
Método: public String toString() - sobrescreve o método toString() de Object. O retorno do método deve ser no formato "Audio: %s (HD = %s)" (observe que não há acento), em que o primeiro %s é o nome do arquivo e o segundo %s pode assumir o valor "true" ou "false" (true se o arquivo tem áudio HD e false caso contrário).

Classe Playlist:

Construtor: esta classe deve possuir apenas o construtor sem parâmetros, que inicializa a playlist sem nenhum arquivo. Uma playlist pode ter no máximo 100 arquivos.
Métodos:
public void adicionarItem(ArquivoMultimidia arquivo) - adiciona um arquivo mulmídia no final da lista de arquivos.
public void renomearItem(int indiceArquivo, String novoNomeArquivo) - altera o nome de um arquivo na lista de arquivos da playlist.
public void moverParaInicio(int indiceArquivo) - move o arquivo especificado para o início da lista.
public String[] listarArquivos() - retorna um vetor de String com os nomes dos arquivos na playlist. O comprimento desse vetor é a quantidade de arquivos adicionados na playlist.
public Playlist clone() - sobrescreve o método clone de Object. Esse método deve realizar uma cópia profunda do objeto Playlist. Nessa cópia profunda, inclusive as instâncias dos arquivos devem ser copiadas na nova instância retornada.


Importante: Submeta apenas as classes públicas descritas no enunciado (todas devem estar no pacote multimidia). O programa principal já existe no sistema de correção automática. As classes submetidas não podem realizar impressão de dados ou utilizar import.



Casos de teste
Para realizar os testes, o programa de correção instancia um objeto Playlist (playlist1). Ao longo do teste, o programa chama o método clone de playlist1 e assim obtêm uma instância que é armazenada em playlist2. Além disso, diversos métodos são chamados ao longo do teste. Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada
quantidade de arquivos a serem instanciados
lista de arquivos a serem instanciados no formato [tipo] [nome do arquivo] [valores de atributos]
métodos chamados
Saída
verificação da classe ArquivoMultimidia
arquivos instanciados
instanciação da classe Playlist
métodos chamados
 
----------------------------------------------------------------------------------------------------
 
### Relatório com plugins
 
O diretor de uma empresa projetou uma classe para produzir relatórios. A classe trabalha com o conceito de plugins para processar o texto e para imprimir o texto de diferentes formas. Os plugins devem seguir uma interface predefinida. Dessa forma, se futuramente for necessário incluir um novo tipo de processamento de texto ou de impressão, bastaria implementar classes que sigam a interface para o plugin.

O diretor já implementou uma classe abstrata para o relatório e também duas interfaces (uma para plugin de texto e outra para plugin de impressão). Essa classe e as duas interfaces estão prontas e disponíveis na aba Editar (esses três arquivos não podem ser modificados).

Classe abstrata Relatorio
Interface PluginTexto
Interface PluginImpressao
Entretanto, ainda falta implementar diversas partes para viabilizar o uso dessa classe para produzir relatórios com plugins. Neste exercício, deverão ser submetidos 5 arquivos (todas as classes descritas a seguir são públicas e devem estar no pacote relatorio):

Classe RelatorioComPlugins
Classes TextoTitulo e TextoData (implementações de plugin de processamento de texto)
Classes ImpressaoSimples e ImpressaoLimiteLargura (implementações de plugin de impressão)
A seguir são apresentados os métodos necessários em cada classe. Esses métodos podem ser usados pelo sistema de correção e por isso devem seguir a especificação apresentada no enunciado. Você pode incluir atributos e métodos auxiliares adicionais que considerar necessários durante a implementação.



Classe RelatorioComPlugins
Essa classe deve ser subclasse da classe Relatorio e possuir os métodos a seguir:

public RelatorioComPlugins(String autor): construtor que armazena o texto passado no parâmetro autor.
public void aplicarPluginTexto(PluginTexto plugin): aplica o plugin de processamento sobre o texto armazenado na instância de RelatorioComPlugins e substitui o texto armazenado pelo obtido após a aplicação do plugin.
public void setPluginImpressao(PluginImpressao p) : armazena uma referência a uma instância de um plugin de impressão. Essa instância será usada posteriormente pelo método imprimirRelatorio.
public void imprimirRelatorio(): imprime o texto armazenado na instância de RelatorioComPlugins usando o plugin de impressão especificado por setPluginImpressao.


Plugins de processamento de texto
Os plugins de processamento de texto devem implementar a interface PluginTexto. Essa interface já está pronta e pode ser encontrada na aba Editar. Há apenas um método nessa interface:

String aplicar(String texto): método que recebe um texto e retorna uma nova string com o resultado do processamento de texto aplicado. A regra de processamento de texto dependerá de cada classe que implementar este método.
Neste exercício, devem ser implementados dois plugins de processamento de texto:

Classe TextoTitulo: implementação de PluginTexto que adiciona um título ao texto do relatório.

public TextoTitulo(String titulo): construtor que instancia um plugin e armazena um título na instância de TextoTitulo.
public String aplicar(String texto): adiciona um título no início do texto no formato: "(TITULO: %s>) ", em que %s é o título do relatório (observe que não há acento). Por exemplo, para o texto "Este eh um teste." e título "Relatorio1", o retorno do método aplicar seria "(TITULO: Relatorio1) Este eh um teste."
Classe TextoData: implementação de PluginTexto que adiciona uma data ao texto do relatório.

public TextoData(int dia, int mes, int ano): construtor que instancia um plugin e armazena a data (dia, mês e ano).
public String aplicar(String texto): adiciona a data ao final do texto no formato " (DATA: %d/%d/%d)", em que cada um dos inteiros %d são respectivamente dia, mês e ano. Por exemplo, para o texto "Este eh um teste." e data 10/10/1000, o retorno do método aplicar seria "Este eh um teste. (DATA: 10/10/1000)".


Plugins de impressão
Os plugins de impressão devem implementar a interface PluginImpressao. Essa interface já está pronta e pode ser encontrada na aba Editar. Há apenas um método nessa interface:

void imprimir(Relatorio r): método que recebe uma instância de Relatorio e imprime o texto do relatório (observe que RelatorioComPlugins é subclasse de Relatorio e, portanto, o argumento passado pode ser uma instância de RelatorioComPlugins). A regra de impressão dependerá de cada classe que implementar este método. Importante: para impressão use apenas o método Impressao.imprimirLinha(String textoLinha). A classe Impressao e este método imprimirLinha já existem no sistema de correção automática.
Neste exercício, devem ser implementados dois plugins de impressão:

Classe ImpressaoSimples: implementação de PluginImpressao que faz uma impressão simples.
public ImpressaoSimples(): essa classe deve possuir apenas o construtor sem parâmetros (esse construtor é implicitamente criado se nenhum outro construtor for implementado na classe).
void imprimir(Relatorio r): faz uma impressão simples, ou seja, apenas chama o método imprimirLinha com o texto do relatório.
Classe ImpressaoLimiteLargura: implementação de PluginImpressao que imprime o texto considerando que há uma largura limite para impressão.

public ImpressaoLimiteLargura(int largura): construtor que armazena a largura máxima de linha passada no parâmetro largura.
void imprimir(Relatorio r): imprime o texto considerando que há uma largura limite para impressão, ou seja, nenhuma linha impressa pode passar de um determinado número caracteres. Ao realizar esse tipo de impressão, algumas regras devem ser observadas:
as palavras não podem ser separadas. Portanto, se não tiver espaço disponível para incluir uma palavra em uma linha, ela deverá ser incluída na próxima. Por exemplo, para o texto "Frase teste" e largura de linha 8, a divisão seria em duas linhas "Frase" e "teste" (não há espaço na primeira linha para incluir "Frase teste". Se a largura de linha for 11, apenas uma linha é suficiente.
datas não podem ser separadas: a regra anterior se aplica a datas também (e.g. 10/10/1000).
toda linha deve iniciar com uma letra, ou seja, nenhuma linha deve iniciar com o caractere espaço ou com pontuação (ponto, vírgula, etc). Se algum sinal de pontuação ficar exatamente após uma quebra de linha, a palavra que precede o sinal deve ser passada para a próxima linha, de forma que nenhuma linha inicie com pontuação. Por exemplo, para o texto "Neste teste, a frase possui pontuacao." e largura de linha 11, a divisão seria em cinco linhas: "Neste", "teste, a", "frase", "possui", "pontuacao."
um caractere espaço que fique exatamente após uma quebra de linha deve ser suprimido, de forma que a próxima linha inicie com uma palavra (e não com um caractere espaço). Por exemplo, para o texto "Texto para teste ABCD" e largura 10, a divisão seria em duas linhas: "Texto para" e "teste ABCD".

Arquivos a serem submetidos
Neste exercício, deverão ser submetidos 5 arquivos:

Classe RelatorioComPlugins
Classes TextoTitulo e TextoData
Classes ImpressaoSimples e ImpressaoLimiteLargura
Essa atividade disponibiliza também outros 3 arquivos com código pronto: Relatorio.java, PluginTexto.java e PluginImpressao.java. Não altere o conteúdo desses três arquivos.

Importante: Não é permitido o uso de expressão regular, assim como dos métodos indexOf, join, lastIndexOf, replace, replaceAll, replaceFirst, split, startsWith, trim. O programa principal já existe no sistema de correção automática. As classes submetidas não podem realizar impressão de dados ou utilizar import (apenas os plugins de impressão podem imprimir dados, mas devem usar Impressao.imprimirLinha(texto), método que já existe no sistema de correção).


Casos de teste
O programa de correção mantém um vetor com diversas instâncias de plugins e usa essas instâncias para realizar os testes (mais detalhes podem ser observados na sáida produzida pela correção automática). Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada
texto do relatório
quantidade de plugins de processamento de texto a serem instanciados
nomes das classes dos plugins de processamento de texto a serem instanciados (e seus parâmetros para inicialização)
quantidade de plugins de impressão a serem instanciados
nomes das classes dos plugins de impressão a serem instanciados (e seus parâmetros para inicialização)
operações:
aplicarPluginTexto [índice plugin]: chama o método aplicarPluginTexto de RelatorioComPlugins e passa o plugin de texto especificado.
setPluginImpressao [índice plugin]: chama o método aplicarPluginTexto de RelatorioComPlugins e passa o plugin de impressão especificado.
imprimirRelatorio: chama o método imprimirRelatorio de Relatorio
aplicar [índice plugin] [texto]: chama o método aplicar de uma instância de plugin de processamento de texto (faz uma chamada direta ao plugin sem usar a classe RelatorioComPlugins).
Saída
classes instanciadas
métodos executados e saídas obtidas
 
----------------------------------------------------------------------------------------------------
 
 ## Semana 7 - Estruturas lineares no contexto de orientação a objetos {#semana7}
 
----------------------------------------------------------------------------------------------------
 
 ### Dispositivos inteligentes
 
Uma empresa está desenvolvendo um programa para gerenciar dispositivos inteligentes. O programa vai gerenciar três tipos de dispositivos: lâmpada, tomada e interruptor.

Neste exercício, implemente as 5 classes a seguir (todas as classes devem estar no pacote dispositivos). As classes DispositivoInteligente, LampadaInteligente, TomadaInteligente e InterruptorInteligente tem acesso package. A classe Gerenciador tem acesso public.



Classe abstrata DispositivoInteligente: essa classe possui um atributo do tipo boolean para armazenar o estado, que indica se o dispositivo está ligado (true) ou desligado (false). Todo dispositivo criado inicia desligado (estado = false).

public void ligar(): liga o dispositivo (muda o estado para true).
public void desligar(): desliga o dispositivo (muda o estado para false).
public boolean getEstado(): retorna o valor do atributo estado.
Classe LampadaInteligente (subclasse de DispositivoInteligente):

public void ligar(): liga o dispositivo (muda o estado para true).
public void desligar(): desliga o dispositivo (muda o estado para false).
public boolean getEstado(): retorna o valor do atributo estado.
Classe TomadaInteligente (subclasse de DispositivoInteligente):

public void ligar(): liga o dispositivo (muda o estado para true).
public void desligar(): desliga o dispositivo (muda o estado para false).
public boolean getEstado(): retorna o valor do atributo estado.
Classe InterruptorInteligente (subclasse de DispositivoInteligente):
public void ligar(): liga o dispositivo (muda o estado para true).
public void desligar(): desliga o dispositivo (muda o estado para false).
public boolean getEstado(): retorna o valor do atributo estado.

Classe Gerenciador: armazena uma lista de dispositivos inteligentes. A classe pode ter no máximo 10 dispositivos nesta lista.

public void adicionarDispositivo(DispositivoInteligente d): adiciona o dispositivo d (armazena uma referência ao dispositivo d) na lista de dispositivos armazenados no gerenciador.
public void ligarTodosDispositivos(): liga todos os dispositivos.
public void desligarTodosDispositivos(): desliga todos os dispositivos.


Observação: apenas a classe Gerenciador é pública. Todas as demais tem acesso package.

Importante: Submeta apenas as classes descritas no enunciado (todas devem estar no pacote dispositivos). O programa principal já existe no sistema de correção automática. As classes submetidas não podem realizar impressão de dados, utilizar import ou java.util. Todas as classes devem possuir o construtor sem parâmetros.



Casos de teste
O programa de correção mantém uma lista com diversas instâncias de dispositivos inteligentes e também mantém uma instância da classe Gerenciador. Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada
adicionar [tipo do dispositivo]
ligar [índice do dispositivo]
desligar [índice do dispositivo]
ligarTodosDispositivos
desligarTodosDispositivos
Saída
verificação das classes
operações executas e saídas obtidas
 
----------------------------------------------------------------------------------------------------
 
### Conjuntos
 
Escreva a classe Conjunto que implementa a interface Lista, conforme indicado no diagrama a seguir (a classe deve estar no pacote estruturas, a interface Lista está no mesmo pacote).

![image](https://user-images.githubusercontent.com/57016670/150584454-e5e48155-cefc-4b08-866c-10ec678631b4.png)
Interface Lista e Classe Conjunto, que implementa a interface Lista

Classe Conjunto: classe que gerencia um conjunto de números (em um conjunto, não há números repetidos).

getQtd(): int - retorna a quantidade de itens/números no conjunto;
adicionar(numero: int) - adiciona um número no conjunto de números
remover(numero: int) - remove um número do conjunto de números.
buscar(numero: int): int - busca um número e retorna o índice (o primeiro item deve ter índice 0). Se o número não for encontrado, o método retorna -1. O índice corresponde à ordem em que o número foi adicionado no conjunto.
toString(): String - retorna uma String com os números do conjunto na ordem em que foram adicionados. Coloque um espaço entre cada número (não há espaço após o último número).
uniao(a: Conjunto, b: Conjunto): Conjunto - retorna uma nova instância de Conjunto com a união dos conjuntos a e b. A ordem dos elementos no novo conjunto deve ser a mesma do conjunto a, com os elementos exclusivos de b adicionados ao final na mesma ordem que aparecem em b. Por exemplo, para os conjuntos a={2, 9, 1} e b={3, 8, 9, 5}, o resultado da união seria {2, 9, 1, 3, 8, 5}.
intersecao(a: Conjunto, b: Conjunto): Conjunto - retorna uma nova instância de Conjunto com a interseção dos conjuntos a e b. A ordem dos elementos no novo conjunto deve ser a mesma do conjunto a. Por exemplo, para os conjuntos a={2, 9, 1} e b={1, 8, 9, 5}, o resultado da interseção seria {9, 1}.
Observação: os métodos uniao e intersecao são static.

Importante: Submeta apenas a classe pública Conjunto (pacote estruturas). O programa principal já existe no sistema de correção automática, assim como a interface Lista. A classe submetida não pode realizar impressão de dados, java.util ou utilizar import.

Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

[operação] (índice) (número)
Operação 1: adicionar
Operação 2: remover
Operação 3: buscar
Operação 4: união
Operação 5: interseção
Operação 9: getQtd
Saída:
métodos executados e saídas obtidas
 
----------------------------------------------------------------------------------------------------
 
### Lista de mensagens
 
O professor ABC está desenvolvendo um programa de chat, mas falta implementar algumas classes. Neste exercício, implemente as classes ListaMensagens, Mensagem, MensagemTexto e MensagemImagem (todas as classes são do pacote chat).

[acesso public] classe abstrata Mensagem:

like() - incrementa em uma unidade a quantidade de likes (quando a classe é instanciada, a quantidade de likes é inicializada com zero).
responder(resposta: Mensagem) - recebe uma instância de Mensagem e faz uma ligação entre a mensagem atual e a resposta de forma que seja possível identificar que a mensagem é resposta da mensagem atual.
Por exemplo, assuma que há uma instância de mensagem A com o texto "Quanto eh 1 + 1?" e outra instância de mensagem B com o texto "O resultado eh 2.". Nesse caso, a mensagem B será a resposta de A. Então, o programa poderia realizar a seguinte chamada: msgA.responder(msgB); // Nesse caso msgA e msgB seriam as instâncias com as mensagens A e B respectivamente. Dessa forma, msgA foi respondida com msgB.
getRepresentacao(): String - método abstrato que retorna uma representação em String da mensagem (a representação depende da subclasse)
[acesso package] classe MensagemTexto (subclasse de Mensagem):

MensagemTexto(texto: String) - construtor que armazena o texto da mensagem na instância atual.
getRepresentacao(): String - retorna uma String no seguinte formato: "<texto> (likes=<qtd>)"
Se a mensagem atual for uma resposta a outra mensagem, a String deve ter o seguinte formato: "<texto> RESPOSTA A [<getRepresentacao() da mensagem respondida sem a parte dos likes>] (likes=<qtd>)"
Observações: <texto> é o texto da mensagem, <qtd> é a quantidade de likes da resposta.
Exemplo 1: para o texto "teste2" que é uma resposta à mensagem "teste1", a representação será: "teste2 RESPOSTA A [teste1] (likes=0)" (a quantidade de likes é a referente à resposta, nesse exemplo, "teste2" é o texto da resposta).
Exemplo 2: para o texto "teste2" que é uma resposta à imagem "figura1 10x10", a representação será: "teste2 RESPOSTA A [figura1 10x10] (likes=0)" (a quantidade de likes é a referente à resposta, nesse exemplo, "teste2" é o texto da resposta).
[acesso package] classe MensagemImagem (subclasse de Mensagem):

MensagemImagem(arquivoImagem: String, largura: int, altura: int) - construtor que armazena o arquivo da imagem e suas dimensões (largura e altura) na instância atual.
getRepresentacao(): String - retorna uma String no seguinte formato: "<arqImg> <largura>x<altura> (likes=<qtd>)"
Se a mensagem atual for uma resposta a outra mensagem, a String deve ter o seguinte formato: "<arqImg> <largura>x<altura>  RESPOSTA A [<getRepresentacao() da mensagem respondida sem a parte dos likes>] (likes=<qtd>)"
Observações: <arqImg> é o arquivo da imagem, <largura> é a largura da imagem, <altura> é a altura da imagem, <qtd> é a quantidade de likes da resposta.
Exemplo 1: para a imagem "img2 20x20" que é uma resposta à mensagem "teste1", a representação será: "img2 20x20 RESPOSTA A [teste1] (likes=0)" (a quantidade de likes é a referente à resposta).
Exemplo 2: para a imagem "img2 20x20" que é uma resposta à imagem "figura1 10x10", a representação será: "img2 20x20 RESPOSTA A [figura1 10x10] (likes=0)" (a quantidade de likes é a referente à resposta).

[acesso public] classe ListaMensagens: essa classe gerencia uma lista de mensagens

ListaMensagens() - construtor sem parâmetros da classe ListaMensagens.
adicionarMensagem(mensagem: Mensagem) - adiciona mensagem ao final da lista de mensagens.
responderMensagem(indiceMensagemOriginal: int, resposta: Mensagem) - responde a mensagem no índice especificado e adiciona a resposta ao final da lista de mensagens. 
getMensagens(): Mensagem[] - retorna vetor com as mensagens da lista. O comprimento do vetor retornado deve ser igual à quantidade de mensagens adicionadas na lista. Observe que a lista de mensagens é composta pelas pelas mensagens originais, assim como pelas mensagens resposta.
getMensagensString(): String[] - funciona da mesma forma que o método getMensagens, mas ao invés de retornar instâncias de Mensagem, retorna uma lista de Strings. Cada String é o retorno obtido por getRepresentacao() de cada mensagem.
like(indiceMensagem: int) - aumenta a quantidade de likes da mensagem no índice especificado.


Observação: as classes Mensagem e ListaMensagem são públicas, e as classes MensagemTexto e MensagemImagem tem acesso package. Todos os métodos apresentados devem ter acesso público.

Importante: O programa principal já existe no sistema de correção automática. Submeta apenas as classes especificadas (pacote chat). A classes não podem realizar impressão de dados, java.util ou utilizar import.



Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

[operação] (índice da mensagem) (dados da mensagem)
operação 1: adicionar mensagem de texto
operação 2: adicionar mensagem de imagem
operação 3: responder com mensagem de texto
operação 4: responder com mensagem de imagem
operação 9: like
operação 10: getMensagens
operação 11: getMensagensString
Saída:

verificação das classes
métodos executados e saídas obtidas
 
----------------------------------------------------------------------------------------------------
 
## Semana 8 - Tratamento de exceções {#semana8}
 
----------------------------------------------------------------------------------------------------
 
### Lâmpada Inteligente com exceções
 
Uma empresa está desenvolvendo um aplicativo para gerenciar lâmpadas inteligentes. Cada lâmpada inteligente é representada por uma instância da classe LampadaInteligente (essa classe já está implementada no sistema de correção automática e encontra-se no pacote dispositivos). 

A classe LampadaInteligente possui os seguintes métodos:

public void ligar(): liga a lâmpada;
public void desligar(): desliga a lâmpada;
public boolean getEstado(): retorna o estado da lâmpada (true=ligada, false=desligada).
Para este aplicativo, é necessário implementar a classe GerenciadorLampadas, que gerencia instâncias de lâmpadas inteligentes (ou seja, instâncias da classe LampadaInteligente). A seguir são apresentados os métodos necessários na classe GerenciadorLampadas. Esses métodos podem ser usados pelo sistema de correção e por isso devem seguir a especificação apresentada no enunciado. Você pode incluir atributos e métodos auxiliares adicionais que considerar necessários durante a implementação.

Classe GerenciadorLampadas:

public void adicionarLampada(): instancia uma nova lâmpada inteligente e adiciona a um vetor de LampadaInteligente. Considere que o tamanho máximo desse vetor é 10.
public void ligarLampada(int indiceLampada): liga a lâmpada instanciada no índice informado. Antes de ligar a lâmpada, o método deve verificar se a lâmpada já está ligada. É possível saber se a lâmpada está ligada por meio do método getEstado() presente na classe LampadaInteligente. Se a lâmpada já estiver ligada, a lâmpada não deve ser ligada novamente e o método deve lançar a exceção LampadaEstaLigada. A exceção LampadaEstaLigada é subclasse de Exception (mas não de RuntimeException). A exceção LampadaEstaLigada deve chamar o construtor da superclasse Exception com a seguinte mensagem: "A lampada ja esta ligada." (observe que não há acento na mensagem).
public void desligarLampada(int indiceLampada): desliga a lâmpada instanciada no índice informado. Antes de desligar a lâmpada, o método deve verificar se a lâmpada já está desligada. É possível saber se a lâmpada está ligada por meio do método getEstado() presente na classe LampadaInteligente.  Se a lâmpada já estiver desligada, a lâmpada não deve ser desligada novamente e o método deve lançar a exceção LampadaEstaDesligada. A exceção LampadaEstaDesligada é subclasse de Exception (mas não de RuntimeException). A exceção LampadaEstaDesligada deve chamar o construtor da superclasse Exception com a seguinte mensagem: "A lampada ja esta desligada." (observe que não há acento na mensagem).


Importante: A classe GerenciadorLampadas possui acesso público, as exceções LampadaEstaLigada e LampadaEstaDesligada possuem acesso package (sem modificador de acesso). Submeta as classes  LampadaEstaLigada, LampadaEstaDesligada e GerenciadorLampadas conforme descrito no enunciado (todas as classes submetidas devem estar no pacote "sem nome", ou seja, não inclua a linha package no código). A classe submetida não pode realizar impressão de dados, utilizar java.util e System.out.



Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

operações no formato: [código operação] (índice lâmpada)
operação 1: adicionar lâmpada
operação 2: ligar lâmpada
operação 3: desligar lâmpada
Saída:

métodos executados e saídas obtidas
 
----------------------------------------------------------------------------------------------------
 
### Autenticação usuário
 
Neste exercício, será usada a classe Usuario. Essa classe guarda o login e senha de um Usuario.


Classe Usuario (esta classe já está implementada no pacote acesso no sistema de correção automática):

Usuario(login: String, senha: String) - construtor de Usuario que armazena o login e a senha.
getLogin(): String - retorna o login da instância atual da classe Usuario.
autenticar(senha: String) - verifica se a senha passada é correta e, caso não seja, lança a exceção SenhaInvalida ou UsuarioBloqueado.


Escreva um programa para autenticar usuários com login e senha que use a classe Usuario, conforme descrito a seguir (o programa deverá ser implementado na classe AutenticacaoUsuario):

Lê um inteiro n, que é a quantidade de usuários a serem cadastrados.
Depois o programa receberá uma sequência de n pares "login senha". O programa deve instanciar a classe Usuario uma vez para cada usuário. O construtor de Usuario recebe o login e senha como argumentos, por exemplo: new Usuario("login", "senha");
Após instanciar todos os usuários, o programa recebe mais um inteiro (k), que representa a quantidade de tentativas de autenticação a serem realizadas.
Depois o programa receberá uma sequência de k pares "login senha". Desta vez, o programa deverá chamar o método autenticar do usuário correspondente ao login e, para esse usuário, passar a senha lida como argumento (assuma que sempre será passado um login de um usuário que existe). Após chamar o método autenticar, o programa deverá imprimir o resultado usando a classe Impressao de acordo com o caso (os três métodos são static na classe Impressao):
Impressao.imprimirUsuarioAutenticado(login: String): quando o método autenticar não lança exceção
Impressao.imprimirSenhaInvalida(login: String): quando o método autenticar lançar a exceção SenhaInvalida (ocorre se a senha passada é incorreta)
Impressao.imprimirUsuarioBloqueado(login: String): quando o método autenticar lançar a exceção UsuarioBloqueado (essa exceção é lançada se a senha é incorreta 3 ou mais vezes seguidas)
Observação: as classes das exceções SenhaInvalida e UsuarioBloqueado possuem um método chamado getLogin(): String, que pode ser usado para obter o login do usuário de onde a exceção foi lançada.



As classes Usuario, SenhaInvalida, UsuarioBloqueado e Impressao estão no pacote acesso e já existem no sistema de correção automática (portanto, não devem ser submetidas). Na aba Editar, há uma implementação inicial do programa com os imports necessários já incluídos.




Importante: Submeta apenas o programa principal (o programa deve estar no pacote sem nome, ou seja, sem a linha package). A impressão de dados é permitida apenas com a classe Impressao, usando os três métodos static especificados.



Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

n (quantidade de usuários)
sequência de "login senha" (para cadastro dos usuários)
k (quantidade de tentativas)
sequência de "login senha" (para chamar o método autenticar)
Saída:

dados impressos pelas classes Usuario, SenhaInvalida e UsuarioBloqueado ao longo do programa
saída dos métodos da classe Impressao
 
----------------------------------------------------------------------------------------------------
 
### Playlist com exceções
 
 Neste exercício, deve ser implementada uma classe chamada Playlist, que irá armazenar uma playlist de arquivos multimídia. Para isso, neste exercício, devem ser implementadas as classes públicas Playlist, ArquivoMultimidia, ArquivoVideo e ArquivoAudio (todas as classes devem estar no pacote multimidia). Além disso, também podem ser lançadas dois tipos de exceções e as classes para essas exceções devem ser implementadas também: IndiceArquivoInvalido e QuantidadeLimiteArquivos. A seguir são descritos detalhes sobre as situações em que essas exceções são lançadas e o que essas classes com as exceções devem conter.



Classe abstrata ArquivoMultimidia:

Construtor: public ArquivoMultimidia(String nomeArquivo, int tamanho) - construtor que inicializa o nome do arquivo e o tamanho.
Métodos:
public final String getNomeArquivo() - retorna o nome do arquivo.
public final int getTamanhoArquivo() - retorna o tamanho do arquivo.
public final void setNomeArquivo(String nomeArquivo) - alterna o nome do arquivo.
Classe ArquivoVideo (subclasse de ArquivoMultimidia):

Construtor: public ArquivoVideo(String nomeArquivo, int tamanho, int largura, int altura) - instancia um ArquivoVideo especificando o nome do arquivo, o tamanho e a resolução (largura e altura).
Método: public String toString() - sobrescreve o método toString() de Object. O retorno do método deve ser no formato "Video: %s (%d)" (observe que não há acento), em que %s é o nome do arquivo e o inteiro indicado com %d é o tamanho do arquivo.
Classe ArquivoAudio (subclasse de ArquivoMultimidia):

Construtor: public ArquivoAudio(String nomeArquivo, int tamanho, boolean audioHD) - instancia um ArquivoAudio especificando o nome do arquivo, o tamanho e se este arquivo tem áudio HD ou não.
Método: public String toString() - sobrescreve o método toString() de Object. O retorno do método deve ser no formato "Audio: %s (%d)" (observe que não há acento), em que %s é o nome do arquivo e o inteiro indicado com %d é o tamanho do arquivo.

Classe Playlist:

Construtor: esta classe deve possuir apenas o construtor sem parâmetros, que inicializa a playlist sem nenhum arquivo. Uma playlist pode ter no máximo 10 arquivos.
Métodos:
public void adicionarItem(ArquivoMultimidia arquivo) - adiciona um arquivo mulmídia no final da lista de arquivos. Se, ao adicionar um arquivo, a playlist já estava com 10 arquivos (limite máximo), deve ser lançada a exceção QuantidadeLimiteArquivos e o arquivo não é adicionado. A exceção QuantidadeLimiteArquivos é subclasse de Exception (mas não de RuntimeException) e seu construtor deve chamar o construtor da superclasse Exception com a mensagem "Quantidade limite de arquivos foi atingida.".
public void renomearItem(int indiceArquivo, String novoNomeArquivo) - altera o nome de um arquivo na lista de arquivos da playlist. Se o índice especificado não for válido (não há arquivo no índice especificado), deve ser lançada a exceção IndiceArquivoInvalido. A exceção IndiceArquivoInvalido é subclasse de Exception (mas não de RuntimeException) e seu construtor deve chamar o construtor da superclasse Exception com a mensagem "Indice de arquivo invalido = %d" (observe que não há acento na mensagem), em que o inteiro representado por %d é o valor do índice inválido que foi passado como argumento no método.
public void moverParaInicio(int indiceArquivo) - move o arquivo especificado para o início da lista. Se o índice especificado não for válido (não há arquivo no índice especificado), deve ser lançada a exceção IndiceArquivoInvalido. A exceção IndiceArquivoInvalido é a mesma que o método renomearItem pode lançar e que foi descrita anteriormente.
public String[] listarArquivos() - retorna um vetor de String com os retornos do método toString() dos arquivos na playlist. O comprimento desse vetor é a quantidade de arquivos adicionados na playlist.
public void ordenarArquivos(int tipo) - ordena os arquivos da playlist de acordo com o tipo de ordenação especificado no parâmetro tipo.
tipo=1 - Ordena os arquivos em ordem alfabética (lexicográfica) de nome. Caso a lista tenha mais de um arquivo com o mesmo nome, use a ordem crescente do tamanho do arquivo para desempate.
tipo=2 - Ordena os arquivos em ordem crescente de tamanho do arquivo. Caso a lista tenha mais de um arquivo com o mesmo tamanho, use a ordem alfabética (lexicográfica) para desempate.
Dica: para comparar duas Strings, é possível usar o método compareTo da classe String. Por exemplo:

String str1 = "ABC";
String str2 = "DEF";
int comparacao = str1.compareTo(str2);
O retorno pode ser um valor negativo (quando str1 vem antes de str2 na ordem lexicográfica), positivo (quando str2 vem antes de str1 na ordem lexicográfica) ou zero (quando str1 é igual a str2). Mais detalhes em: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String)



Observação: Não é permitido o uso de funções de ordenação prontas (por exemplo, sort). Implemente um algoritmo de ordenação. Também não use o termo "sort" em nenhuma parte do código.



Importante: Submeta apenas as classes públicas descritas no enunciado (todas devem estar no pacote multimidia) e também as classes das duas exceções: IndiceArquivoInvalido e QuantidadeLimiteArquivos (as duas classes das exceções tem acesso package). O programa principal já existe no sistema de correção automática. As classes submetidas não podem realizar impressão de dados, utilizar import e java.util.



Casos de teste
Para realizar os testes, o programa de correção instancia um objeto Playlist (playlist1). Após isso, diversos métodos são chamados ao longo do teste. Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada
quantidade de arquivos a serem instanciados
lista de arquivos a serem instanciados no formato [tipo] [nome do arquivo] [valores de atributos]
métodos chamados
Saída
verificação da classe ArquivoMultimidia e das classes das exceções QuantidadeLimiteArquivos e IndiceArquivoInvalido
arquivos instanciados
instanciação da classe Playlist
métodos chamados
 
----------------------------------------------------------------------------------------------------
 
 ## Semana 9 - Generics {#semana9}
 
----------------------------------------------------------------------------------------------------
 
### Pasta Compactada
 
Considere a seguinte hierarquia de classes de arquivos (essas classes já estão implementadas no sistema de correção automática dentro do pacote arquivos). Essas classes podem ser instanciadas com o construtor sem parâmetros.

![image](https://user-images.githubusercontent.com/57016670/150585966-4377128d-56dd-4650-929c-2117202c116b.png)
Classe Arquivo e subclasses

Descrição das classes no diagrama:

Classe Arquivo;
Classes Texto e Imagem, que são subclasses de Arquivo;
Classes TextoTXT e TextoDOCX, que são subclasses de Texto;
Classes ImagemPNG e ImagemJPEG, que são subclasses de Imagem.


Escreva um programa (pacote arquivos) para guardar arquivos de texto e de imagem em pastas compactadas. O programa deverá guardar duas pastas compactadas, uma para guardar apenas arquivos de texto e outra para guardar apenas arquivos de imagem.

Uma pasta compactada é representada por uma instância da classe PastaCompactada<T>. A classe PastaCompactada<T> já está implementada e possui um parâmetro de tipo T. Portanto, para instancar uma pasta compactada que armazenará apenas arquivos de Texto:

PastaCompactada<Texto> pastaTextos = new PastaCompactada<Texto>();
Os métodos da classe são:

adicionar(arquivo: T) - adicionar um arquivo (tipo T) na pasta compactada.
imprimir() - imprime os arquivos na pasta compactada.
O programa deve:
Instanciar duas pastas compactadas: uma para arquivos de texto e outra para arquivos de imagem;
Ler um número (quantidade de arquivos a serem adicionados);
Ler uma sequência de tipos de arquivos (cada tipo é uma String que corresponde ao nome da classe do arquivo). Ao ler um tipo, instancie a classe respectiva. Se o arquivo instanciado for uma imagem, ele deve ser adicionado na pasta de imagens e, se for um texto, na pasta de textos.
Após terminar de adicionar todos os arquivos, o programa deve chamar o método imprimir da pasta de textos e depois da pasta de imagens.

Importante: Submeta apenas o programa principal, que deverá estar na classe pública CompactaArquivos (o programa deve estar no pacote arquivos). O programa não pode realizar impressão de dados. A impressão de dados é permitida apenas com o método imprimir das pastas. Também não é permitido utilizar java.util ou import. Apenas o import java.util.Scanner é permitido.



Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

quantidade de arquivos a serem lidos (int)
lista de tipos de arquivos (sequência de String)
o tipo corresponde ao nome da classe que deve ser instanciada, conforme hierarquia de classes apresentada no enunciado
Saída:
saída do método imprimir para a pasta compactada com arquivos de texto
saída do método imprimir para a pasta compactada com arquivos de imagem 
 
----------------------------------------------------------------------------------------------------
 
### Fila de arquivos
 
Considere a seguinte hierarquia de classes de arquivos (essas classes já estão implementadas no sistema de correção automática dentro do pacote arquivos). Essas classes podem ser instanciadas com o construtor sem parâmetros.

![image](https://user-images.githubusercontent.com/57016670/150586133-0cd207a3-46d2-41b5-8793-7726c1dfe806.png)
Classe Arquivo e subclasses

Descrição das classes no diagrama:


Classe Arquivo;
Classes Texto e Imagem, que são subclasses de Arquivo;
Classes TextoTXT e TextoDOCX, que são subclasses de Texto;
Classes ImagemPNG e ImagemJPEG, que são subclasses de Imagem.


Escreva a classe FilaArquivos (pacote arquivos) que gerencia uma fila de arquivos e possui um parâmetro de tipo T. Nessa fila, os arquivos são organizados pela ordem que foram enfileirados. Quem é enfileirado primeiro é desenfileirado primeiro também (FIFO - first in first out).

A classe FilaArquivos deve implementar a interface Fila<T>. O código da interface pode ser consultado na aba "Editar" (esta interface não pode ser modificada).

Métodos da classe FilaArquivos:

FilaArquivos(n: int) - construtor que inicializa uma fila de arquivos com capacidade para armazenar n arquivos.
enfileirar(arquivo: T): boolean - adiciona um arquivo ao final da fila. Se conseguir enfileirar (há espaço na fila), retorne true. Se a fila estiver cheia e o arquivo não for enfileirado, retorne false.
desenfileirar(): T - retira o primeiro arquivo da fila e retorna. Se a fila estiver vazia, retorne null. O retorno do método é do tipo T.
Importante: Submeta apenas a classe pública FilaArquivos (pacote arquivos). A classe não pode realizar impressão de dados, utilizar java.util ou import. Apenas import java.util.ArrayList é permitido.



Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática). O programa de teste instancia duas filas (uma para textos e outra para imagens).

Entrada:

capacidade da fila de textos
capacidade da fila de imagens
lista de [fila] [operação] (tipo arquivo)
Saída:

verificação da classe FilaArquivos
resultado das operações executadas
 
----------------------------------------------------------------------------------------------------
 
### Maior e menor elemento
 
Escreva a classe Cubo (pacote geometria) que implementa a interface Comparable. Métodos da classe Cubo:

Cubo(lado: double) - construtor da classe Cubo que recebe o comprimento do lado do cubo.
area(): double - retorna a área do cubo conforme a fórmula a seguir 6×lado2
compareTo(c: Cubo) - implementação do método compareTo da interface Comparable (mais detalhes de como implementar este método nos slides e na vídeoaula sobre esta interface).
toString(): String - sobreposição do método toString() de Object. Retorna "cubo de area " + valor da área com uma casa decimal. Pode usar String.format("cubo de area %.1f", area());


É possível fazer um método simples para encontrar o maior inteiro em uma lista, ou o menor real em outra, mas e se quisermos esse comportamento generalizado para outros tipo de dados? Utilizamos Generics! Implemente os métodos menorElemento e maiorElemento, que recebem um array de um tipo T (sendo que T deve implementar a interface Comparable) e retornam o menor e maior elemento, respectivamente. Caso seja passado um array vazio, retorne null. Esses métodos estarão na classe Comparacao, conforme descrito a seguir.

Escreva a classe Comparacao (pacote geometria) que possui dois métodos static para retornar o maior e o menor elemento do vetor v:

public static <T extends Comparable<T>> T maiorElemento(T[] v) 
public static <T extends Comparable<T>> T menorElemento(T[] v) 


Importante: O programa principal já existe no sistema de correção automática. Submeta apenas as classes especificadas (pacote geometria). A classes não podem realizar impressão de dados, utilizar java.util ou import. O sistema de correção já possui uma classe chamada Esfera que implementa Comparable. Nesta classe, o método compareTo retorna -1, 0 ou +1 dependendo do caso (para mais detalhes do significado do retorno do método compareTo, veja a vídeoaula sobre a interface Comparable). O código submetido não deve usar esta classe Esfera. A classe Esfera existe no sistema apenas para testar os métodos maiorElemento e menorElemento, que devem funcionar para qualquer vetor com objetos que implementem Comparable.



Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

cubos [quantidade de cubos]
lados dos cubos
esferas [quantidade de esferas]
raios das esferas
Saída:
menor e maior cubo
menor e maior esfera
 
----------------------------------------------------------------------------------------------------
 
Semana 10 - Padrões de projeto de software {#semana10}
 
----------------------------------------------------------------------------------------------------
 
### Jogo da velha
 
O funcionário de uma empresa escreveu um programa para o Jogo da Velha, mas gostaria de adicionar algumas estratégias de jogo automáticas. Para isso, outro funcionário sugeriu utilizar o padrão de projeto Strategy, de forma que a classe com o tabuleiro utilize um algoritmo por meio de uma interface que pode ser implementada de diversas formas diferentes. Cada implementação representaria uma estratégia de jogo.

Um tabuleiro é representado por uma matriz de char conforme a seguir:

![image](https://user-images.githubusercontent.com/57016670/150587512-e2adb4f7-264f-4bb4-8be3-38732097f012.png)
Tabuleiro - jogo da velha.

Duas estratégias que devem ser implementadas são: Estratégia A e Estratégia B (há também uma Estratégia C que já está implementada no sistema de correção automática). As estratégias seguem a ideia de percorrer a matriz e retornam como próxima jogada a primeira célula que encontram livre. O percurso das estratégias A e B é apresentado a seguir:

![image](https://user-images.githubusercontent.com/57016670/150587558-60e651d9-9bcf-432b-85e6-7cd5b4902223.png)
Estratégias A e B para o jogo da velha.



A classe Tabuleiro e a interface EstrategiaJogo já estão implementadas no sistema de correção automática (o código pode ser consultado na aba Editar).

Classe Tabuleiro:

public Tabuleiro() - construtor da classe Tabuleiro. Inicializa todas as posições do tabuleiro com o caractere ponto: '.'
public char[][] getTabuleiro() - retorna uma cópia dos dados do tabuleiro (matriz 3x3)
public char getJogadorVencedor() - returna o jogador vencedor: 'X' ou 'O'. Se não existir vencedor, retorna ponto '.'. Caso seja empate, retorna hífen '-'.
public void jogar(char jogador, int linha, int coluna) - recebe o jogador (pode ser 'X' ou 'O') e joga na posição informada. O método também imprime o tabuleiro depois de realizar a jogada.
Interface EstrategiaJogo:

int[] getProximaJogada(char[][] dadosTabuleiro, char jogador) - a implementação deve retornar as coordenadas da próxima jogada. O retorno é um vetor de duas posições, em que a posição 0 representa a linha e a posição 1 a coluna.


Tarefa
Escreva as classes TabuleiroEstrategia, EstrategiaA e EstrategiaB conforme descrito a seguir (todas as classes devem estar no pacote jogo):

[acesso public] Classe TabuleiroEstrategia (estende a classe Tabuleiro)

public void setStrategyJogador1(EstrategiaJogo jogador1) - armazena uma referência para a implementação de EstrategiaJogo para o jogador 1.
public void setStrategyJogador2(EstrategiaJogo jogador2) - armazena uma referência para a implementação de EstrategiaJogo para o jogador 2.
public void jogarPartida() - executa uma partida de jogo da velha completa. A cada jogada, o método getProximaJogada da estratégia correspondente é chamado e ele retorna as coordenadas para a próxima jogada. Ao receber as coordenadas, deve ser chamado o método jogar (herdado da classe Tabuleiro) passando as coordenadas e o jogador ('X' ou 'O'). O método jogarPartida deve intercalar jogadas do jogador 1 e do jogador 2 até o jogo terminar. Para saber se o jogo terminou, use o método getJogadorVencedor (herdado da classe Tabuleiro). Considere que sempre o jogador 1 começa e que ele utiliza 'X', portanto, o jogador 2 utiliza 'O'.
[acesso package] Classe EstrategiaA (implementa a interface EstrategiaJogo)

public int[] getProximaJogada(char[][] dadosTabuleiro, char jogador) - retorna as coordenadas da próxima jogada seguindo a estratégia A.
[acesso package] Classe EstrategiaB (implementa a interface EstrategiaJogo)

public int[] getProximaJogada(char[][] dadosTabuleiro, char jogador) - retorna as coordenadas da próxima jogada seguindo a estratégia B.


Importante: O programa principal já existe no sistema de correção automática. Submeta apenas as classes especificadas (pacote jogo): TabuleiroEstrategia, EstrategiaA e EstrategiaB.

A classes submetidas não podem realizar impressão de dados, java.util ou utilizar import (observação: a única forma de impressão permitida é por meio do método jogar da classe Tabuleiro, que imprime o tabuleiro a cada jogada realizada).
A classe Tabuleiro e a interface EstrategiaJogo já estão prontos (não altere o código desses arquivos).
O sistema de correção também possui uma estratégia já implementada (a EstrategiaC) que é usada apenas para testar o código submetido. Não é necessário conhecer o funcionamento da estratégia C para realizar este exercício. Ao utilizar o padrão de projeto Strategy, a classe TabuleiroEstrategia deve funcionar para qualquer implementação da interface EstrategiaJogo.


Casos de teste

Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

estratégia para o jogador 1 ('X')
estratégia para o jogador 2 ('O')
Saída:

verificação das classes
comandos executados e saídas obtidas
 
----------------------------------------------------------------------------------------------------
 
## Bonus {#bonus}
 
----------------------------------------------------------------------------------------------------
 
### Parte 1 - Lista de exemplos
 
Nesta primeira parte do exercício, deve ser implementada uma lista de exemplos. A lista de exemplos neste exercício é um conjunto de dados formado por uma tabela. Cada linha da tabela é um exemplo.

A figura a seguir mostra uma lista de exemplos:

Lista de exemplos

Nessa tabela, cada linha é um exemplo. Os atributos a1, a2 e a3 serão chamados de atributos de entrada e o último atributo (última coluna) será chamado de rótulo da classe. Neste exercício, todos os atributos de entrada são do tipo double e o rótulo da classe será representado por um número inteiro.

Esses dados da lista de exemplos serão usados em [Bonus] Parte 2 - Algoritmo de classificação para que um algoritmo possa predizer o rótulo da classe ao receber novos valores dos atributos de entrada (dados de teste).



Ordenação pela distância
Conforme será descrito mais a frente, uma funcionalidade que deverá ser implementada neste exercício é a ordenação dos exemplos pela distância com relação a um determinado conjunto de valores de atributos de entrada.

No caso deste exercício, a distância utilizada será a distância Euclidiana, que é calculada de acordo com a fórmula a seguir:

∑i=1n(xi−yi)2−−−−−−−−−−√

Cálculo da distância Euclidiana entre x=[1,2,1] e y=[3,0,9]

(1−3)2+(2−0)2+(1−9)2−−−−−−−−−−−−−−−−−−−−−−−√=4+4+64−−−−−−−−√=8,49

No caso da lista de exemplos, é possível calcular a distância de cada exemplo na tabela com relação um determinado conjunto de valores de atributos de entrada (o cálculo da distância considera apenas os atributos de entrada, no caso a1, a2 e a3). A tabela a seguir, mostra a distância entre cada exemplo na lista e os valores [5, 7, 1]:

Lista de exemplos e distâncias

A partir das distâncias, os exemplos podem ser ordenados pela distância (ordem crescente), conforme apresentado a seguir:

Lista de exemplos ordenada pela distância



Classes a serem implementadas
Duas classes devem ser implementadas nesta parte 1 do exercício: Exemplo e ListaExemplos (as duas classes devem estar no pacote classificacao). A seguir, são apresentados os métodos necessários em cada uma das classes.

[acesso package] Classe Exemplo

public Exemplo(double[] atributosEntrada, int rotuloClasse) - construtor que inicializa o exemplo com os valores dos atributos de entrada e o rótulo da classe.
public double[] getAtributosEntrada() - retorna os valores dos atributos de entrada.
public int getRotuloClasse() - retorna o valor do rótulo da classe.
[acesso public] Classe ListaExemplos

public ListaExemplos(int maxQtd) - construtor que recebe como parâmetro a quantidade máxima (maxQtd) de exemplos que a lista pode possuir.
public void adicionarExemplo(Exemplo exemplo) - adiciona um exemplo ao final da lista de exemplos.
public void ordenarPelaDistancia(double[] atributosEntrada) - ordena os exemplos da lista em ordem crescente considerando a distância Euclidiana de cada exemplo com relação aos valores de atributos de entrada passados como parâmetro para o método. Uma explicação mais detalhada sobre como essa ordenação deve ser realizada é apresentada neste enunciado na seção Ordenação pela distância.
public int getQtdExemplos() - retorna a quantidade de exemplos na lista.
public Exemplo[] getExemplos() - retorna todos os exemplos armazenados na lista.
public Exemplo[] getPrimeirosExemplos(int n) - retorna os primeiros n exemplos na lista.
public Exemplo[] getUltimosExemplos(int n) - retorna os últimos n exemplos na lista.


Observação: Não é permitido o uso de funções de ordenação prontas (por exemplo, sort). Implemente um algoritmo de ordenação. Também não use o termo "sort" em nenhuma parte do código.



Importante: Submeta apenas as classes Exemplo e ListaExemplos descritas no enunciado (todas as classes devem estar no pacote classificacao). As classes submetidas não podem realizar impressão de dados, utilizar import e java.util.



Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada
Sequência de operações no formato:
instanciarListaExemplos [qtdMax]
lista [índice lista] adicionarExemplo [qtd_atributos_entrada] (valores dos atributos de entrada) [rótulo da classe]
lista [índice lista] ordenarPelaDistancia [qtd_atributos_entrada] (valores dos atributos de entrada) [rótulo da classe]
lista [índice lista] getExemplos
lista [índice lista] getPrimeirosExemplos [n]
lista [índice lista] getUltimosExemplos [n]
Saída
Operações executadas e saídas obtidas
 
 
 
 
 
 
 
 
