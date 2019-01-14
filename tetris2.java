import java.util.Scanner;
class stack {
  char board[][] = new char[15][20];
  int a[] = new int[8];
  int t;
  char s;
  int score;
}
class shape {
  char s;
  int t;
  int a[] = new int[8];
  int active=1;
  public void initI() {
    s='i';
    t=2;
    int i,m=1;
    for(i=0;i<8;i=i+2) {
      a[i]=m;
      m++;
    }
    for(i=1;i<8;i=i+2) {
      a[i]=9;
    }
  }
  public void initL1() {
    int i,m=1;
    s='l';
    t=1;
    for(i=0;i<6;i+=2) {
      a[i]=m;
      m++;
    }
    for(i=1;i<7;i+=2) {
      a[i]=9;
    }
    a[6]=m-1;
    a[7]=10;
  }
  public void initL2() {
    int i,m=1;
    s='L';
    t=1;
    for(i=0;i<6;i+=2) {
      a[i]=m;
      m++;
    }
    for(i=1;i<7;i+=2) {
      a[i]=10;
    }
    a[6]=m-1;
    a[7]=9;
  }
  public void initT() {
    int i,m=1;
    s='t';
    t=1;
    for(i=0;i<6;i+=2) {
      a[i]=m;
      m++;
    }
    for(i=1;i<7;i+=2) {
      a[i]=9;
    }
    a[6]=m-2;
    a[7]=10;
  }
  public void initZ1() {
    s='z';
    t=1;
    a[0]=1;
    a[1]=8;
    a[2]=1;
    a[3]=9;
    a[4]=2;
    a[5]=9;
    a[6]=2;
    a[7]=10;
  }
  public void initZ2() {
    s='Z';
    t=1;
    a[0]=1;
    a[1]=9;
    a[2]=1;
    a[3]=10;
    a[4]=2;
    a[5]=9;
    a[6]=2;
    a[7]=8;
  }
  public void initBox() {
    s='b';
    t=1;
    a[0]=1;
    a[1]=9;
    a[2]=1;
    a[3]=10;
    a[4]=2;
    a[5]=9;
    a[6]=2;
    a[7]=10;
  }
  public int[] rotI(int x[]) {
    if(t==1) {
      int temp1=a[0];
      int temp2=a[3];
      x[0]=temp1-3;
      x[1]=temp2;
      x[2]=temp1-2;
      x[3]=temp2;
      x[4]=temp1-1;
      x[5]=temp2;
      x[6]=temp1;
      x[7]=temp2;
      t=2;
    }
    else if(t==2) {
      int temp1=a[6];
      int temp2=a[3];
      x[0]=temp1;
      x[1]=temp2-1;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1;
      x[5]=temp2+1;
      x[6]=temp1;
      x[7]=temp2+2;
      t=1;
    }
    return x;
  }
  public int[] rotZ1(int x[]) {
    if(t==1) {
      int temp1=a[0];
      int temp2=a[3];
      x[0]=temp1+1;
      x[1]=temp2-1;
      x[2]=temp1;
      x[3]=temp2-1;
      x[4]=temp1;
      x[5]=temp2;
      x[6]=temp1-1;
      x[7]=temp2;
      t=2;
    }
    else if(t==2) {
      int temp1=a[0];
      int temp2=a[5];
      x[0]=temp1-1;
      x[1]=temp2-1;
      x[2]=temp1-1;
      x[3]=temp2;
      x[4]=temp1;
      x[5]=temp2;
      x[6]=temp1;
      x[7]=temp2+1;
      t=1;
    }
    return x;
  }
  public int[] rotZ2(int x[]) {
    if(t==1) {
      int temp1=a[0];
      int temp2=a[1];
      x[0]=temp1+1;
      x[1]=temp2;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1;
      x[5]=temp2-1;
      x[6]=temp1-1;
      x[7]=temp2-1;
      t=2;
    }
    else if(t==2) {
      int temp1=a[0];
      int temp2=a[1];
      x[4]=temp1;
      x[5]=temp2-1;
      x[6]=temp1;
      x[7]=temp2;
      x[0]=temp1-1;
      x[1]=temp2;
      x[2]=temp1-1;
      x[3]=temp2+1;
      t=1;
    }
    return x;
  }
  public int[] rotT(int x[]) {
    if(t==1) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1;
      x[1]=temp2-1;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1;
      x[5]=temp2+1;
      x[6]=temp1-1;
      x[7]=temp2;
      t=2;
    }
    else if(t==2) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1+1;
      x[1]=temp2;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1-1;
      x[5]=temp2;
      x[6]=temp1;
      x[7]=temp2-1;
      t=3;
    }
    else if(t==3) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1;
      x[1]=temp2-1;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1;
      x[5]=temp2+1;
      x[6]=temp1+1;
      x[7]=temp2;
      t=4;
    }
    else if(t==4) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1+1;
      x[1]=temp2;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1-1;
      x[5]=temp2;
      x[6]=temp1;
      x[7]=temp2+1;
      t=1;
    }
    return x;
  }
  public int[] rotL1(int x[]) {
    if(t==1) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1;
      x[1]=temp2-1;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1;
      x[5]=temp2+1;
      x[6]=temp1-1;
      x[7]=temp2+1;
      t=2;
    }
    else if(t==2) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1+1;
      x[1]=temp2;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1-1;
      x[5]=temp2;
      x[6]=temp1-1;
      x[7]=temp2-1;
      t=3;
    }
    else if(t==3) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1;
      x[1]=temp2+1;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1;
      x[5]=temp2-1;
      x[6]=temp1+1;
      x[7]=temp2-1;
      t=4;
    }
    else if(t==4) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1-1;
      x[1]=temp2;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1+1;
      x[5]=temp2;
      x[6]=temp1+1;
      x[7]=temp2+1;
      t=1;
    }
    return x;
  }
  public int[] rotL2(int x[]) {
    if(t==1) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1;
      x[1]=temp2-1;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1;
      x[5]=temp2+1;
      x[6]=temp1+1;
      x[7]=temp2+1;
      t=2;
    }
    else if(t==2) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1+1;
      x[1]=temp2;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1-1;
      x[5]=temp2;
      x[6]=temp1-1;
      x[7]=temp2+1;
      t=3;
    }
    else if(t==3) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1;
      x[1]=temp2+1;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1;
      x[5]=temp2-1;
      x[6]=temp1-1;
      x[7]=temp2-1;
      t=4;
    }
    else if(t==4) {
      int temp1=a[2];
      int temp2=a[3];
      x[0]=temp1-1;
      x[1]=temp2;
      x[2]=temp1;
      x[3]=temp2;
      x[4]=temp1+1;
      x[5]=temp2;
      x[6]=temp1+1;
      x[7]=temp2-1;
      t=1;
    }
    return x;
  }
  public void moveDown() {
    int i;
    for(i=0;i<8;i=i+2) {
      a[i]++;
    }
  }
  public void moveLeft() {
    int i;
    for(i=1;i<8;i=i+2) {
      a[i]--;
    }
  }
  public void moveRight() {
    int i;
    for(i=1;i<8;i=i+2) {
      a[i]++;
    }
  }
  public void nextShape(int ch) {
    switch(ch) {
      case 0:
        initI();
        break;
      case 1:
        initL1();
        break;
      case 2:
        initL2();
        break;
      case 3:
        initZ1();
        break;
      case 4:
        initZ2();
        break;
      case 5:
        initT();
        break;
      case 6:
        initBox();
        break;
    }
  }
}
class tetris2 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    stack[] undo = new stack[1000];
    stack[] redo = new stack[1000];
    int top1=-1,top2=-1;
    shape sh = new shape();
    int r=15,c=20;
    char board[][] = new char[r][c];
    int temp[] = new int[8];
    initBoard(board,r,c);
    move(board,r,c,sh,top1,undo,top2,redo);
  }
  public static int push(char board[][],int r,int c,shape sh,int top,stack stk[],int score) {
    int i,j;
    top++;
    stk[top]= new stack();
    for(i=0;i<r;i++) {
      for(j=0;j<c;j++) {
        stk[top].board[i][j]=board[i][j];
      }
    }
    for(i=0;i<8;i++) {
      stk[top].a[i]=sh.a[i];
    }
    //undo[top].board=board;
    //undo[top].a=sh.a;
    stk[top].s=sh.s;
    stk[top].t=sh.t;
    stk[top].score=score;
    return top;
  }
  public static int pop(int top) {
    top--;
    return top;
  }
  public static int checkLine(char board[][],int r,int c,int score) {
    int flag=0;
    char temp[][] = new char[r][c];
    for(int i=1;i<r-1;i++) {
      flag=0;
      for(int j=1;j<c-1;j++) {
        if(board[i][j]!='#') {
          flag=1;
          break;
        }
      }
      if(flag==0) {
        int k,l;
        score+=10;
        for(k=1;k<c-1;k++) {
          board[i][k]=' ';
        }
        for(k=1;k<i;k++) {
          for(l=1;l<c-1;l++) {
            temp[k][l]=board[k][l];
          }
        }
        for(k=2;k<i+1;k++) {
          for(l=1;l<c-1;l++) {
            board[k][l]=temp[k-1][l];
          }
        }
      }
    }
    return score;
  }
  public static int rando() {
    Double x = Math.random();
    x*=7;
    int ans = x.intValue();
    return ans;
  }
  public static void move(char board[][],int r,int c,shape sh,int top1,stack undo[],int top2,stack redo[]) {
    Scanner in = new Scanner(System.in);
    char ch;
    int temp[] = new int[8];
    int flag=0,i,x;
    int score=0;
    temp=sh.a;
    ch=in.next().charAt(0);
    do {
      sh.nextShape(rando());
      sh.active=1;
      temp=sh.a;
      board=embedShape(board,temp);
      refresh(board,r,c,score);
      while(sh.active==1) {
        while(ch<=122&&ch>=97) {
          if(ch=='s') {
            if(checkMove(board,r,c,sh,ch)==2) {
              flag=1;
              break;
            }
            else {
              top1=push(board,r,c,sh,top1,undo,score);
              board=clearShape(board,temp);
              int f=0;
              for(int j=0;j<8;j=j+2) {
                if(board[sh.a[j]+1][sh.a[j+1]]!=' ') {
                  f=1;
                  break;
                }
              }
              if(f!=1) {
                sh.moveDown();
              }
              else {
                board=embedShape(board,temp);
                break;
              }
            }
          }
          else if(ch=='a') {
            if(checkMove(board,r,c,sh,ch)==2) {
              flag=1;
              break;
            }
            else if(checkMove(board,r,c,sh,ch)!=1){
              top1=push(board,r,c,sh,top1,undo,score);
              board=clearShape(board,temp);
              int f=0;
              for(int j=1;j<8;j=j+2) {
                if(board[sh.a[j-1]][sh.a[j]-1]!=' ') {
                  f=1;
                  break;
                }
              }
              if(f!=1) {
                sh.moveLeft();
              }
              else {
                board=embedShape(board,temp);
                break;
              }
            }
          }
          else if(ch=='d') {
            if(checkMove(board,r,c,sh,ch)==2) {
              flag=1;
              break;
            }
            else if(checkMove(board,r,c,sh,ch)!=1){
              top1=push(board,r,c,sh,top1,undo,score);
              board=clearShape(board,temp);
              int f=0;
              for(int j=1;j<8;j=j+2) {
                if(board[sh.a[j-1]][sh.a[j]+1]!=' ') {
                  f=1;
                  break;
                }
              }
              if(f!=1) {
                sh.moveRight();
              }
              else {
                board=embedShape(board,temp);
                break;
              }
            }
          }
          else if(ch=='r') {
            top1=push(board,r,c,sh,top1,undo,score);
            temp=rotateShape(temp,sh,board);
            //rotate2(board,temp,sh);
          }
          else if(ch=='z') {
            if(top1-1!=-1) {
              top2=push(board,r,c,sh,top2,redo,score);
              for(i=0;i<r;i++) {
                for(int j=0;j<c;j++) {
                  board[i][j]=undo[top1].board[i][j];
                }
              }
              for(i=0;i<8;i++) {
                sh.a[i]=undo[top1].a[i];
              }
              sh.t=undo[top1].t;
              sh.s=undo[top1].s;
              score=undo[top1].score;
              top1=pop(top1);
            }
          }
          else if(ch=='y') {
            if(top2-1!=-1) {
              top1=push(board,r,c,sh,top1,undo,score);
              for(i=0;i<r;i++) {
                for(int j=0;j<c;j++) {
                  board[i][j]=redo[top2].board[i][j];
                }
              }
              for(i=0;i<8;i++) {
                sh.a[i]=redo[top2].a[i];
              }
              sh.t=redo[top2].t;
              sh.s=redo[top2].s;
              score=redo[top2].score;
              top2=pop(top2);
            }
          }
          else if(ch=='h') {
            char save[] = new char[1000];
          }
          board=embedShape(board,temp);
          refresh(board,r,c,score);
          ch=in.next().charAt(0);
        }
        sh.active=0;
        // System.out.println("-------------------");
        // System.out.println("top1 = "+top1);
        // System.out.println("top2 = "+top2);
        // System.out.println("-------------------");
      }
      score=checkLine(board,r,c,score);
    } while(endGame(board,r,c)==1);
    System.out.println("\n       GAME OVER\n\n       Score = "+score);
  }
  public static int endGame(char board[][],int r,int c) {
    int i,j;
    for(i=2;i<3;i++) {
      for(j=8;j<11;j++) {
        if(board[i][j]!=' ') {
          //System.out.println("++++++++++++++++++++++++++++++++++++"+i+"+++++++++++++++"+j);
          return 0;
        }
      }
    }
    return 1;
  }
  public static int[] rotateShape(int temp[],shape sh,char board[][]) {
    int x[] = new int[8];
    int i;
    if(sh.s!='b') {
      board=clearShape(board,temp);
    }
    else {
      return temp;
    }
    if(sh.s=='i') {
      x=sh.rotI(x);
    }
    else if(sh.s=='z') {
      x=sh.rotZ1(x);
    }
    else if(sh.s=='Z') {
      x=sh.rotZ2(x);
    }
    else if(sh.s=='l') {
      x=sh.rotL1(x);
    }
    else if(sh.s=='L') {
      x=sh.rotL2(x);
    }
    else if(sh.s=='t') {
      x=sh.rotT(x);
    }
    int flag=0;
    flag=checkValid(board,x);
    if(flag==0) {
      sh.a=x;
      temp=x;
    }
    return temp;
  }
  public static int checkValid(char board[][],int temp[]) {
    int i=0;
    while(i<8) {
      int x=temp[i];
      i++;
      int y=temp[i];
      if(board[x][y]!=' ') {
        return 1;
      }
      i++;
    }
    return 0;
  }
  public static int getMaxRow(int a[]) {
    int max=a[0],i;
    for(i=2;i<8;i+=2) {
      if(max<a[i]) {
        max=a[i];
      }
    }
    return max;
  }
  public static int getMaxCol(int a[]) {
    int max=a[1],i;
    for(i=3;i<8;i+=2) {
      if(max<a[i]) {
        max=a[i];
      }
    }
    return max;
  }
  public static int getMinCol(int a[]) {
    int min=a[1],i;
    for(i=3;i<8;i+=2) {
      if(min>a[i]) {
        min=a[i];
      }
    }
    return min;
  }
  public static int checkMove(char board[][],int r,int c,shape sh,char ch) {
    int i,m=0,flag=0;
    int temp[] = new int[4];
    if(ch=='s') {
      int max = getMaxRow(sh.a);
      m=0;
      for(i=1;i<8;i+=2) {
        if(sh.a[i-1]==max) {
          temp[m]=sh.a[i];
          m++;
        }
      }
      for(i=0;i<m;i++) {
        if(board[max+1][temp[i]]!=' ') {
          return 2;
        }
      }
    }
    else if(ch=='a') {
      int min = getMinCol(sh.a);
      if(min==1) {
        return 1;
      }
      m=0;
      for(i=0;i<8;i+=2) {
        if(sh.a[i+1]==min) {
          temp[m]=sh.a[i];
          m++;
        }
      }
      for(i=0;i<m;i++) {
        if(board[temp[i]][min-1]=='#') {
          return 2;
        }
      }
    }
    else if(ch=='d') {
      int max = getMaxCol(sh.a);
      if(max==c-2) {
        //System.out.println("asdasd");
        return 1;
      }
      //System.out.println(max);
      m=0;
      for(i=0;i<8;i+=2) {
        if(sh.a[i+1]==max) {
          temp[m]=sh.a[i];
          m++;
        }
      }
      for(i=0;i<m;i++) {
        if(board[temp[i]][max+1]=='#') {
          return 2;
        }
      }
    }
    return 0;
  }
  public static char[][] embedShape(char board[][],int temp[]) {
    int i=0;
    while(i<8) {
      int x=temp[i];
      i++;
      int y=temp[i];
      //System.out.println(x+"\t"+y);
      board[x][y]='#';
      i++;
    }
    return board;
  }
  public static char[][] clearShape(char board[][],int temp[]) {
    int i=0;
    while(i<8) {
      int x=temp[i];
      i++;
      int y=temp[i];
      board[x][y]=' ';
      i++;
    }
    return board;
  }
  public static void initBoard(char a[][],int r,int c) {
    int i,j;
    for(i=0;i<r;i++) {
      for(j=0;j<c;j++) {
        a[i][j]=' ';
      }
    }
    for(i=0;i<r;i++) {
      a[i][0]='x';
      a[i][c-1]='x';
    }
    for(i=0;i<c;i++) {
      a[r-1][i]='x';
      a[0][i]='x';
    }
  }
  public static void refresh(char a[][],int r,int c,int score) {
    int i,j;
    System.out.println("     Score = "+score+"\n");
    for(i=0;i<r;i++) {
      for(j=0;j<c;j++) {
        System.out.print(a[i][j]);
      }
      System.out.println("");
    }
  }
}
