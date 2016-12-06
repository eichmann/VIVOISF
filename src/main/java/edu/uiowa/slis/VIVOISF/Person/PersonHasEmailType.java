package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasEmailIterator thePersonHasEmailIterator = (PersonHasEmailIterator)findAncestorWithClass(this, PersonHasEmailIterator.class);
			pageContext.getOut().print(thePersonHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

