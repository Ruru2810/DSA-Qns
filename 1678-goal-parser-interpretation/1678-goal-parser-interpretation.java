class Solution {
    public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
        // return command.replace("(al)","al");
    }
}