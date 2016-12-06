package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameOfficialZHIterator thePerson = (PersonNameOfficialZHIterator)findAncestorWithClass(this, PersonNameOfficialZHIterator.class);
			pageContext.getOut().print(thePerson.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

