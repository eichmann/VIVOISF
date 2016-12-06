package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameShortRUIterator thePerson = (PersonNameShortRUIterator)findAncestorWithClass(this, PersonNameShortRUIterator.class);
			pageContext.getOut().print(thePerson.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

