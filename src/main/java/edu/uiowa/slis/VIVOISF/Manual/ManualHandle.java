package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualHandleIterator theManual = (ManualHandleIterator)findAncestorWithClass(this, ManualHandleIterator.class);
			pageContext.getOut().print(theManual.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for handle tag ");
		}
		return SKIP_BODY;
	}
}

