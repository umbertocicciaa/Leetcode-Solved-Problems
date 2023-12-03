char *mergeAlternately(char * word1, char * word2){
    int len1 = strlen(word1), len2 = strlen(word2), arrSize = len1 + len2 + 1;
    int x=0;
    int i;
    char *res=malloc(arrSize*sizeof(char));
    for(i=0; i<len1 && i<len2;i++){
        res[x++]=word1[i];
        res[x++]=word2[i];
    }
    for(;i<len1;){
         res[x++]=word1[i++];
    }
    for(;i<len2;){
         res[x++]=word2[i++];
    }
    res[x] = '\0';
    return res;
}

