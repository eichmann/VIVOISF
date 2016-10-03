package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualPagesIterator theManual = (ManualPagesIterator)findAncestorWithClass(this, ManualPagesIterator.class);
			pageContext.getOut().print(theManual.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for pages tag ");
		}
		return SKIP_BODY;
	}
}

