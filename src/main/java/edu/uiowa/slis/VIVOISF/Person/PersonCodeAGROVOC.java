package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCodeAGROVOCIterator thePerson = (PersonCodeAGROVOCIterator)findAncestorWithClass(this, PersonCodeAGROVOCIterator.class);
			pageContext.getOut().print(thePerson.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

