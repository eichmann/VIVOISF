package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualUriIterator theManual = (ManualUriIterator)findAncestorWithClass(this, ManualUriIterator.class);
			pageContext.getOut().print(theManual.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for uri tag ");
		}
		return SKIP_BODY;
	}
}

