package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizerInverseIterator theStudentOrganizerInverseIterator = (StudentOrganizerInverseIterator)findAncestorWithClass(this, StudentOrganizerInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for organizer tag ");
		}
		return SKIP_BODY;
	}
}

