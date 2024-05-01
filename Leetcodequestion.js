// 2259. Remove Digit From Number to Maximize Result
var removeDigit = function (number, digit) {
    let largest = 0n, num, lar;
    for (let i = 0; i < number.length; i++) {
        if (number[i] == digit) {
            num = number.substring(0, i) + number.substring(i + 1);
            lar = BigInt(num);
            if (lar > largest)
                largest = lar;
        }
    }
    return largest.toString();
};
