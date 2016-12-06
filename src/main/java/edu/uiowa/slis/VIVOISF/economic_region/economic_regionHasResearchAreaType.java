package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasResearchAreaIterator theeconomic_regionHasResearchAreaIterator = (economic_regionHasResearchAreaIterator)findAncestorWithClass(this, economic_regionHasResearchAreaIterator.class);
			pageContext.getOut().print(theeconomic_regionHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

