package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentSuffixNameIterator theUndergraduateStudent = (UndergraduateStudentSuffixNameIterator)findAncestorWithClass(this, UndergraduateStudentSuffixNameIterator.class);
			pageContext.getOut().print(theUndergraduateStudent.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

