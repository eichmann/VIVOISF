package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualOwnerIterator theManualOwnerIterator = (ManualOwnerIterator)findAncestorWithClass(this, ManualOwnerIterator.class);
			pageContext.getOut().print(theManualOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for owner tag ");
		}
		return SKIP_BODY;
	}
}

