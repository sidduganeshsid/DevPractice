class l0003RevString{
    public static void main(String args[]){

        String s = "siddu sid sid";

        // for(int i=s.length()-1; i>=0; i--){
        //     System.out.print(s.charAt(i));
        // }

        int count = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1;j<s.length()-1; j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
        }
        System.out.print(count);


    }
}