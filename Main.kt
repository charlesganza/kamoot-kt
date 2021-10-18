enum class Sport { HIKE, RUN, TOURING_BICYCLE, E_TOURING_BICYCLE }

data class Summary(val sport: Sport, val distance: Int)

fun main(args: Array<String>){

    val sportStats = listOf(Summary(Sport.HIKE, 92),
        Summary(Sport.RUN, 77),
        Summary(Sport.TOURING_BICYCLE, 322),
        Summary(Sport.E_TOURING_BICYCLE, 656))

    /*
    * we are filtering only getting values that don't start with E and only printing the item that has the biggest distance
    * I love Kotlin oneliners :) Java is cool and all but it's so verbose
    * */
    println(sportStats.filter { !it.sport.toString().startsWith("E_") }.maxOf { it.distance })

}
