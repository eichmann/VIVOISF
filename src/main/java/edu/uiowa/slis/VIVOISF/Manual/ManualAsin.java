package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualAsinIterator theManual = (ManualAsinIterator)findAncestorWithClass(this, ManualAsinIterator.class);
			pageContext.getOut().print(theManual.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for asin tag ");
		}
		return SKIP_BODY;
	}
}

