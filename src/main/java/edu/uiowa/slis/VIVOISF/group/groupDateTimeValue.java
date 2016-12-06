package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(groupDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupDateTimeValueIterator thegroupDateTimeValueIterator = (groupDateTimeValueIterator)findAncestorWithClass(this, groupDateTimeValueIterator.class);
			pageContext.getOut().print(thegroupDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing group for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

