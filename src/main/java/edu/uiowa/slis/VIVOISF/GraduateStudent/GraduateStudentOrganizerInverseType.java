package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentOrganizerInverseIterator theGraduateStudentOrganizerInverseIterator = (GraduateStudentOrganizerInverseIterator)findAncestorWithClass(this, GraduateStudentOrganizerInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for organizer tag ");
		}
		return SKIP_BODY;
	}
}

