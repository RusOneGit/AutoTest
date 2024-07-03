fun main() {
    // var card = "VK Pay"
    //  var transfer = 10000
    //  var previosTransfer = 1000
    // val result = comissionCalc(card, previosTransfer, transfer)

    //print(result)

}


fun comissionCalc(card: String, previosTransfer: Int, transfer: Int): Int {
    var comission: Double = 0.0
    var limitDay = 150_000
    var limitMonth = 600_000
    var vkPayLimitAtOnce = 15_000
    var vkPayLimitMonth = 40_000
    var MaestroMasterCardMin = 300
    var MaestroMasterCardMax = 75_000


    when (card) {
        "MasterCard" -> comission =
            if (MaestroMasterCardMin <= transfer && previosTransfer + transfer <= MaestroMasterCardMax) 0.0
            else if (transfer + previosTransfer < MaestroMasterCardMin) (transfer * 0.006) + 20
            else ((previosTransfer + transfer - MaestroMasterCardMax) * 0.006) + 20


        "Maestro" -> comission =
            if (MaestroMasterCardMin <= transfer && previosTransfer + transfer <= MaestroMasterCardMax) 0.0
            else if (transfer + previosTransfer < MaestroMasterCardMin) (transfer * 0.006) + 20
            else ((previosTransfer + transfer - MaestroMasterCardMax) * 0.006) + 20

        "VK Pay" -> comission =
            if (vkPayLimitAtOnce >= transfer &&
                previosTransfer + transfer <= vkPayLimitMonth) 0.0 else -1.0

        "Visa" -> comission = Math.max(0.0075 * transfer, 35.0)

        "Мир" -> comission = Math.max(0.0075 * transfer, 35.0)
    }
    if (transfer <= limitDay && previosTransfer + transfer <= limitMonth) return comission.toInt() else return -1
}

