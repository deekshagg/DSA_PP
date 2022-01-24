class l_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int match = 0;
        for(int i = 0 ; i < items.size() ; i++){
            if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))){
                match++;
            }else if(ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))){
                match++;
            }else if(ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))){
                match++;
            }
        }
        return match;
    }
}