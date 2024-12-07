function solution(a, b) {
    var ab = parseInt(a.toString() + b.toString());
    var ab2 = a*b*2
    
    // 두 값 중 더 큰 값을 반환
    return ab >= ab2 ? ab : ab2;
}