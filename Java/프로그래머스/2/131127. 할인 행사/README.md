# [level 2] 할인 행사 - 131127 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131127) 

### 성능 요약

메모리: 110 MB, 시간: 79.30 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 09월 20일 09:35:03

### 문제 설명

<p>XYZ 마트는 일정한 금액을 지불하면 10일 동안 회원 자격을 부여합니다. XYZ 마트에서는 회원을 대상으로 매일 한 가지 제품을 할인하는 행사를 합니다. 할인하는 제품은 하루에 하나씩만 구매할 수 있습니다. 알뜰한 정현이는 자신이 원하는 제품과 수량이 할인하는 날짜와 10일 연속으로 일치할 경우에 맞춰서 회원가입을 하려 합니다.</p>

<p>예를 들어, 정현이가 원하는 제품이 바나나 3개, 사과 2개, 쌀 2개, 돼지고기 2개, 냄비 1개이며, XYZ 마트에서 14일간 회원을 대상으로 할인하는 제품이 날짜 순서대로 치킨, 사과, 사과, 바나나, 쌀, 사과, 돼지고기, 바나나, 돼지고기, 쌀, 냄비, 바나나, 사과, 바나나인 경우에 대해 알아봅시다. 첫째 날부터 열흘 간에는 냄비가 할인하지 않기 때문에 첫째 날에는 회원가입을 하지 않습니다. 둘째 날부터 열흘 간에는 바나나를 원하는 만큼 할인구매할 수 없기 때문에 둘째 날에도 회원가입을 하지 않습니다. 셋째 날, 넷째 날, 다섯째 날부터 각각 열흘은 원하는 제품과 수량이 일치하기 때문에 셋 중 하루에 회원가입을 하려 합니다.</p>

<p>정현이가 원하는 제품을 나타내는 문자열 배열 <code>want</code>와 정현이가 원하는 제품의 수량을 나타내는 정수 배열 <code>number</code>, XYZ 마트에서 할인하는 제품을 나타내는 문자열 배열 <code>discount</code>가 주어졌을 때, 회원등록시 정현이가 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수를 return 하는 solution 함수를 완성하시오. 가능한 날이 없으면 0을 return 합니다.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>want</code>의 길이 = <code>number</code>의 길이 ≤ 10

<ul>
<li>1 ≤ <code>number</code>의 원소 ≤ 10</li>
<li><code>number[i]</code>는 <code>want[i]</code>의 수량을 의미하며, <code>number</code>의 원소의 합은 10입니다.</li>
</ul></li>
<li>10 ≤ <code>discount</code>의 길이 ≤ 100,000</li>
<li><code>want</code>와 <code>discount</code>의 원소들은 알파벳 소문자로 이루어진 문자열입니다.

<ul>
<li>1 ≤ <code>want</code>의 원소의 길이, <code>discount</code>의 원소의 길이 ≤ 12</li>
</ul></li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>want</th>
<th>number</th>
<th>discount</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>["banana", "apple", "rice", "pork", "pot"]</td>
<td>[3, 2, 2, 2, 1]</td>
<td>["chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"]</td>
<td>3</td>
</tr>
<tr>
<td>["apple"]</td>
<td>[10]</td>
<td>["banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"]</td>
<td>0</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p><strong>입출력 예 #1</strong></p>

<ul>
<li>문제 예시와 같습니다.</li>
</ul>

<p><strong>입출력 예 #2</strong></p>

<ul>
<li>사과가 할인하는 날이 없으므로 0을 return 합니다.</li>
</ul>

<hr>

<p>※ 공지 - 2024년 1월 26일 문제 지문의 오탈자가 수정되었습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges





최적의 방법: 슬라이딩 윈도우 기법
이 문제는 슬라이딩 윈도우(Sliding Window) 기법을 사용하여 더 효율적으로 풀 수 있습니다. 현재 작성하신 코드에서는 매번 10일 간의 할인 제품을 확인하기 위해 반복적으로 탐색을 수행하는데, 이는 비효율적입니다. 슬라이딩 윈도우를 사용하면 이미 계산한 윈도우에서 첫 번째 제품을 제거하고, 마지막 제품을 추가하는 방식으로 중복 계산을 줄일 수 있습니다.

최적 풀이
슬라이딩 윈도우 기법을 사용하면 다음과 같은 방식으로 문제를 해결할 수 있습니다.

풀이 방법:
want와 number 배열을 기반으로 제품의 요구 수량을 저장할 맵을 만듭니다.
discount 배열에서 슬라이딩 윈도우를 사용하여 매번 새로운 10일 간의 제품들을 확인합니다.
첫 번째 윈도우를 계산한 후, 윈도우를 한 칸씩 이동하며 새로운 제품을 추가하고 이전 제품을 제거합니다.
각 윈도우에서 want에 있는 제품이 필요한 수만큼 존재하는지 확인하고, 조건이 만족될 때마다 카운트를 증가시킵니다.
최적 코드:
java
코드 복사
import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        // 원하는 제품과 수량을 저장하는 맵
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 슬라이딩 윈도우 탐색
        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> discountMap = new HashMap<>();
            // 현재 10일 동안의 할인 목록을 카운트
            for (int j = 0; j < 10; j++) {
                String product = discount[i + j];
                discountMap.put(product, discountMap.getOrDefault(product, 0) + 1);
            }

            // 원하는 제품과 수량이 일치하는지 확인
            boolean isValid = true;
            for (String product : wantMap.keySet()) {
                if (discountMap.getOrDefault(product, 0) < wantMap.get(product)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                answer++;
            }
        }

        return answer;
    }
}
현재 방법과 최적 방법의 차이점 (Big O 분석)
1. 현재 방법
현재 방법에서는 다음과 같은 과정을 수행합니다:

10일마다 discount 배열에서 할인 제품을 찾기 위해 Arrays.asList(want).indexOf(discount[i+j])를 반복하여 호출하고 있습니다. 이 연산은 리스트에 대해 O(N) 시간이 걸립니다.
각 윈도우마다 모든 제품을 다시 확인하고 카운트하며, 이 과정을 반복합니다.
시간 복잡도: O((D - 9) * (W * 10))
여기서 D는 discount 배열의 길이, W는 want 배열의 길이입니다. 각 윈도우에서 10개의 할인 제품을 탐색하고, 매번 want 배열에서 해당 제품을 찾기 위해 최대 O(W)의 시간이 걸립니다.
2. 최적 방법 (슬라이딩 윈도우)
슬라이딩 윈도우 기법을 사용하면 첫 번째 윈도우를 계산한 후, 매번 새로운 제품을 추가하고 이전 제품을 제거하는 방식으로 중복된 계산을 줄일 수 있습니다.

시간 복잡도: O((D - 9) * W)
여기서 W는 want 배열의 길이입니다. 각 윈도우에서 한 번씩만 카운트하고 맵을 비교하므로 중복 계산을 피할 수 있습니다.
효율성 비교
현재 방법은 매번 리스트 탐색을 수행하고, 전체 배열을 확인하기 때문에 중복된 계산이 많이 발생합니다. 특히 Arrays.asList(want).indexOf(discount[i+j])의 O(W) 탐색이 비효율적입니다.
최적 방법은 슬라이딩 윈도우 기법을 통해 이미 계산된 윈도우에서 중복 계산을 피하면서 더 적은 연산으로 목표를 달성합니다.
따라서, 슬라이딩 윈도우 기법이 더 효율적입니다. 큰 입력이 주어졌을 때, 현재 방법은 시간 초과가 발생할 가능성이 높지만, 최적 방법은 훨씬 더 빠르게 동작합니다.

놓친 부분:
배열 복사 문제: 원래 코드는 number 배열을 복사하는 과정에서 잘못된 인덱스로 접근하는 실수를 했습니다. 이로 인해 copyNum 배열이 정상적으로 초기화되지 않았습니다.
비효율적인 탐색: Arrays.asList(want).indexOf(discount[i+j])로 매번 리스트에서 제품을 찾는 것은 매우 비효율적입니다. 이를 맵으로 대체하여 O(1)로 탐색할 수 있습니다.
