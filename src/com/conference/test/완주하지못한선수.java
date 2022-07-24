package com.conference.test;

import com.conference.MainProceed;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 완주하지못한선수 implements MainProceed {
    @Override
    public String solution() {
        return null;
    }

    @Override
    public String solution(String[] arg1) {
        return null;
    }

    @Override
    public String solution(String[] arg1, String[] arg2) {
        /* participant = 참여한선수들(n명), completion = 완주한 선수들(n-1명), 1~ 100000명 */
        String answer = "";

        /* list = 순서o,중복o | map = 순서x, 중복(키x,값o) */
        /*
            동명이인이 존재 , 키 중복 x, 값 중복 o
            정렬 후 비교 할 경우 -> 동명이인이 존재하면 꼬여버릴듯..
             그래서 해당 key에 대한 count를 저장
        */

        HashMap<String, Integer> map = new HashMap<>();
        for (String personName : arg1) {
            /* participant 배열의 0 부터 ~ , 값을 personName 으로 */

            /* psersonName 이라는 키값이 존재하면 default + 1 , 아니면 default값을 넣는다. */
            map.put(personName, map.getOrDefault(personName, 0) + 1);
        }

        for (String personName : arg2) {
            /* 완주목록에 있는 이름이 , 참가자목록에 존재하면 값을 - 1*/
            map.put(personName, map.get(personName) - 1);
        }
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}
