package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizerInverseIterator theStudentOrganizerInverseIterator = (StudentOrganizerInverseIterator)findAncestorWithClass(this, StudentOrganizerInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for organizer tag ");
		}
		return SKIP_BODY;
	}
}

