package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardNumberIterator theStandard = (StandardNumberIterator)findAncestorWithClass(this, StandardNumberIterator.class);
			pageContext.getOut().print(theStandard.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for number tag ");
		}
		return SKIP_BODY;
	}
}

