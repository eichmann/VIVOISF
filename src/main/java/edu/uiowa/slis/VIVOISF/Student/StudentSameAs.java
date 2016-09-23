package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StudentSameAsIterator theStudent = (StudentSameAsIterator)findAncestorWithClass(this, StudentSameAsIterator.class);
			pageContext.getOut().print(theStudent.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

