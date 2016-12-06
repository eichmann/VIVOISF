package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonPopulationNotesIterator thePerson = (PersonPopulationNotesIterator)findAncestorWithClass(this, PersonPopulationNotesIterator.class);
			pageContext.getOut().print(thePerson.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

