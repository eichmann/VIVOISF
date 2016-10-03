package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentOwnerInverseIterator theUndergraduateStudentOwnerInverseIterator = (UndergraduateStudentOwnerInverseIterator)findAncestorWithClass(this, UndergraduateStudentOwnerInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for owner tag ");
		}
		return SKIP_BODY;
	}
}

