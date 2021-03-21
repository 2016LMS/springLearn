package org.mslin.springLearning.javaBase.OBject;

public class IdGenerator {

    private long lastTimestamp = 0L; //上次生成id的时间戳

    private long sequence = 0L; //1ms内生成的id序号


    synchronized long generate() {
        long now = System.currentTimeMillis(); //获取现在的13位毫秒时间戳
        if (now < lastTimestamp) {
            throw new RuntimeException("current timestamp < last generate timestamp");
        } else if (now == lastTimestamp) { //同一毫秒内
            if (sequence >= (2^12 - 1)) { //序列号12位
                now = nextMs(now); //如果直接在当前时间上加上1ms，则下次生成id时可能时间在lastTimestamp之前
                sequence = 1L; //重置序列号
            } else {
                sequence++;
            }
        } else { //上次生成id时间在上一毫秒
            sequence = 1L; //重置序列号
        }
        return now << 22 | sequence; //机器id置为0
    }


    /**
     * 阻塞等到过了当前毫秒
     * @param lastTimestamp
     * @return
     */
     long nextMs(long lastTimestamp) {
        long timestamp = System.currentTimeMillis();
        while (timestamp <= lastTimestamp) {
            timestamp = System.currentTimeMillis();
        }
        return timestamp;

    }
}
