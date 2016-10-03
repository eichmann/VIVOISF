package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualIssuerIterator theManualIssuerIterator = (ManualIssuerIterator)findAncestorWithClass(this, ManualIssuerIterator.class);
			pageContext.getOut().print(theManualIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for issuer tag ");
		}
		return SKIP_BODY;
	}
}

