package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameListARIterator thePerson = (PersonNameListARIterator)findAncestorWithClass(this, PersonNameListARIterator.class);
			pageContext.getOut().print(thePerson.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

