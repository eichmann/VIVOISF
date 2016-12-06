package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCodeFAOSTATIterator thePerson = (PersonCodeFAOSTATIterator)findAncestorWithClass(this, PersonCodeFAOSTATIterator.class);
			pageContext.getOut().print(thePerson.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

