package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonAgriculturalAreaNotesIterator thePerson = (PersonAgriculturalAreaNotesIterator)findAncestorWithClass(this, PersonAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(thePerson.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

