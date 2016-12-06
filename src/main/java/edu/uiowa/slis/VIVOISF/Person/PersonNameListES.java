package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameListESIterator thePerson = (PersonNameListESIterator)findAncestorWithClass(this, PersonNameListESIterator.class);
			pageContext.getOut().print(thePerson.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

