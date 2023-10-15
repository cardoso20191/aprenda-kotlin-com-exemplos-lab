val inscritos = mutableListOf<Usuario>()

fun matricular(usuario: Usuario) {
    inscritos.add(usuario)
}

fun adicionarConteudo(conteudo: ConteudoEducacional) {
    conteudos.add(conteudo)
}

fun removerConteudo(conteudo: ConteudoEducacional) {
    conteudos.remove(conteudo)
}

fun listarConteudos() {
    println("Conteúdos da formação $nome:")
    for (conteudo in conteudos) {
        println(conteudo.nome)
    }
}

fun listarInscritos() {
    println("Inscritos na formação $nome:")
    for (usuario in inscritos) {
        println(usuario.nome)
    }
}
}

fun main() { val usuario = Usuario("João", Nivel.INTERMEDIARIO) val formacao = Formacao("Desenvolvimento de Software", mutableListOf())

formacao.matricular(usuario)

val conteudo1 = ConteudoEducacional("Introdução à Programação")
val conteudo2 = ConteudoEducacional("Algoritmos")

formacao.adicionarConteudo(conteudo1)
formacao.adicionarConteudo(conteudo2)

formacao.listarConteudos()

formacao.listarInscritos()

formacao.removerConteudo(conteudo2)

formacao.listarConteudos()
