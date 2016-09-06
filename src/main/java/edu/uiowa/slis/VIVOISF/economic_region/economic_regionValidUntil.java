package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionValidUntilIterator theeconomic_region = (economic_regionValidUntilIterator)findAncestorWithClass(this, economic_regionValidUntilIterator.class);
			pageContext.getOut().print(theeconomic_region.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

