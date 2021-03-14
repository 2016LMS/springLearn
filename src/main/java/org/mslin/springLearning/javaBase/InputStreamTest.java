package org.mslin.springLearning.javaBase;

import org.springframework.util.Assert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class InputStreamTest {
    public static List<String> wordCount() {
        try {
            Map<String, Integer> map = new HashMap<String, Integer>();

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\test.txt"), 4096);
            String s = null;
            StringBuffer sb = new StringBuffer();
            while ((s = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(s.toString(), ",.! \n\t"); //用于分割文本
                while (st.hasMoreTokens()) {
                    String letter = st.nextToken();
                    int count;
                    if (map.get(letter) == null) {
                        count = 1;
                    } else {
                        count = map.get(letter) + 1;
                    }
                    map.put(letter, count);
                }
            }
            Set<WordEntity> set = new TreeSet<WordEntity>();
            for (String key : map.keySet()) {
                set.add(new WordEntity(key,map.get(key)));
            }
            int count = 0;
            List<String> wordList = new ArrayList<>();
            for (WordEntity w : set ) {
                if (count < 100) {
                    wordList.add(count, w.getKey());
                }
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount();
    }

    public static void main(String[] args) {
        wordCount();
    }

    static class WordEntity implements Comparable<WordEntity> {
        private String key;
        private Integer count;

        public WordEntity(String key, Integer count) {
            this.key = key;
            this.count = count;
        }

        public int compareTo(WordEntity o) {
            int cmp = count - o.count;
            return (cmp == 0 ? key.compareTo(o.key) : -cmp);
        }


        public String getKey() {
            return key;
        }

        public Integer getCount() {
            return count;
        }
    }
}
