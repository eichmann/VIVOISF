package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentResearcherId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentResearcherId currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentResearcherId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StudentResearcherIdIterator theStudent = (StudentResearcherIdIterator)findAncestorWithClass(this, StudentResearcherIdIterator.class);
			pageContext.getOut().print(theStudent.getResearcherId());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for researcherId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for researcherId tag ");
		}
		return SKIP_BODY;
	}
}

