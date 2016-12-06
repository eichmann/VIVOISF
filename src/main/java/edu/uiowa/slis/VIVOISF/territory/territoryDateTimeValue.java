package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryDateTimeValueIterator theterritoryDateTimeValueIterator = (territoryDateTimeValueIterator)findAncestorWithClass(this, territoryDateTimeValueIterator.class);
			pageContext.getOut().print(theterritoryDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

