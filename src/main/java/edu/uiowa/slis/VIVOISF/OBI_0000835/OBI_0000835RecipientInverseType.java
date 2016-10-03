package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835RecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835RecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835RecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835RecipientInverseIterator theOBI_0000835RecipientInverseIterator = (OBI_0000835RecipientInverseIterator)findAncestorWithClass(this, OBI_0000835RecipientInverseIterator.class);
			pageContext.getOut().print(theOBI_0000835RecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for recipient tag ");
		}
		return SKIP_BODY;
	}
}

