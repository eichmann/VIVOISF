package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameShortARIterator thePerson = (PersonNameShortARIterator)findAncestorWithClass(this, PersonNameShortARIterator.class);
			pageContext.getOut().print(thePerson.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

