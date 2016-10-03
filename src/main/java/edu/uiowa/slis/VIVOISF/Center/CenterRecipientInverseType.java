package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterRecipientInverseIterator theCenterRecipientInverseIterator = (CenterRecipientInverseIterator)findAncestorWithClass(this, CenterRecipientInverseIterator.class);
			pageContext.getOut().print(theCenterRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for recipient tag ");
		}
		return SKIP_BODY;
	}
}

