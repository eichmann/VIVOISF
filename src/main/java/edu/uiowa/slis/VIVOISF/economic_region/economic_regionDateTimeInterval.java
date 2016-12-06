package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionDateTimeIntervalIterator theeconomic_regionDateTimeIntervalIterator = (economic_regionDateTimeIntervalIterator)findAncestorWithClass(this, economic_regionDateTimeIntervalIterator.class);
			pageContext.getOut().print(theeconomic_regionDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

