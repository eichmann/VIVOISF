package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCodeGAULIterator thePerson = (PersonCodeGAULIterator)findAncestorWithClass(this, PersonCodeGAULIterator.class);
			pageContext.getOut().print(thePerson.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

