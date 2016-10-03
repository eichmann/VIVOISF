package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentOrganizerInverseIterator theUndergraduateStudentOrganizerInverseIterator = (UndergraduateStudentOrganizerInverseIterator)findAncestorWithClass(this, UndergraduateStudentOrganizerInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for organizer tag ");
		}
		return SKIP_BODY;
	}
}

