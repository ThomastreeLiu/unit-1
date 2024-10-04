//Author:Thomas
//Name:SeriesTask(Pt2)
//Purpose:out put a story

public class SeriesTask {
    public static void main (String[] args){
        for (int i = 100;i>2;i--){
            System.out.println(i+" bottles of pop on the wall.  \n" +
                    i+" bottles of pop. \n" +
                    "If one of those bottles should happen to fall...  \n" +
                    "There would be "+(i-1)+" bottles of pop on the wall. \n");
        }
        System.out.println("2 bottles of pop on the wall.  \n" +
                "2 bottles of pop. \n" +
                "If one of those bottles should happen to fall...  \n" +
                "There would be 1 last bottle of pop on the wall. \n");
        System.out.println("1 bottle of pop on the wall.  \n" +
                "1 bottle of pop. \n" +
                "If that bottle should happen to fall... \n" +
                "There would be no more bottles of pop on the wall. ");
    }
}
