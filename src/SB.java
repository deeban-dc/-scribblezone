public class SB {
    public static void main(String[] args){
        StringBuilder name = new StringBuilder();
        for(int i = 0; i<26; i++){
            char ch = (char)('a' + i);
            name.append(ch);
        }
        System.out.println(name);
    }
}
