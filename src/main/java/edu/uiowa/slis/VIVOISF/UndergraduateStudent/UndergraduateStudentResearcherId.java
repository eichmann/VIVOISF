package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentResearcherId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentResearcherId currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentResearcherId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentResearcherIdIterator theUndergraduateStudent = (UndergraduateStudentResearcherIdIterator)findAncestorWithClass(this, UndergraduateStudentResearcherIdIterator.class);
			pageContext.getOut().print(theUndergraduateStudent.getResearcherId());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for researcherId tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for researcherId tag ");
		}
		return SKIP_BODY;
	}
}

