package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationRecipientInverseIterator theFoundationRecipientInverseIterator = (FoundationRecipientInverseIterator)findAncestorWithClass(this, FoundationRecipientInverseIterator.class);
			pageContext.getOut().print(theFoundationRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for recipient tag ");
		}
		return SKIP_BODY;
	}
}

