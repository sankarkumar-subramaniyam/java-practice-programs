package leetcode;

import java.util.Stack;

// https://leetcode.com/problems/design-browser-history/description/
public class BrowserHistory {

    private final Stack<String> history;
    private Stack<String> future;
    private String current;

    public BrowserHistory(String homepage) {
        history = new Stack<String>();
        future = new Stack<String>();
        // 'homepage' is the first visited URL.
        current = homepage;
    }

    public static void main(String[] args) {
        BrowserHistory obj = new BrowserHistory("leetcode.com");
        obj.visit("google.com");
        obj.visit("facebook.com");
        obj.visit("youtube.com");
        System.out.println(obj.back(1));
        System.out.println(obj.back(1));
        System.out.println(obj.forward(1));
        obj.visit("linkedin.com");
        System.out.println(obj.forward(2));
        System.out.println(obj.back(2));
        System.out.println(obj.back(7));
    }

    public void visit(String url) {
        // Push 'current' in 'history' stack and mark 'url' as 'current'.
        history.push(current);
        current = url;
        // We need to delete all entries from 'future' stack.
        future = new Stack<String>();
    }

    public String back(int steps) {
        // Pop elements from 'history' stack, and push elements in 'future' stack.
        while (steps > 0 && !history.empty()) {
            future.push(current);
            current = history.pop();
            steps--;
        }
        return current;
    }

    public String forward(int steps) {
        // Pop elements from 'future' stack, and push elements in 'history' stack.
        while (steps > 0 && !future.empty()) {
            history.push(current);
            current = future.pop();
            steps--;
        }
        return current;
    }

    /*Using Array list by Sankar

    ArrayList<String> browserHistory;
    int currentPageIndex;

    public BrowserHistory(String homepage) {
        this.browserHistory = new ArrayList<String>();
        currentPageIndex = 0;
        browserHistory.add(homepage);
    }

    public void visit(String url) {
        if(currentPageIndex < browserHistory.size()){
            for(int i=currentPageIndex+1; i< browserHistory.size();i++){
                browserHistory.remove(currentPageIndex);
            }
        }

        browserHistory.add(url);
        currentPageIndex=browserHistory.size()-1;
    }

    public String back(int steps) {
        currentPageIndex = Math.max(0,currentPageIndex-steps);
        return browserHistory.get(currentPageIndex);
    }

    public String forward(int steps) {
        currentPageIndex = Math.min(browserHistory.size()-1,currentPageIndex+steps);
        return browserHistory.get(currentPageIndex);
    }*/
}
