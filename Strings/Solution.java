class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int first=0;
        int last=s.length()-1;
        //Character[] Vovle={'A','E','I','O','U','a','e','i','o','u'};
        Set<Character> Vowle=new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U',
                  'a', 'e', 'i', 'o', 'u'));
        
        while(first<=last){
            if(Vowle.contains(s.charAt(first)) && Vowle.contains(s.charAt(last))){
                char temp=ch[first];
                ch[first]=ch[last];
                ch[last]=temp; 
                first++;
                last--;
            }
            else if(!Vowle.contains(ch[last])){
                last--;
            }
            else if(!Vowle.contains(ch[first])){
                first++;
            }
        
        }
        return new String(ch);
    }
}