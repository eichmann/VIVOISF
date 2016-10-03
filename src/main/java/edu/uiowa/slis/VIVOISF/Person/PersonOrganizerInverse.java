package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonOrganizerInverseIterator thePersonOrganizerInverseIterator = (PersonOrganizerInverseIterator)findAncestorWithClass(this, PersonOrganizerInverseIterator.class);
			pageContext.getOut().print(thePersonOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for organizer tag ");
		}
		return SKIP_BODY;
	}
}

