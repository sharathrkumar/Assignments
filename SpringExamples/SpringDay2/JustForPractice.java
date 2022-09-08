import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

class Question {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Question: "+name;
    }
}

class Answers
{
    int id;
    Question question;
    List ans;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List getAns() {
        return ans;
    }

    public void setAns(List ans) {
        this.ans = ans;
    }
    void show()
    {
        System.out.println("id:"+id+"\nQuestion: "+question+"\nAnswers:");
        Iterator itr = ans.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
public class JustForPractice {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("justForPractice.xml");
        Answers ans = (Answers) context.getBean("ans");
        ans.show();
    }
}
