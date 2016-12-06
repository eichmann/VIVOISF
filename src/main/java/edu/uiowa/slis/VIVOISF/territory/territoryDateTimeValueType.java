package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryDateTimeValueIterator theterritoryDateTimeValueIterator = (territoryDateTimeValueIterator)findAncestorWithClass(this, territoryDateTimeValueIterator.class);
			pageContext.getOut().print(theterritoryDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

