package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentScopusIdIterator theUndergraduateStudent = (UndergraduateStudentScopusIdIterator)findAncestorWithClass(this, UndergraduateStudentScopusIdIterator.class);
			pageContext.getOut().print(theUndergraduateStudent.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

