package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualStatusIterator theManualStatusIterator = (ManualStatusIterator)findAncestorWithClass(this, ManualStatusIterator.class);
			pageContext.getOut().print(theManualStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for status tag ");
		}
		return SKIP_BODY;
	}
}

