package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualPageStartIterator theManual = (ManualPageStartIterator)findAncestorWithClass(this, ManualPageStartIterator.class);
			pageContext.getOut().print(theManual.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

