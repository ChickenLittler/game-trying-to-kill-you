fun chooseSpecies(selection: String): String {

    when (selection) {
        "b" -> {
            return "you are a robot"
        }
        "a" -> {
            return "you are a werewolf"
        }
        "c" -> {
            return "you are a human"
        }
        "d" -> {
            return "you are a dwarf"
        }
        "e" -> {
            return "you are a elf"
        }
        "f" -> {
            return "you are a goblin"
        }
        "g" -> {
            return "you are a dragonborn"
        }
        "h" -> {
            return "you are a fish"
        }
        "i" -> {
            return "you are a rat"
        }
        else -> {
            return "you are an insignificant speck of dust with one hp and a..."
        }
    }
}
fun choseClass(selection: String, species: String): String {
    when (selection) {
        "a" -> {
            return "you are a $species paladin"
        }
        "b" -> {
            return "you are a $species wizard"
        }
        "c" -> {
            return "you are a $species ranger"
        }
        "d" -> {
            return "you are a $species fighter"
        }
        "e" -> {
            return "you are a $species druid"
        }
        "f" -> {
            return "you are a $species cleric"
        }
        else -> {
            return "you are a ${species} bum"
        }
    }
}
    fun main() {
        println("Type a for werewolf")
        println("Type b for robot")
        println("Type c for human")
        println("Type d for dwarf")
        println("Type e for elf")
        println("Type f for goblin")
        println("Type g for dragonborn")
        println("Type h for fish")
        println("Type i for rat")
        println("Don't press anything and see what happens")
        val you = readLine() ?: ""
        val species = chooseSpecies(you)
        println(chooseSpecies(you))
        println("press a for paladin")
        println("press b for wizard")
        println("press c for ranger")
        println("press d for fighter")
        println("press e for druid")
        println("press f for cleric")
        println(" don't press anything and see what happens")
        val played = readLine() ?: ""
        println(choseClass(played, species))
        println("   #######")
        println("  ##########")
        println(" ##  ####  ##")
        println("##    ##    ##")
        println("###  ####  ###")
        println("##############")
        println("#  ########  #")
        println(" #  ######  #")
        println("  #       #")
        println("   #######")
        println("")
        println("I am your wonderful dm and im here to kill you as fast as I can. ENJOY!!!")
        val surviveNight1 = readLine() ?: ""
        println()
    }