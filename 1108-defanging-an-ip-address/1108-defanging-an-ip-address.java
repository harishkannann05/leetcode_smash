class Solution {
    public String defangIPaddr(String address) 
    {
        String answer = "";
        int index = 0;

        while(index < address.length())
        {
            if(address.charAt(index) == '.')
            {
                answer = answer + "[.]";
            }
            else 
            answer = answer + address.charAt(index);
            index++;
        }
        return answer;
    }
}