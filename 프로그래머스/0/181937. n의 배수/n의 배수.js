function solution(num, n) {
    var answer = 0;
    answer = num % n;
    if (answer === 0) {
        return 1;
    } else {
        return 0;
    }
}