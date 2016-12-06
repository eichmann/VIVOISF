package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameOfficialESIterator thePerson = (PersonNameOfficialESIterator)findAncestorWithClass(this, PersonNameOfficialESIterator.class);
			pageContext.getOut().print(thePerson.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

