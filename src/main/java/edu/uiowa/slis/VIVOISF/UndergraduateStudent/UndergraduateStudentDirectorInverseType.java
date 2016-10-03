package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentDirectorInverseIterator theUndergraduateStudentDirectorInverseIterator = (UndergraduateStudentDirectorInverseIterator)findAncestorWithClass(this, UndergraduateStudentDirectorInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for director tag ");
		}
		return SKIP_BODY;
	}
}

