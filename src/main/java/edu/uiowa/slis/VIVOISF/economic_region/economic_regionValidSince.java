package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionValidSinceIterator theeconomic_region = (economic_regionValidSinceIterator)findAncestorWithClass(this, economic_regionValidSinceIterator.class);
			pageContext.getOut().print(theeconomic_region.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for validSince tag ");
		}
		return SKIP_BODY;
	}
}

