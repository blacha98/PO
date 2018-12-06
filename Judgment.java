import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Judgment {
    public int id;
    public CourtType courtType;
    public JudgmentType judgmentType;
    public String name;
    public Function function;
    public SpecialRoles role;
    public LinkedList<CourtCase> courtCases = new LinkedList<>();
    public List<Judge> judges = new LinkedList<>();
    public JudgmentSource source;
    public List<String> courtReporters = new LinkedList<>();
    public String decision;
    public String summary;
    public String textContent;
    public List<String> legalBases = new LinkedList<>();
    public List<Regulation> referencedRegulations = new LinkedList<>();
    public List<String> keyWords = new LinkedList<>();
    public Date receiptDate = new Date();
    public String meansOfAppeal;
    public String jedgmentResult;
    public List<String> lowerCourtJudgments = new LinkedList<>();
    public PersonnelType personnelType;
}
