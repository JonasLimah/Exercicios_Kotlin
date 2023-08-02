package limah.jonas.catalogoMusica

class Song(
    private var title: String,
    private var artista: String,
    private var lancamento: Int,
    private var rated: Double
) {
    private var isGood: Boolean = false
    fun isGood() {
        if (this.rated < 1_000) {
            isGood = true
            println("A musica é boa? $isGood")
        } else {
            isGood = false
            println("A musica é boa? $isGood")
        }

    }

    fun descriptions() {
        "[${this.title}], de [${this.artista}], lançado em [${this.lancamento}].".also(::println)
    }
}