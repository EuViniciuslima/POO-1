# Programação Orienntada a Objetos 1
Repositório para resolução das questões de Programação Orientada a Objetos (POO) (UFRN)

TEXTO-02

2.2 Receber dois inteiros e retorná-los em ordem crescente

2.3 Receber três números reais e retorná-los em ordem decrescente

2.4 Receber um número real e retornar sua raiz quadrada

2.5 Receber dois Strings e informar se o primeiro String está contido no segundo (use o método indexOf)

2.6 Receber dois Strings e retorná-los em ordem alfabética (use o método compareTo)

2.7 Receber três Strings e retorná-los em ordem alfabética (use o método compareTo)

2.8 Receber um array de Strings na forma "nome sobrenome" e retornar um array na forma "sobrenome, nome" (use os métodos indexOf e substring)

2.9 Receber um array de Strings e modificá-lo de forma que todos os seus itens fiquem com todas as letras maiúsculas (use o método toUpperCase)

2.10 Receber um array de Strings e retornar um array com os mesmos Strings mas com todas as letras maiúsculas (use o método toUpperCase)

2.11 Receber um vetor de inteiros. Percorrer o vetor com um comando for. A cada repetição, troque o elemento corrente com o que estiver uma posição à frente sempre que o elemento da frente for menor que o elemento corrente. 

2.12 Adapte o exercício anterior de forma que as trocas sejam efetuadas e, além disso, o método retorne a quantidade de trocas realizadas. 

2.13. Adapte o exercício anterior para que funcione com um vetor de Strings e faça as trocas sempre que um String for lexicograficamente maior que o String que está à sua frente no vetor. Lembre de retornar o número de trocas.

2.14 (Desafio) Receber um vetor de inteiros e modificá-lo para que fique em ordem decrescente. Dica de amigo: se você usar o método do exercício 2.12 e a quantidade de trocas retornada for 0 (zero), o vetor estará ordenado. É possível chamar um método de dentro de outro, assim como em qualquer linguagem de programação que você já estudou.

2.15 (Desafio) Receber um vetor de Strings e modificá-lo para que fique ordem alfabética. Dica de amigo: veja a dica de amigo da questão anterior.

2.16 (Desafio) Receber um vetor de Strings na forma "nome sobrenome" e modificá-lo para que fique ordenado alfabeticamente por sobrenome. Por exemplo: se o vetor {"robert plant", "ian gillan", "neil young"} for passado como parâmetro, após a execução do método, o conteúdo do vetor deve ser {"ian gillan", "robert plant",  "neil young"}. Sem dicas, se vire sozinho.

2.17 (Desafio) Receber um vetor de Strings na forma "nome sobrenome" e modificá-lo para que fique ordenado alfabeticamente por sobrenome e com a forma dos strings alterada para "sobrenome, nome".  Por exemplo: se o vetor {"robert plant", "ian gillan", "neil young"} for passado como parâmetro, após a execução do método, o conteúdo do vetor deve ser {"gillan, ian", "plant, robert",  "young, neil"}




TEXTO-03

3.1 Obter a data atual do sistema e retorná-la na forma de String.

3.2 Receber uma data (como String) no formato dd/mm/aaaa e retornar a mesma data (como String) no formato "<dia da semana>, <dia> de <nome do mês> de <ano>"

3.3 Receber um caminho de diretório como parâmetro e retornar um vetor com todos os itens do diretório. Dica: objetos da classe File podem ser usados para realizar operações sobre diretórios, entre várias outras coisas. Analise a documentação da classe File para saber além do que já foi descrito no conteúdo deste texto.

3.4 Receber um caminho de diretório como parâmetro e retornar um vetor com todos os itens do diretório. Cada item do vetor retornado deve estar precedido por "[A]", caso seja arquivo, e "D", caso seja diretório. Retorne um valor nulo caso o String recebido como parâmetro não corresponda a um diretório existente no disco. Mais uma vez, você precisará de um objeto da classe File para fazer o trabalho sujo para você.

3.5 Receber um caminho para um arquivo como parâmetro e deletar o arquivo. 

3.6 (Desafio) Escreva um programa que mostre uma janela com dois menus - Arquivo e Editar. Dica: você deverá utilizar objetos das classes JFrame, JMenuBar e JMenu). 

3.7 (Desafio) Escreva um método que receba como parâmetro um String representando um caminho para um arquivo executável e execute tal arquivo. Dica: pesquise no google "java como executar programas externos" (SEM as aspas) e seja feliz (você pode ter que escrever código que não vai entender bem - a ideia aqui é que você desenrole a solução independentemente de entender o que está acontecendo. Acredite, isso lhe será muito útil em sua vida de programador)

3.8 (Desafio) Escreva um método que receba o caminho de um arquivo de texto (txt) e abra o arquivo no bloco de notas (notepad no windows ou qualquer gedit no Ubuntu). Dica: você vai precisar apenas da solução da questão anterior e de um real a mais de esperteza.

3.9 (Desafio) Faça um método que mostre uma Janela (vazia) do tamanho da tela. O programa deve funcionar em monitores com diferentes resoluções. Dica de professor: a classe ToolKit pode prover o tamanho da tela. Dica de MÃE: pesquise "como criar uma janela tela cheia em java" (sem aspas, pelo amor de Deus) e seja feliz.

3.10 Receber duas datas como parâmetro e retornar a mais recente

3.11 (Desafio) Receber um array de Dates e modificar o array de forma que fique em ordem cronológica. Dica: use o método compareTo da classe Date

3.12 Receber uma data, na forma de String, no formato dd/mm/aaaa, e retornar o dia da semana referente à data.
