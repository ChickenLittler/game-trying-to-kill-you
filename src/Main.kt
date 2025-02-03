fun chooseSpecies(selection: String, stats: Stats): String {

    when (selection) {
        "b" -> {
            stats.dexterity += 2
            stats.strength += 3
            stats.intelligence += 4
            stats.vitality += 4
            stats.wisdom -= 6
            stats.charisma -= 3
            return "you are a robot"
        }
        "a" -> {
            stats.dexterity += 4
            stats.strength += 4
            stats.intelligence -= 3
            stats.vitality += 4
            stats.wisdom -= 2
            stats.charisma -= 4
            return "you are a werewolf"
        }
        "c" -> {
            stats.dexterity += 2
            stats.strength += 2
            stats.intelligence += 2
            stats.vitality += 2
            stats.wisdom += 2
            stats.charisma += 2
            return "you are a human"
        }
        "d" -> {
            stats.dexterity -= 3
            stats.strength += 6
            stats.intelligence += 1
            stats.vitality += 6
            stats.wisdom -= 3
            stats.charisma -= 2
            return "you are a dwarf"
        }
        "e" -> {
            stats.dexterity += 5
            stats.strength -= 2
            stats.intelligence += 4
            stats.vitality -= 3
            stats.wisdom += 6
            stats.charisma -= 3
            return "you are a elf"
        }
        "f" -> {
            stats.dexterity += 7
            stats.strength -= 3
            stats.intelligence += 3
            stats.vitality -= 3
            stats.wisdom -= 3
            stats.charisma -= 7
            return "you are a goblin"
        }
        "g" -> {
            stats.dexterity += 3
            stats.strength += 3
            stats.intelligence += 3
            stats.vitality += 3
            stats.wisdom += 3
            stats.charisma += 3
            return "you are a dragonborn"
        }
        "h" -> {
            stats.dexterity += 15
            stats.strength += 15
            stats.intelligence -= 10
            stats.vitality -= 10
            stats.wisdom -= 10
            stats.charisma -= 10
            return "you are a fish"
        }
        "i" -> {
            stats.dexterity += 3
            stats.strength -= 3
            stats.intelligence += 15
            stats.vitality += 3
            stats.wisdom -= 7
            stats.charisma -= 7
            return "you are a rat"
        }
        else -> {
            stats.dexterity += 20
            stats.strength -10
            stats.intelligence -10
            stats.vitality -10
            stats.wisdom -10
            stats.charisma -=10
            return "you are an insignificant speck of dust with one hp and a..."
        }
    }
}
fun choseClass(selection: String, species: String, stats: Stats): String {
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

class Stats() {
    fun displayStats() {
        println("your weak your strength is: ${strength}, your vitality is: ${vitality}, yor intelligence is: ${intelligence}, your wisdom is: ${wisdom}, your charisma is: ${charisma}, your dexterity is: ${dexterity}")
    }

    public var strength: Int = 0;
    public var vitality: Int = 0
    public var intelligence: Int = 0
    public var wisdom: Int = 0
    public var charisma: Int = 0
    public var dexterity: Int = 0

}

    fun main() {
        var stats = Stats();
        stats.strength += 10
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
        val species = chooseSpecies(you,stats)
        println(species)
        println("press a for paladin")
        println("press b for wizard")
        println("press c for ranger")
        println("press d for fighter")
        println("press e for druid")
        println("press f for cleric")
        println(" don't press anything and see what happens")
        val played = readLine() ?: ""
        println(choseClass(played, species,stats))
        stats.displayStats();
        println("   #######")
        println("  ###########")
        println(" ##  #####  ##")
        println("## O #### O ##")
        println("###  ####  ###")
        println("##############")
        println("#  ########  #")
        println(" #  ######  #")
        println("  #        #")
        println("   #######")
        println("")
        println("I am your wonderful dm and im here to kill you as fast as I can. ENJOY!!!")
        val surviveNight1 = readLine() ?: ""
        println()
    }