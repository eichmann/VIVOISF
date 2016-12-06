package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryDateTimeIntervalIterator theterritoryDateTimeIntervalIterator = (territoryDateTimeIntervalIterator)findAncestorWithClass(this, territoryDateTimeIntervalIterator.class);
			pageContext.getOut().print(theterritoryDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

