

public class StringMethod {
        public static void main(String[] args){
            StringBuilder sb = new StringBuilder();
            sb.append("Hello My name is yadav");
            System.out.println(sb.charAt(0));
            System.out.println(sb.indexOf("M"));
            System.out.println(sb.length());
            System.out.println(sb.substring(0, 5));
            char[] chararr = sb.toString().toCharArray();
            String st = sb.toString();
            String[] st1 = st.split("//W+");
            System.out.println(st1);
            // for(char c: chararr){
            //     System.out.println(c);
            // }
            System.out.println(sb);
        }
}
