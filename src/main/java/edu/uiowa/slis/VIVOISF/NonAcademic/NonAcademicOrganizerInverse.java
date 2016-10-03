package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicOrganizerInverseIterator theNonAcademicOrganizerInverseIterator = (NonAcademicOrganizerInverseIterator)findAncestorWithClass(this, NonAcademicOrganizerInverseIterator.class);
			pageContext.getOut().print(theNonAcademicOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for organizer tag ");
		}
		return SKIP_BODY;
	}
}

