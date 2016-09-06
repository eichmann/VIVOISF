package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentERACommonsIdIterator theUndergraduateStudent = (UndergraduateStudentERACommonsIdIterator)findAncestorWithClass(this, UndergraduateStudentERACommonsIdIterator.class);
			pageContext.getOut().print(theUndergraduateStudent.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

