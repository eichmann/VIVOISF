package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonHDINotesIterator thePerson = (PersonHDINotesIterator)findAncestorWithClass(this, PersonHDINotesIterator.class);
			pageContext.getOut().print(thePerson.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

