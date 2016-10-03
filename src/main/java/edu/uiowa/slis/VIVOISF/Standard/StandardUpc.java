package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardUpcIterator theStandard = (StandardUpcIterator)findAncestorWithClass(this, StandardUpcIterator.class);
			pageContext.getOut().print(theStandard.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for upc tag ");
		}
		return SKIP_BODY;
	}
}

