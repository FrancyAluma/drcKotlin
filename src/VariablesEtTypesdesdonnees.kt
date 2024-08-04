// VARIABLES :
/* Il a 2 sortes de variables:
les variables dont le valeurs peuvent etre reassignees qu'on symbolise par(var) et
celles dont les valeurs ne peuvent etre reassignees que l'on symbolise par (val)
 */

// Types des Donnees ou DATATYPES

/* Il existe 5 datatypes:
1. Character, qui est une lettre qu'on symbolise par (Char). Ex: var sexe : Char = 'M'
2.String ( qui est une chaine ou ensemble de caracteres). Ex : var nom : String = "Francy"
3.Integer ( qui est un entier). On le symbolise par (Int). Ex : val nombre : Int = 28
4. Double (qui est un nombre decimal). Ex : var decim : Double = 95.5
5. Float ( qui est un grand nombre decimal. Mais dans la plupart des cas, on utilise Double)
 Ex: var munene: Float = 926,4366
 */

fun main() {

    println("La Somme de 7+8 est ${7+8}")

    println("""
        
        Bonjour A tous!
        ==============
        
              Je m'appelle Francis Aluma et Je suis un Billionnaire
        
    """.trimIndent())  // ca permet d'imprimer un texte a plusieurs lignes
    println("Entrez votre chiffre chanceux: ")
    var chiffre = readln()
    println("Le chiffre chanceux est $chiffre")
//
    //Lorqu'on reassigne une valeur a une variable, la nouvelle valeur ecrae l'ancienne

    var prixsoso = 80
    prixsoso = 120
    prixsoso = prixsoso + 40
    prixsoso = prixsoso - 10
    prixsoso-- // Qand on met -- ou ++ C'est pour dire a programme que nou voulons ajouter ou soutraire de 1
    println("Le Prix du poulet est $prixsoso")

}