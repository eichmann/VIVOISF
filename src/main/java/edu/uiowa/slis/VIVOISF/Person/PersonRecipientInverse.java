package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonRecipientInverseIterator thePersonRecipientInverseIterator = (PersonRecipientInverseIterator)findAncestorWithClass(this, PersonRecipientInverseIterator.class);
			pageContext.getOut().print(thePersonRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for recipient tag ");
		}
		return SKIP_BODY;
	}
}

