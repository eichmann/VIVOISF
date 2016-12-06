package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionResearchAreaOfIterator theeconomic_regionResearchAreaOfIterator = (economic_regionResearchAreaOfIterator)findAncestorWithClass(this, economic_regionResearchAreaOfIterator.class);
			pageContext.getOut().print(theeconomic_regionResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

