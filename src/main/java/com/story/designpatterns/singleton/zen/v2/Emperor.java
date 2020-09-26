package com.story.designpatterns.singleton.zen.v2;


import java.util.ArrayList;
import java.util.Random;

/**
 *中国的历史上一般都是一个朝代一个皇帝，有两个皇帝的话，必然要PK出一个皇帝出来。
* 问题出来了：如果真在一个时间，中国出现了两个皇帝怎么办？比如明朝土木堡之变后，
* 明英宗被俘虏，明景帝即位，但是明景帝当上皇帝后乐疯了，竟然忘记把他老哥明英宗削为太上皇，
* 也就是在这一个多月的时间内，中国竟然有两个皇帝！
 */
public class Emperor {
    private static int maxNumOfEmperor = 2;
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);
    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }

    private Emperor(){

    }

    private Emperor(String info){
        emperorInfoList.add(info);
    }

    public static Emperor getInstance(){
        Random r = new Random();
        countNumOfEmperor = r.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    public void emperorInfo(){
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
