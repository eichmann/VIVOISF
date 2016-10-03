package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualUpcIterator theManual = (ManualUpcIterator)findAncestorWithClass(this, ManualUpcIterator.class);
			pageContext.getOut().print(theManual.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for upc tag ");
		}
		return SKIP_BODY;
	}
}

