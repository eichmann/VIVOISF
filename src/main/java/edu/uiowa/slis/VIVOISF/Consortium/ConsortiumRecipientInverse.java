package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumRecipientInverseIterator theConsortiumRecipientInverseIterator = (ConsortiumRecipientInverseIterator)findAncestorWithClass(this, ConsortiumRecipientInverseIterator.class);
			pageContext.getOut().print(theConsortiumRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for recipient tag ");
		}
		return SKIP_BODY;
	}
}

