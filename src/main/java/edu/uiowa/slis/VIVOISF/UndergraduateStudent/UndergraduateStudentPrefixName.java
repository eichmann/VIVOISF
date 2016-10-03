package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentPrefixNameIterator theUndergraduateStudent = (UndergraduateStudentPrefixNameIterator)findAncestorWithClass(this, UndergraduateStudentPrefixNameIterator.class);
			pageContext.getOut().print(theUndergraduateStudent.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

