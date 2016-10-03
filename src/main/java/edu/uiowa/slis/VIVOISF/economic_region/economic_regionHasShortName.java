package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasShortName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasShortNameIterator theeconomic_region = (economic_regionHasShortNameIterator)findAncestorWithClass(this, economic_regionHasShortNameIterator.class);
			pageContext.getOut().print(theeconomic_region.getHasShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasShortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasShortName tag ");
		}
		return SKIP_BODY;
	}
}

