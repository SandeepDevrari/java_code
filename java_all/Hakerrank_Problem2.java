package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.ArrayList;

public class Hakerrank_Problem2 {

    static int formingMagicSquare(int[][] s) {
    	int count=0,temp=0;
        
        //center
        if(s[1][1]!=5){
        	temp=5-s[1][1];
        	s[1][1]=s[1][1]+temp;
        	if(temp<0){
        		temp=temp*(-1);
        	}
        	count+=temp;
        }
        
        //edges
        boolean cell_01=false,cell_10=false;
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(9);
        list1.add(1);
        list1.add(7);
        list1.add(3);
        
        if(list1.contains(s[0][1])){//s[0][1]==9 || s[0][1]==1 || s[0][1]==7 || s[0][1]==3){
        	if(s[0][1]==9){
        		if(s[2][1]!=1){
        			//s[2][1]=1;
        			temp=1-s[2][
                    1];
        			s[2][1]=s[2][1]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(9));
        			list1.remove(Integer.valueOf(1));
        		}
        	}
        	else if(s[0][1]==1){
        		if(s[2][1]!=9){
        			//s[2][1]=9;
        			temp=9-s[2][1];
        			s[2][1]=s[2][1]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(9));
        			list1.remove(Integer.valueOf(1));
        		}
        	}
        	else if(s[0][1]==7){
        		if(s[2][1]!=3){
        			//s[2][1]=3;
        			temp=3-s[2][1];
        			s[2][1]=s[2][1]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(7));
        			list1.remove(Integer.valueOf(3));
        		}
        	}
        	else if(s[0][1]==3){
        		if(s[2][1]!=7){
        			//s[2][1]=7;
        			temp=7-s[2][1];
        			s[2][1]=s[2][1]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(7));
        			list1.remove(Integer.valueOf(3));
        		}
        	}
            cell_01=true;
        	
        }
        else if(list1.contains(s[2][1])){//s[2][1]==9 || s[2][1]==1 || s[2][1]==7 || s[2][1]==3){
        	if(s[2][1]==9){
        		if(s[0][1]!=1){
        			//s[0][1]=1;
        			temp=1-s[0][1];
        			s[0][1]=s[0][1]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(9));
        			list1.remove(Integer.valueOf(1));
        		}
        	}
        	else if(s[2][1]==1){
        		if(s[0][1]!=9){
        			//s[0][1]=9;
        			temp=9-s[0][1];
        			s[0][1]=s[0][1]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(9));
        			list1.remove(Integer.valueOf(1));
        		}
        	}
        	else if(s[2][1]==7){
        		if(s[0][1]!=3){
        			//s[0][1]=3;
        			temp=3-s[0][1];
        			s[0][1]=s[0][1]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(7));
        			list1.remove(Integer.valueOf(3));
        		}
        	}
        	else if(s[2][1]==3){
        		if(s[0][1]!=7){
        			//s[0][1]=7;
        			temp=7-s[0][1];
        			s[0][1]=s[0][1]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(7));
        			list1.remove(Integer.valueOf(3));
        		}
        	}
            cell_01=true;
        }
        if(list1.contains(s[1][0])){//s[1][0]==9 || s[1][0]==1 || s[1][0]==7 || s[1][0]==3){
        	if(s[1][0]==9){
        		if(s[1][2]!=1){
        			//s[1][2]=1;
        			temp=1-s[1][2];
        			s[1][2]=s[1][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(9));
        			list1.remove(Integer.valueOf(1));
        		}
        	}
        	else if(s[1][0]==1){
        		if(s[1][2]!=9){
        			//s[1][2]=9;
        			temp=9-s[1][2];
        			s[1][2]=s[1][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(9));
        			list1.remove(Integer.valueOf(1));
        		}
        	}
        	else if(s[1][0]==7){
        		if(s[1][2]!=3){
        			//s[1][2]=3;
        			temp=3-s[1][2];
        			s[1][2]=s[1][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(7));
        			list1.remove(Integer.valueOf(3));
        		}
        	}
        	else if(s[1][0]==3){
        		if(s[1][2]!=7){
        			//s[1][2]=7;
        			temp=7-s[1][2];
        			s[1][2]=s[1][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list1.remove(Integer.valueOf(7));
        			list1.remove(Integer.valueOf(3));
        		}
        	}
            cell_10=true;
        	
        }
        else if(list1.contains(s[1][2])){//s[1][2]==9 || s[1][2]==1 || s[1][2]==7 || s[1][2]==3){
        		if(s[1][2]==9){
        			if(s[1][0]!=1){
        				//s[1][0]=1;
        				temp=1-s[1][0];
        				s[1][0]=s[1][0]+temp;
        				if(temp<0){
        					temp=temp*(-1);
        				}
        				count+=temp;
        				list1.remove(Integer.valueOf(9));
        				list1.remove(Integer.valueOf(1));
        			}
        		}
        		else if(s[1][2]==1){
        			if(s[1][0]!=9){
        				//s[1][0]=9;
        				temp=9-s[1][0];
        				s[1][0]=s[1][0]+temp;
        				if(temp<0){
        					temp=temp*(-1);
        				}
        				count+=temp;
        				list1.remove(Integer.valueOf(9));
        				list1.remove(Integer.valueOf(1));
        			}
        		}
        		else if(s[1][2]==7){
        			if(s[1][0]!=3){
        				//s[1][0]=3;
        				temp=3-s[1][0];
        				s[1][0]=s[1][0]+temp;
        				if(temp<0){
        					temp=temp*(-1);
        				}
        				count+=temp;
        				list1.remove(Integer.valueOf(7));
        				list1.remove(Integer.valueOf(3));
        			}
        		}
        		else if(s[1][2]==3){
        			if(s[1][0]!=7){
        				//s[1][0]=7;
        				temp=7-s[1][0];
        				s[1][0]=s[1][0]+temp;
        				if(temp<0){
        					temp=temp*(-1);
        				}
        				count+=temp;
        				list1.remove(Integer.valueOf(7));
        				list1.remove(Integer.valueOf(3));
        			}
        		}
                cell_10=true;
        	
        }
        
        
        //cornor
        ArrayList<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(6);
        list.add(4);
        
        boolean cell_00=false,cell_02=false;
        
        if(list.contains(s[0][0])){//s[0][0]==8 || s[0][0]==6 || s[0][0]==2 || s[0][0]==4){
        	if(s[0][0]==8){
        		if(s[2][2]!=2){
        			//s[2][2]=2;
        			temp=2-s[2][2];
        			s[2][2]=s[2][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(8));
        			list.remove(Integer.valueOf(2));
        		}
        	}
        	else if(s[0][0]==2){
        		if(s[2][2]!=8){
        			//s[2][2]=8;
        			temp=8-s[2][2];
        			s[2][2]=s[2][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(8));
        			list.remove(Integer.valueOf(2));
        		}
        	}
        	else if(s[0][0]==6){
        		if(s[2][2]!=4){
        			//s[2][2]=4;
        			temp=4-s[2][2];
        			s[2][2]=s[2][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(6));
        			list.remove(Integer.valueOf(4));
        		}
        	}
        	else if(s[0][0]==4){
        		if(s[2][2]!=6){
        			//s[2][2]=6;
        			temp=6-s[2][2];
        			s[2][2]=s[2][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(6));
        			list.remove(Integer.valueOf(4));
        		}
        	}
        	cell_00=true;
        }
        else if(list.contains(s[2][2])){//s[2][2]==8 || s[2][2]==6 || s[2][2]==2 || s[2][2]==4){
        	if(s[2][2]==8){
        		if(s[0][0]!=2){
        			//s[0][0]=2;
        			temp=2-s[0][0];
        			s[0][0]=s[0][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(8));
        			list.remove(Integer.valueOf(2));
        		}
        	}
        	else if(s[2][2]==2){
        		if(s[0][0]!=8){
        			//s[0][0]=8;
        			temp=8-s[0][0];
        			s[0][0]=s[0][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(8));
        			list.remove(Integer.valueOf(2));
        		}
        	}
        	else if(s[2][2]==6){
        		if(s[0][0]!=4){
        			//s[0][0]=4;
        			temp=4-s[0][0];
        			s[0][0]=s[0][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(6));
        			list.remove(Integer.valueOf(4));
        		}
        	}
        	else if(s[2][2]==4){
        		if(s[0][0]!=6){
        			//s[0][0]=6;
        			temp=6-s[0][0];
        			s[0][0]=s[0][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(6));
        			list.remove(Integer.valueOf(4));
        		}
        	}
        	cell_00=true;
        }
        
        if(list.contains(s[0][2])){//s[0][2]==8 || s[0][2]==6 || s[0][2]==2 || s[0][2]==4){
        	if(s[0][2]==8){
        		if(s[2][0]!=2){
        			//s[2][0]=2;
        			temp=2-s[2][0];
        			s[2][0]=s[2][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(8));
        			list.remove(Integer.valueOf(2));
        		}
        	}
        	else if(s[0][2]==2){
        		if(s[2][0]!=8){
        			//s[2][0]=8;
        			temp=8-s[2][0];
        			s[2][0]=s[2][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(8));
        			list.remove(Integer.valueOf(2));
        		}
        	}
        	else if(s[0][2]==6){
        		if(s[2][0]!=4){
        			//s[2][0]=4;
        			temp=4-s[2][0];
        			s[2][0]=s[2][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(6));
        			list.remove(Integer.valueOf(4));
        		}
        	}
        	else if(s[0][2]==4){
        		if(s[2][0]!=6){
        			//s[2][0]=6;
        			temp=6-s[2][0];
        			s[2][0]=s[2][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(6));
        			list.remove(Integer.valueOf(4));
        		}
        	}
        	cell_02=true;
        }
        else if(list.contains(s[2][0])){//s[2][0]==8 || s[2][0]==6 || s[2][0]==2 || s[2][0]==4){
        	if(s[2][0]==8){
        		if(s[0][2]!=2){
        			//s[0][2]=2;
        			temp=2-s[0][2];
        			s[0][2]=s[0][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(8));
        			list.remove(Integer.valueOf(2));
        		}
        	}
        	else if(s[2][0]==2){
        		if(s[0][2]!=8){
        			//s[0][2]=8;
        			temp=8-s[0][2];
        			s[0][2]=s[0][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(8));
        			list.remove(Integer.valueOf(2));
        		}
        	}
        	else if(s[2][0]==6){
        		if(s[0][2]!=4){
        			//s[0][2]=4;
        			temp=4-s[0][2];
        			s[0][2]=s[0][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(6));
        			list.remove(Integer.valueOf(4));
        		}
        	}
        	else if(s[2][0]==4){
        		if(s[0][2]!=6){
        			//s[0][2]=6;
        			temp=6-s[0][2];
        			s[0][2]=s[0][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
        			list.remove(Integer.valueOf(6));
        			list.remove(Integer.valueOf(4));
        		}
        	}
        	cell_02=true;
        }
        if(!list.isEmpty()){
        	if(!cell_00){
        		if((s[0][2]+s[0][1]+(list.get(0)).intValue())==15){
                    temp=(list.get(0)).intValue()-s[0][0];
        			s[0][0]=s[0][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    
                    temp=(list.get(1)).intValue()-s[2][2];
        			s[2][2]=s[2][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    list.remove(1);
                    list.remove(0);
                    
                }
                else if((s[0][2]+s[0][1]+(list.get(1)).intValue())==15){
                    temp=(list.get(1)).intValue()-s[0][0];
        			s[0][0]=s[0][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    
                    temp=(list.get(0)).intValue()-s[2][2];
        			s[2][2]=s[2][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    list.remove(1);
                    list.remove(0);
                    
                    
                }
        	}
        	if(!cell_02){
        		if((s[0][0]+s[0][1]+(list.get(0)).intValue())==15){
                    temp=(list.get(0)).intValue()-s[0][2];
        			s[0][2]=s[0][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    
                    temp=(list.get(1)).intValue()-s[2][0];
        			s[2][0]=s[2][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    list.remove(1);
                    list.remove(0);
                    
                }
                else if((s[0][0]+s[0][1]+(list.get(1)).intValue())==15){
                    temp=(list.get(1)).intValue()-s[0][2];
        			s[0][2]=s[0][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    
                    temp=(list.get(0)).intValue()-s[2][0];
        			s[2][0]=s[2][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    list.remove(1);
                    list.remove(0);
                    
                    
                }
        	}
        	list.clear();
        }
        if(!list1.isEmpty()){
        	
        	if(!cell_01){
        		if((s[2][0]+s[0][0]+(list1.get(0)).intValue())==15){
                    temp=(list1.get(0)).intValue()-s[1][0];
        			s[1][0]=s[1][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    
                    temp=(list1.get(1)).intValue()-s[1][2];
        			s[1][2]=s[1][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    list1.remove(1);
                    list1.remove(0);
                    
                }
                else if((s[0][2]+s[2][2]+(list1.get(1)).intValue())==15){
                    temp=(list1.get(1)).intValue()-s[1][2];
        			s[1][2]=s[1][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    
                    temp=(list1.get(0)).intValue()-s[1][0];
        			s[1][0]=s[1][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    list1.remove(1);
                    list1.remove(0);
                    
                    
                }
        	}
        	if(!cell_10){
        		if((s[0][0]+s[0][1]+(list1.get(0)).intValue())==15){
                    temp=(list1.get(0)).intValue()-s[0][2];
        			s[0][2]=s[0][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    
                    temp=(list1.get(1)).intValue()-s[2][0];
        			s[2][0]=s[2][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    list1.remove(1);
                    list1.remove(0);
                    
                }
                else if((s[0][0]+s[0][1]+(list1.get(1)).intValue())==15){
                    temp=(list1.get(1)).intValue()-s[0][2];
        			s[0][2]=s[0][2]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    
                    temp=(list1.get(0)).intValue()-s[2][0];
        			s[2][0]=s[2][0]+temp;
        			if(temp<0){
        				temp=temp*(-1);
        			}
        			count+=temp;
                    list1.remove(1);
                    list1.remove(0);
                    
                    
                }
        	}
        	list.clear();
        }
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                System.out.print(s[s_i][s_j]);
            }
            System.out.println("");
        }
       return count; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}

