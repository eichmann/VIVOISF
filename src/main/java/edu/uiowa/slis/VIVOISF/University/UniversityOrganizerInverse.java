package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityOrganizerInverseIterator theUniversityOrganizerInverseIterator = (UniversityOrganizerInverseIterator)findAncestorWithClass(this, UniversityOrganizerInverseIterator.class);
			pageContext.getOut().print(theUniversityOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing University for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for organizer tag ");
		}
		return SKIP_BODY;
	}
}

