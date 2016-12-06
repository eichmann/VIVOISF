package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameShortESIterator thePerson = (PersonNameShortESIterator)findAncestorWithClass(this, PersonNameShortESIterator.class);
			pageContext.getOut().print(thePerson.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

