package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameShortZHIterator thePerson = (PersonNameShortZHIterator)findAncestorWithClass(this, PersonNameShortZHIterator.class);
			pageContext.getOut().print(thePerson.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

