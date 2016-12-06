package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonLandAreaNotesIterator thePerson = (PersonLandAreaNotesIterator)findAncestorWithClass(this, PersonLandAreaNotesIterator.class);
			pageContext.getOut().print(thePerson.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

