package academy.learnprogramming.algorithm.KNP;

public class KnuthMorrisPratt {
    /**
     * This computes the table of the longest suffix and longest prefix in the pattern.
     * @param pattern
     * @return
     */
    public int [] computeLSPTable(char [] pattern){
        int [] lsp  = new int[pattern.length];

        int j = 0;
        for (int i= 1; i < pattern.length; i++ )
        {
            while(j > 0 && pattern[i] != pattern[j])
            {
                j=lsp[j-1];
            }
            if(pattern[i] == pattern[j])
            {
                lsp[i] = j+1;
                j++;
            } else {
                lsp[i] = 0;
            }

        }
        return lsp;
    }
}