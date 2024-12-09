function solution(rny_string) {
    const arr = rny_string.split('');
    const arrr = arr.map((x) => (x === 'm' ? 'rn' : x));
    const answer = arrr.join('');
    return answer;
}