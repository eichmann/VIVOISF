package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameOfficialFRIterator thePerson = (PersonNameOfficialFRIterator)findAncestorWithClass(this, PersonNameOfficialFRIterator.class);
			pageContext.getOut().print(thePerson.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

