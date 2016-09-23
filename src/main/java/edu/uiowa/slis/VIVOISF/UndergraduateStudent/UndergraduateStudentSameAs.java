package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentSameAsIterator theUndergraduateStudent = (UndergraduateStudentSameAsIterator)findAncestorWithClass(this, UndergraduateStudentSameAsIterator.class);
			pageContext.getOut().print(theUndergraduateStudent.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

