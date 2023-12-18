fun main(args: Array<String>) {
    println("Введите координаты точек")
    println("Введите х1")

    var x1 = readln().toInt()

    println("Введите y1")

    var y1 = readln().toInt()

    println("Введите х2")

    var x2 = readln().toInt()

    println("Введите y2")

    var y2 = readln().toInt()

    println("Введите х3")

    var x3 = readln().toInt()

    println("Введите y3")

    var y3 = readln().toInt()

    println("Введите Хточки")

    var Xt = readln().toInt()

    println("Введите Yточки")

    var Yt = readln().toInt()

    if (x1 < 0 || x2 < 0 || x3 < 0 || y1 < 0 || y2 < 0 || y3 < 0 || Xt < 0 || Yt < 0) {
        println("Введены неправильные данные для координат")
    }

    var res1 = (x1 - Xt) * (y2 - y1) - (x2 - x1) * (y1 - Yt)
    var res2 = (x2 - Xt) * (y3 - y2) - (x3 - x2) * (y2 - Yt)
    var res3 = (x3 - Xt) * (y1 - y3) - (x1 - x3) * (y3 - Yt)

    if (res1 > 0 && res2 > 0 && res3 > 0) {
        println("Точка лежит в треугольнике")
    }
    else {
        println("Точка не лежит в треугольнике")
    }


}