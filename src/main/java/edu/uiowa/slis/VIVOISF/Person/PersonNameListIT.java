package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameListITIterator thePerson = (PersonNameListITIterator)findAncestorWithClass(this, PersonNameListITIterator.class);
			pageContext.getOut().print(thePerson.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

