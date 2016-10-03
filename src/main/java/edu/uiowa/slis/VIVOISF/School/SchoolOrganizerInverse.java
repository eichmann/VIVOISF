package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolOrganizerInverseIterator theSchoolOrganizerInverseIterator = (SchoolOrganizerInverseIterator)findAncestorWithClass(this, SchoolOrganizerInverseIterator.class);
			pageContext.getOut().print(theSchoolOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing School for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for organizer tag ");
		}
		return SKIP_BODY;
	}
}

