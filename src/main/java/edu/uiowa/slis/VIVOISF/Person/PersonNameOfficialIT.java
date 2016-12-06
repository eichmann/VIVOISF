package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameOfficialITIterator thePerson = (PersonNameOfficialITIterator)findAncestorWithClass(this, PersonNameOfficialITIterator.class);
			pageContext.getOut().print(thePerson.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

