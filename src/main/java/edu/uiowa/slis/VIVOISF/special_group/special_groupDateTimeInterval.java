package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupDateTimeIntervalIterator thespecial_groupDateTimeIntervalIterator = (special_groupDateTimeIntervalIterator)findAncestorWithClass(this, special_groupDateTimeIntervalIterator.class);
			pageContext.getOut().print(thespecial_groupDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

