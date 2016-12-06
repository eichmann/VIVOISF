package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameShortITIterator thePerson = (PersonNameShortITIterator)findAncestorWithClass(this, PersonNameShortITIterator.class);
			pageContext.getOut().print(thePerson.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

