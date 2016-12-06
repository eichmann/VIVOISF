package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasResearchAreaIterator theeconomic_regionHasResearchAreaIterator = (economic_regionHasResearchAreaIterator)findAncestorWithClass(this, economic_regionHasResearchAreaIterator.class);
			pageContext.getOut().print(theeconomic_regionHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

