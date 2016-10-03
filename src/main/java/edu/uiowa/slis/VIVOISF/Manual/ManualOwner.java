package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualOwnerIterator theManualOwnerIterator = (ManualOwnerIterator)findAncestorWithClass(this, ManualOwnerIterator.class);
			pageContext.getOut().print(theManualOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for owner tag ");
		}
		return SKIP_BODY;
	}
}

