package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasURLIterator thePersonHasURLIterator = (PersonHasURLIterator)findAncestorWithClass(this, PersonHasURLIterator.class);
			pageContext.getOut().print(thePersonHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

