/*---------------------------------------------------------*|
|                Created by Tannre Overly - 2018            |
|-----------------------------------------------------------|
|   WARNING -   WARNING -   WARNING -   WARNING -   WARNING |
|-----------------------------------------------------------|
|   It is highly recommended that you attempt to solve your |
| problems before using work provided here in order to      |
| actually learn from your mistakes. Try to use this only to|
| review or compare your own work.                          |
|_______________________Good_Luck___________________________|*/

public boolean allSameLetter(String str)
{
    char c1 = str.charAt(0);
    int length = str.length();
    for(int i=1;i<length;i++)
    {
        char temp = str.charAt(i);
        if(c1 != temp)
        {
            return false;
        }
    }
    return true;
}
