package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			if (!theUndergraduateStudent.commitNeeded) {
				pageContext.getOut().print(theUndergraduateStudent.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			return theUndergraduateStudent.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing UndergraduateStudent for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			theUndergraduateStudent.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for researchOverview tag ");
		}
	}
}

