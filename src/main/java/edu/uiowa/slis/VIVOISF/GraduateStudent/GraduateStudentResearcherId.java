package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentResearcherId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentResearcherId currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentResearcherId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentResearcherIdIterator theGraduateStudent = (GraduateStudentResearcherIdIterator)findAncestorWithClass(this, GraduateStudentResearcherIdIterator.class);
			pageContext.getOut().print(theGraduateStudent.getResearcherId());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for researcherId tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for researcherId tag ");
		}
		return SKIP_BODY;
	}
}

