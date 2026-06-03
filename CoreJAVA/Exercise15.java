class Exercise15{
    String reverse(String str){
        StringBuilder s = new StringBuilder();
        for(int i = str.length() - 1; i>=0; i--){
            s.append(str.charAt(i));
        }
        return s.toString();
    }
    public static void main(String args[]){
        Exercise15 obj = new Exercise15();
        System.out.println(obj.reverse("Shivani"));
        System.out.println(obj.reverse("somesh"));
    }
}