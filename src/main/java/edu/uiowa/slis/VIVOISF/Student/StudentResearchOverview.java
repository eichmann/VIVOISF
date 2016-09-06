package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			if (!theStudent.commitNeeded) {
				pageContext.getOut().print(theStudent.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Student for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			return theStudent.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Student for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			theStudent.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Student for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for researchOverview tag ");
		}
	}
}

