###📚 Projeto de Exercícios em Java

##✨ Descrição
Este projeto Java consiste em vários módulos, cada um implementando funcionalidades específicas, como operações bancárias, gerenciamento de agenda, cálculos geométricos e muito mais. Um ponto de entrada unificado (MainApp) permite a execução de todos os módulos através de um menu interativo.

##🗂️ Estrutura do Projeto
O projeto está organizado em pacotes, cada um representando um módulo funcional:

- agenda: Gerenciamento de contatos e agenda.
- aluno: Funcionalidades relacionadas ao aluno, como cálculo de notas.
- banco: Simulação de operações bancárias, incluindo contas e transações.
- biblioteca: Gerenciamento de empréstimos de livros.
- calendario: Operações relacionadas a datas e feriados.
- carro: Modelagem de um carro e suas operações.
- circulo: Cálculo da área e do perímetro de um círculo.
- contabancaria: Gerenciamento de contas bancárias.
- funcionario: Operações relacionadas a funcionários, como cálculo de salário líquido.
- jogoadivinhacao: Um jogo de adivinhação de números.
- jogocartas: Jogo de cartas simples.
- livro: Gerenciamento de livros e histórico de empréstimos.
- lojavirtual: Simulação de uma loja virtual com funcionalidades de adicionar produtos ao carrinho.
- maquinadevendas: Simulação de uma máquina de vendas.
- paciente: Gerenciamento de pacientes e histórico de consultas.
- pessoa: Operações relacionadas a uma pessoa, como exibição de informações.
- produto: Gerenciamento de produtos em uma loja.
- redesocial: Simulação de uma rede social com funcionalidades de postagem e adição de amigos.
- retangulo: Cálculo da área e do perímetro de um retângulo.
- triangulo: Verificação e classificação de um triângulo.

##📋 Pré-requisitos
- Java Development Kit (JDK) 8 ou superior: Certifique-se de que o JDK está instalado e configurado no seu sistema.
- IDE: Recomenda-se o uso de uma IDE (Eclipse, IntelliJ IDEA, Visual Studio Code) para compilar e executar o projeto.

##🛠️ Compilação do Projeto
1. Abra o terminal e navegue até o diretório raiz do projeto (onde está localizado o diretório src).
2. Execute o comando abaixo para compilar os arquivos Java:

javac -d bin src/**/*.java
Isso compilará todos os arquivos .java e colocará os arquivos .class no diretório bin.

##🚀 Executando a Aplicação
Após compilar o projeto, execute o aplicativo principal (MainApp) com o comando:

java -cp bin MainApp
Um menu interativo aparecerá no terminal, permitindo que você escolha a funcionalidade desejada.

##📝 Uso do MainApp
O MainApp é o ponto de entrada unificado do projeto. Ao executar, ele apresenta um menu com as opções para acessar as funcionalidades de cada módulo.
- Para selecionar uma funcionalidade, insira o número correspondente no menu e pressione Enter.
- Siga as instruções exibidas para interagir com o módulo selecionado.

##🛠️ Renomeação das Classes Main
Para evitar conflitos, as classes Main foram renomeadas em cada pacote. Abaixo estão os nomes atualizados:

- agenda.Main_14 ➡️ Main_14
- aluno.Main_4 ➡️ Main_4
- banco.Main_12 ➡️ Main_12
- (Siga o mesmo padrão para os demais pacotes.)

Dica: Atualize os imports no MainApp para refletir os novos nomes:
import agenda.Main_14;
import aluno.Main_4;

##🗂️ Como Adicionar Novos Módulos
1. Crie um novo pacote no diretório src.
2. Implemente as funcionalidades necessárias no novo pacote.
3. Adicione uma nova classe principal (ex.: NovoModuloMain).
4.  Atualize o MainApp para incluir o novo módulo no menu interativo.

##📦 Contribuição
1. Faça um fork do repositório.
2. Crie um branch para suas alterações.
3. Submeta um pull request com as suas melhorias ou correções.

##📜 Licença
Este projeto está licenciado sob a licença MIT. Sinta-se à vontade para usar, modificar e distribuir.

##📞 Contato
Para dúvidas ou sugestões, sinta-se à vontade para entrar em contato.