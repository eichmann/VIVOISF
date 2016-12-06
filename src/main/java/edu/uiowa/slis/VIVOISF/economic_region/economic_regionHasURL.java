package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasURLIterator theeconomic_regionHasURLIterator = (economic_regionHasURLIterator)findAncestorWithClass(this, economic_regionHasURLIterator.class);
			pageContext.getOut().print(theeconomic_regionHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

