package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionDescriptionIterator theeconomic_region = (economic_regionDescriptionIterator)findAncestorWithClass(this, economic_regionDescriptionIterator.class);
			pageContext.getOut().print(theeconomic_region.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for description tag ");
		}
		return SKIP_BODY;
	}
}

