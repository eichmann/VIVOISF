package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolRecipientInverseIterator theSchoolRecipientInverseIterator = (SchoolRecipientInverseIterator)findAncestorWithClass(this, SchoolRecipientInverseIterator.class);
			pageContext.getOut().print(theSchoolRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing School for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for recipient tag ");
		}
		return SKIP_BODY;
	}
}

