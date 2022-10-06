package shool;
public class Course {
    private String courseName06;
    private String courseTeacher;
    private float courseScore;

    public String getCourseName06() {
        return courseName06;
    }

    public void setCourseName06(String courseName06) {
        if (!(courseName06.equals("语文")||courseName06.equals("数学")||courseName06.equals("英语")||courseName06.equals("java")))
        {
            System.out.println("没有该课程，请重新输入");
            return;
        }
        else
        {
            System.out.println("课程为"+courseName06);
            this.courseName06 = courseName06;}
    }

    public String getCourseTeacher() {

        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        System.out.println("教师为"+courseTeacher);
        this.courseTeacher = courseTeacher;
    }

    public int getCourseScore() {
        return (int)courseScore;
    }

    public void setCourseScore(int courseScore) {
        System.out.println("分数为"+courseScore);
        this.courseScore = courseScore;
    }

    public Course()
    {
        courseName06="";
        courseTeacher="";
        courseScore=0;
    }
    public Course(String courseName06)
    {
        courseName06=courseName06;
        courseTeacher="";
        courseScore=0;
    }
    public Course(String courseName06,String courseTeacher)
    {
        courseName06=courseName06;
        courseTeacher=courseTeacher;
        courseScore=0;
    }
    public Course(String courseName06,String courseTeacher,int courseScore)
    {
        courseName06=courseName06;
        courseTeacher=courseTeacher;
        courseScore=courseScore;
    }

}
