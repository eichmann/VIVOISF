package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameListRUIterator thePerson = (PersonNameListRUIterator)findAncestorWithClass(this, PersonNameListRUIterator.class);
			pageContext.getOut().print(thePerson.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

