class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        String[] cache = new String[cacheSize];
        int answer = 0;

        for (int i = 0; i < cities.length; i++) {
            answer = check(cities[i].toLowerCase(), cache, answer);
        }

        return answer;
    }

    int check(String city, String[] cache, int answer) {
        boolean isHave = false;
        int i = 0;
        for (i = 0; i < cache.length; i++) {
            if (city.equals(cache[i])) {
                isHave = true;
                break;
            }
        }

        if (isHave) {
            answer += 1;
            for (; i > 0; i--) {
                cache[i] = cache[i - 1];
            }
            cache[0] = city;
        } else {
            answer += 5;
            for (i = cache.length - 1; i > 0; i--) {
                cache[i] = cache[i - 1];
            }
            cache[0] = city;
        }

        return answer;
    }
}
