package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasCode currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasCodeIterator theeconomic_region = (economic_regionHasCodeIterator)findAncestorWithClass(this, economic_regionHasCodeIterator.class);
			pageContext.getOut().print(theeconomic_region.getHasCode());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasCode tag ");
		}
		return SKIP_BODY;
	}
}

