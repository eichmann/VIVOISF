package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasListName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasListName currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasListName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasListNameIterator theeconomic_region = (economic_regionHasListNameIterator)findAncestorWithClass(this, economic_regionHasListNameIterator.class);
			pageContext.getOut().print(theeconomic_region.getHasListName());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasListName tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasListName tag ");
		}
		return SKIP_BODY;
	}
}

