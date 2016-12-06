package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameListFRIterator thePerson = (PersonNameListFRIterator)findAncestorWithClass(this, PersonNameListFRIterator.class);
			pageContext.getOut().print(thePerson.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

