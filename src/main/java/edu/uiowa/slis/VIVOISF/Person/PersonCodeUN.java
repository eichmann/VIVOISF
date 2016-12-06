package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCodeUNIterator thePerson = (PersonCodeUNIterator)findAncestorWithClass(this, PersonCodeUNIterator.class);
			pageContext.getOut().print(thePerson.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

