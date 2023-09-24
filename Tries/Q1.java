package Tries;
import java.util.*;
public class Q1 {
    static class TrieNode{
        List<String>data;
        TrieNode children[];
        boolean isEnd;

        TrieNode(){
            data=new ArrayList<>();
            children=new TrieNode[26];
            isEnd=false; 
        }

    }
}