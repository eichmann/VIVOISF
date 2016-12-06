package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasEmailIterator theeconomic_regionHasEmailIterator = (economic_regionHasEmailIterator)findAncestorWithClass(this, economic_regionHasEmailIterator.class);
			pageContext.getOut().print(theeconomic_regionHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

