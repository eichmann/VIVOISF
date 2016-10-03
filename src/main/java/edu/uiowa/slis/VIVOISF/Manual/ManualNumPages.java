package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualNumPagesIterator theManual = (ManualNumPagesIterator)findAncestorWithClass(this, ManualNumPagesIterator.class);
			pageContext.getOut().print(theManual.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for numPages tag ");
		}
		return SKIP_BODY;
	}
}

