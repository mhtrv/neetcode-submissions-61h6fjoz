class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++){
            //System.out.println(i);
            Set set1=new HashSet<>();
            for(int j=0;j<9;j++){
                if(set1.contains(board[i][j])){
                    //System.out.println("Returning false, i:"+i+" j:"+j);
                    return false;
                }else if(board[i][j]!='.'){
                    set1.add(board[i][j]);
                }
            }
        }
        
        for(int i=0;i<9;i++){
            //System.out.println(i);
            Set set1=new HashSet<>();
            for(int j=0;j<9;j++){
                if(set1.contains(board[j][i])){
                    //System.out.println("Returning false, i:"+i+" j:"+j);
                    return false;
                }else if(board[j][i]!='.'){
                    set1.add(board[j][i]);
                }
            }
        }

        Set set1=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){               
                //System.out.println("i:"+i+" j:"+j+" value:"+board[i][j]);
                if(set1.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set1.add(board[i][j]);
                    //System.out.println(set1.size());
                }
            }
        }

        set1=new HashSet<>();
        for(int i=3;i<6;i++){
            for(int j=0;j<3;j++){               
                //System.out.println("i:"+i+" j:"+j+" value:"+board[i][j]);
                if(set1.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set1.add(board[i][j]);
                    //System.out.println(set1.size());
                }
            }
        }

        set1=new HashSet<>();
        for(int i=6;i<9;i++){
            for(int j=0;j<3;j++){               
                //System.out.println("i:"+i+" j:"+j+" value:"+board[i][j]);
                if(set1.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set1.add(board[i][j]);
                    //System.out.println(set1.size());
                }
            }
        }

        set1=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=3;j<6;j++){               
                //System.out.println("i:"+i+" j:"+j+" value:"+board[i][j]);
                if(set1.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set1.add(board[i][j]);
                    //System.out.println(set1.size());
                }
            }
        }

        set1=new HashSet<>();
        for(int i=3;i<6;i++){
            for(int j=3;j<6;j++){               
                //System.out.println("i:"+i+" j:"+j+" value:"+board[i][j]);
                if(set1.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set1.add(board[i][j]);
                    //System.out.println(set1.size());
                }
            }
        }

        set1=new HashSet<>();
        for(int i=6;i<9;i++){
            for(int j=3;j<6;j++){               
                //System.out.println("i:"+i+" j:"+j+" value:"+board[i][j]);
                if(set1.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set1.add(board[i][j]);
                    //System.out.println(set1.size());
                }
            }
        }

        set1=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=6;j<9;j++){               
                //System.out.println("i:"+i+" j:"+j+" value:"+board[i][j]);
                if(set1.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set1.add(board[i][j]);
                    //System.out.println(set1.size());
                }
            }
        }

        set1=new HashSet<>();
        for(int i=3;i<6;i++){
            for(int j=6;j<9;j++){               
                //System.out.println("i:"+i+" j:"+j+" value:"+board[i][j]);
                if(set1.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set1.add(board[i][j]);
                    //System.out.println(set1.size());
                }
            }
        }

        set1=new HashSet<>();
        for(int i=6;i<9;i++){
            for(int j=6;j<9;j++){               
                //System.out.println("i:"+i+" j:"+j+" value:"+board[i][j]);
                if(set1.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set1.add(board[i][j]);
                    //System.out.println(set1.size());
                }
            }
        }

        return true;
    }
}
