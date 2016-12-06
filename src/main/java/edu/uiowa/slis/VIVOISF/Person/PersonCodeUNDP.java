package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCodeUNDPIterator thePerson = (PersonCodeUNDPIterator)findAncestorWithClass(this, PersonCodeUNDPIterator.class);
			pageContext.getOut().print(thePerson.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

