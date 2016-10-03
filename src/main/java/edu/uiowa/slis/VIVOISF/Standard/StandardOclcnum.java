package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardOclcnumIterator theStandard = (StandardOclcnumIterator)findAncestorWithClass(this, StandardOclcnumIterator.class);
			pageContext.getOut().print(theStandard.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

