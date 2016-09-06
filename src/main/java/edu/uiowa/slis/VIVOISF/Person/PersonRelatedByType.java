package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonRelatedByIterator thePersonRelatedByIterator = (PersonRelatedByIterator)findAncestorWithClass(this, PersonRelatedByIterator.class);
			pageContext.getOut().print(thePersonRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

