package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(groupDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupDateTimeIntervalIterator thegroupDateTimeIntervalIterator = (groupDateTimeIntervalIterator)findAncestorWithClass(this, groupDateTimeIntervalIterator.class);
			pageContext.getOut().print(thegroupDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing group for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

