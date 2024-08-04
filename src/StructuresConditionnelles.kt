/* Les Structures Conditionnelle marchent souvent de paires avec les expressions bouleennes
true or false
 */
fun main() {
    var skibo = 40
    println(skibo==40)
    println()
    // IF and WHEN

    //IF
    var yan = 17
     if (yan > 18 ) println("Vou etes majeur")
    else if (yan < 18 ) println("Vou etes mineur")
    else println("vou n'etes pas encore ne")
    println()

    println("Entrez le jour de semaine: ")
    var prielle = readln().toInt()
    var dechris = if (prielle == 1 )"Lundi"
    else if (prielle == 2) "Mardi"
    else if (prielle == 3) "Mercredi"
    else if (prielle == 4) "Jeudi"
    else if (prielle == 5) "Vendredi"
    else if (prielle == 6) "Samedi"
    else if (prielle == 7) "Dimanche"
    else println("Invalide")
    println(dechris)

    println("--------------------------- ")
    //WHEN

    println("Entrez Votre age:")
     var age :Any = readln().toInt()
     var foo = when(age) {
         0,1,2,4,5,6,7,8,9 -> "Vous etes un bebe"
         in 10..17 -> "Vous etes mineur"
         18 -> "Vous etes majeur"
         in 50..100 -> "Oza koko"
         is String -> "Entre un entier" // A ete accepter parce qu'il y a "Any"
         else -> "oyebani te"
    }
    println(foo)



    println("Entrez Une lettre de l'alphabet:")
    var alphabet  = readln()
     when (alphabet) {
         "a" -> println("Aluma")
         "b"-> println("Bembi")
         "c"-> println("Charles")
         "d"-> println("Dody")
         "e"-> println("Esdras")
         else -> println("On va rajouter d'autres lettres apres")
     }


}