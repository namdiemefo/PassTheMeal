fun main() {
    // Enter positive integer
    println(start(57))
}

private fun start(int: Int): String {
    // ensure integer is positive
    return if (int > 0.0) {
        // convert to binary
        var binary = int.toString(2)
        var gap = longestGap(binary)
        "The longest gap is $gap"
    } else {
        "You need to enter a positive integer"
    }
}

private fun longestGap(input: String): Int {

    var maxLength: Int = 0
    var left: Int = 0
    var right: Int = 0

    // move through the digits to find the first "1"
    while (input[left] != '1') {
        left++
    }

    // give right value of left
    right = left

    while (right != input.length) {
        // if "right" finds a "1" calculate the distance between where it was with "left" and where it is now
        if (input[right] == '1') {
            maxLength = Math.max(maxLength, (right - left) - 1)
            left = right
        }
        right++
    }
    return maxLength


}

