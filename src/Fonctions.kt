/* Un programme peut avoir plusieurs fonctions et pour que ces foctions soient imprimees par
le console, on doit les appeler dans la fonction principale qui est (main) ou tu peux aussi les appeler
dans une autre fonction mais tu dois appeler cette fonction dans la fonction principale
*/

fun main() {
    var identite = famille("Susan", 30)
    println("""
        Bienvenue au Femua
        ==================
       $identite
    """.trimIndent())

    println()

    println("Votre Chiffre Lotto est ${lotto()}")

    println()

    saluer()
}

fun saluer () {

    println("Salut Sulubu")
    var anniv = malula()
    println("Votre jour d'anniv est le $anniv")
}

/* l'utilisation de "return".
Pour Utiliser "return", On doit d'abord definir la nature ou le datatype de notre fonction
 */

fun lotto () : Int {
    var chiffre = (7+8)
    return chiffre
}

fun malula(): String {

    println("Entrez le jour de votre naissance:")
    val date = readln()
    return date
}

fun famille (nom:String , age : Int) : String {

    val personne = "Votre nom est $nom Vous avez $age ans"
    return personne

}
