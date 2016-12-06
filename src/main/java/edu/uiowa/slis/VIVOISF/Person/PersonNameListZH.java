package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameListZHIterator thePerson = (PersonNameListZHIterator)findAncestorWithClass(this, PersonNameListZHIterator.class);
			pageContext.getOut().print(thePerson.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

