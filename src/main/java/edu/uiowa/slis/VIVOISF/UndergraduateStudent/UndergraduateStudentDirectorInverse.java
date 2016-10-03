package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentDirectorInverseIterator theUndergraduateStudentDirectorInverseIterator = (UndergraduateStudentDirectorInverseIterator)findAncestorWithClass(this, UndergraduateStudentDirectorInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for director tag ");
		}
		return SKIP_BODY;
	}
}

