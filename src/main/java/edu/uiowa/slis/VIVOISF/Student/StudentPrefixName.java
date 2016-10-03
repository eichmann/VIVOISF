package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StudentPrefixNameIterator theStudent = (StudentPrefixNameIterator)findAncestorWithClass(this, StudentPrefixNameIterator.class);
			pageContext.getOut().print(theStudent.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

