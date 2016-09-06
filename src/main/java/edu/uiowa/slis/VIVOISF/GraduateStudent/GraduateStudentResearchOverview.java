package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			if (!theGraduateStudent.commitNeeded) {
				pageContext.getOut().print(theGraduateStudent.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			return theGraduateStudent.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing GraduateStudent for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			theGraduateStudent.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for researchOverview tag ");
		}
	}
}

