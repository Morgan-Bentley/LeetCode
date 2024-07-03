class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int stackSum = 0;
        for(String operation : operations) {
            if(operation.equals("+")) {
                Integer score1 = stack.pop();
                Integer score2 = stack.pop();
                Integer sum = score1 + score2;
                stack.push(score2);
                stack.push(score1);
                stack.push(sum);
            } else if (operation.equals("D")) {
                Integer score = stack.pop();
                Integer doubleScore = score*2;
                stack.push(score);
                stack.push(doubleScore);
            } else if (operation.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(operation));
            }
        }
        for(Integer element : stack) {
            stackSum+=element;
        }
        return stackSum;
    }
}