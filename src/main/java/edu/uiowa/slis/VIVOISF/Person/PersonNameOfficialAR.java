package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameOfficialARIterator thePerson = (PersonNameOfficialARIterator)findAncestorWithClass(this, PersonNameOfficialARIterator.class);
			pageContext.getOut().print(thePerson.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

