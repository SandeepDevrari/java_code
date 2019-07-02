boolean checkBST(Node root) {
        if(root==null){
            return false;
        }
        //boolean tt=checkBST_ko(root.data,root,0);
        //if(!tt)
        //    return false;
        //tt=checkBST_ko(root.data,root,'R');
        //if(!tt)
        //    return false;
        return checkBST_ko(root.data,root,0,'L');
    }
    boolean checkBST_ko(int D,Node root,int M,char to) {
        if(root==null){
            return false;
        }
        if(root.left!=null){
            char temp=findBigger(to,D,root,root.left);
            if(temp=='A' || temp=='E' || temp=='B'){
                return false;
            }
            if(!checkBST_ko(D,root.left,M+1,to)){
                return false;
            }
        }
        if(root.right!=null){
            if(M==0)
                to='R';
            char temp=findBigger(to,D,root,root.right);
            if(temp=='A' || temp=='E' || temp=='S'){
                return false;
            }
            if(!checkBST_ko(D,root.right,M+1,to)){
                return false;
            }
        }
        return true;
    }
    char findBigger(char dir,int d,Node root,Node node){
    	if(dir=='L'){
    		if(node.data>=d){
    			return 'A';
    		}
    	}
    	else if(dir=='R'){
    		if(node.data<=d){
    			return 'A';
    		}
    	}
        if(node.data<root.data){
            return 'S';
        }
        if(node.data==root.data){
            return 'E';
        }
        if(node.data>root.data){
            return 'B';
        }
        return 'A';
    }
