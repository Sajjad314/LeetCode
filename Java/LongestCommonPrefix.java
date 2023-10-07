public String longestCommonPrefix(String[] strs) {
        String ans = "";;
        int min_len = strs[0].length();
        for(int i = 0;i<strs.length;i++){
        if(min_len> strs[i].length())
        min_len = strs[i].length();
        }

        for(int i=0;i<min_len;i++){
        char ch = strs[0].charAt(i);
        for(int j = 0;j< strs.length;j++){
        if(strs[j].charAt(i) != ch){
        return ans;
        }
        }
        ans = ans + ch;
        }

        return ans;
        }