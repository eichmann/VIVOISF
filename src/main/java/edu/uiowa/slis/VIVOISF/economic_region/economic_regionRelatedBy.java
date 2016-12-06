package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionRelatedByIterator theeconomic_regionRelatedByIterator = (economic_regionRelatedByIterator)findAncestorWithClass(this, economic_regionRelatedByIterator.class);
			pageContext.getOut().print(theeconomic_regionRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

