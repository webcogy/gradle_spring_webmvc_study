package gradle_spring_webmvc_study.survey;

import java.util.List;

/**
 * @author lenovo
 *
 */
/**
 * @author lenovo
 *
 */
public class Question {
    private String title;
    private List<String> options;
    
    /** 객관식
     * @param title
     * @param options
     */
    public Question(String title, List<String> options) {
        this.title = title;
        this.options = options;
    }

    /** 주관식
     * @param title
     */
    public Question(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getOptions() {
        return options;
    }

    /* 객관식 판단 */
    public boolean isChoice() {
        return options!=null && !options.isEmpty();
    }

    
}
