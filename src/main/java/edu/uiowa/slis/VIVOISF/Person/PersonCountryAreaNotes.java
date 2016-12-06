package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCountryAreaNotesIterator thePerson = (PersonCountryAreaNotesIterator)findAncestorWithClass(this, PersonCountryAreaNotesIterator.class);
			pageContext.getOut().print(thePerson.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

