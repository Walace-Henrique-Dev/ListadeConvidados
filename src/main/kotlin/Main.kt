fun main(args: Array<String>) {

    /*
    1. Crie um projeto chamado cadastroDeConvidados
    2. Crie um loop (pode ser usado o while) e coloque um when dentro da estrutura, para simular um menu de escolhas:]
    - O Loop precisa ficar ativo enquanto uma variável simNao estiver como "Sim", a partir do momento que o usuário digitar "Não" ou qualquer outra coisa, o programa precisa ser finalizado.
    - Se o usuário escolher 1, abre as instruções para adicionar um novo convidado
    - Se o usuário escolher 2, abre as instruções para remover um convidado
    - Se o usuário escolher 3, lista os convidados
    3. Use a List para cadastrar cada convidado
    4. Teste para ver se tudo funciona
     */

    var nome = mutableListOf("Walace", "Henrique", "Silva")



    while (true) {
        println("Digite sim para ver as opções: ")
        var opcao = readLine()!!

        if (opcao != "sim") {
            break
        }
        println(
            "Digite 1 se for adiciona uma pessoa a lista: " +
                    " \nDigite 2 se for remove da lista:" +
                    "  \nDigite 3 para ver a lista: "
        )
        var escolha = readLine()!!

        when(escolha){
            "1" ->{
                println("\nDigite o nome do convidado:")
                var convidado = readLine()!!
                nome.add(convidado).toString()

            }
            "2" ->{
                println("Digite um convidado para remover da lista:\n")
                var convidado = readLine()!!
                if (nome.contains(convidado)){
                    nome.remove(convidado)
                    print("O convidado foi removido: $convidado \n")
                }else{
                    println("O convidado: $convidado não existe \n ")
                }
            }
            "3" ->{ println(" \nA lista de convidado: $nome \n") }

        }



    }

}







































