package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualPresentedAtIterator theManualPresentedAtIterator = (ManualPresentedAtIterator)findAncestorWithClass(this, ManualPresentedAtIterator.class);
			pageContext.getOut().print(theManualPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

