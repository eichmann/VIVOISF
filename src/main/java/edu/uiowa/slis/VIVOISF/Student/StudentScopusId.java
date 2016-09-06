package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StudentScopusIdIterator theStudent = (StudentScopusIdIterator)findAncestorWithClass(this, StudentScopusIdIterator.class);
			pageContext.getOut().print(theStudent.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

