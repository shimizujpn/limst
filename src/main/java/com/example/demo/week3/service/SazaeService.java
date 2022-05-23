package com.example.demo.week3.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SazaeService {
    /**
     * <pre>
     * 【問題文】
     * jankenは、引数の myHand(自分の手) とopponentHand(相手の手)を使用して、
     * じゃんけんの勝敗を取得するメソッドです。 
     * ・じゃんけんの勝敗(win,lose,drawの何れか)を取得する処理を記載してください。
     * ・じゃんけんの勝敗は変数resultに格納して返却してください。
     * 例：
     * myHand = "goo", opponentHand = "choki"
     * return "win"
     * </pre>
     *
     * @param myHand 自分の手 goo,choki,per のいずれかの文字列
     * @param opponentHand 相手の手 goo,choki,per のいずれかの文字列
     * @return result win,lose,draw のいずれかの文字列
     * @throws IllegalArgumentException myHand または opponentHand が goo,choki,per のいずれかでない場合
     */
    public String janken(String myHand, String opponentHand)throws IllegalArgumentException{
           String[] jyanken = {"goo", "choki", "per"};
           List<String>jyankenList = new ArrayList<String>(Arrays.asList(jyanken));
           int myHandindex = jyankenList.indexOf(myHand);
           int opponentHandindex = jyankenList.indexOf(opponentHand);
           String result = null;
           if(myHandindex == 0 && opponentHandindex ==1 || myHandindex == 1 && opponentHandindex == 2 || myHandindex == 2 && opponentHandindex == 0) {
        	   result = "win";
           }else if(myHandindex == 0 && opponentHandindex == 2 || myHandindex == 1 && opponentHandindex == 0 || myHandindex == 2 && opponentHandindex == 1) {
        	   result = "lose";
           }else if(myHandindex == opponentHandindex){
        	   result = "draw";
           }else if(myHandindex == -1 || opponentHandindex == -1) {
        	   throw new IllegalArgumentException("goo,choki,perいずれかでない場合");
           }
return result;
    }
}
