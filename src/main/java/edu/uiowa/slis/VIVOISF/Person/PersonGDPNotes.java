package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonGDPNotesIterator thePerson = (PersonGDPNotesIterator)findAncestorWithClass(this, PersonGDPNotesIterator.class);
			pageContext.getOut().print(thePerson.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

