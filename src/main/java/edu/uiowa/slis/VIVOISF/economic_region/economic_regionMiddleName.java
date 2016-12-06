package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionMiddleNameIterator theeconomic_region = (economic_regionMiddleNameIterator)findAncestorWithClass(this, economic_regionMiddleNameIterator.class);
			pageContext.getOut().print(theeconomic_region.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for middleName tag ");
		}
		return SKIP_BODY;
	}
}

