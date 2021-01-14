import java.util.Scanner;

 class Main1 {
    public static void main(String[] args)
    {
String a="";
String n="";
String [] matrix=new String[100];
String [] b=new String[100];
int l=-1,f=0,comp;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter Expression to Evaluate");
                String expr=scan.nextLine();   
				for(int i=0;i<expr.length();)
				{
					String t="";
					while(Character.isAlphabetic(expr.charAt(i)))
					{
						t+=expr.charAt(i);
						i++;
						if(i+1>expr.length())
						break;
					}
					
					
					if(l==-1)
					{
						if(t.length()>0)
						{
							l++;
							matrix[l]=t;
						}
					}
					else
					{
						f=0;
						for(int j=0;j<=l;j++)
						{
							if(matrix[j].equals(t))
							{
								f=1;
								break;
							}
						}
						if(f==0)
						{
							if(t.length()>0)
							{
								l++;
								matrix[l]=t;
							}
						}
					}
					if(i+1>expr.length())
					break;
					i++;
				}
				for(int i=0;i<=l;i++)
				{
					System.out.println("enter value of "+matrix[i]);
					String temp=scan.next();
					b[i]=temp;
				}
				for(int i=0;i<expr.length();)
				{
					String t="";
					while(Character.isAlphabetic(expr.charAt(i)))
					{
						t+=expr.charAt(i);
						i++;
						if(i+1>expr.length())
						break;
					}
					f=0;
					for(int j=0;j<=l;j++)
					{
						if(matrix[j].equals(t))
						{
							a+=b[j];
							break;
						}
					}
					if(i+1>expr.length())
					break;
					else
					a+=expr.charAt(i);
					i++;
				}
				for(int i=0;i<a.length();i++)
				{
					if(i==0)
					{
						if(a.charAt(i)=='+')
						{
							i++;
						}
					}
					if(a.charAt(i)=='+')
					{
						if(a.charAt(i+1)=='+')
						{
							
							n+='+';
							i=i++;
						}
						else if(a.charAt(i+1)=='-')
						{
							n+='-';
							i=i++;
						}
					}
					else if(a.charAt(i)=='-')
					{
						if(a.charAt(i+1)=='+')
						{
							n+='-';
							i=i++;
						}
						else if(a.charAt(i+1)=='-')
						{
							n+='+';
							i=i++;
						}
					}
					else
					{
						n+=a.charAt(i);
					}
				}
				System.out.println("Final "+n);
        } catch (Exception e) {
            System.out.println("Enter Correct Expression!!"+e);
        }
    }
}