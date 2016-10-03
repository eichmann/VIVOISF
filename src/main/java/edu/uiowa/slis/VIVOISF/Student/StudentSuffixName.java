package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StudentSuffixNameIterator theStudent = (StudentSuffixNameIterator)findAncestorWithClass(this, StudentSuffixNameIterator.class);
			pageContext.getOut().print(theStudent.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

