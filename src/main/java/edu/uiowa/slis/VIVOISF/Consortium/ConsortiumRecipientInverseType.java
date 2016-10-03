package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumRecipientInverseIterator theConsortiumRecipientInverseIterator = (ConsortiumRecipientInverseIterator)findAncestorWithClass(this, ConsortiumRecipientInverseIterator.class);
			pageContext.getOut().print(theConsortiumRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for recipient tag ");
		}
		return SKIP_BODY;
	}
}

