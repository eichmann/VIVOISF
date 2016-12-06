package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupDateTimeIntervalIterator thegroupDateTimeIntervalIterator = (groupDateTimeIntervalIterator)findAncestorWithClass(this, groupDateTimeIntervalIterator.class);
			pageContext.getOut().print(thegroupDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}
