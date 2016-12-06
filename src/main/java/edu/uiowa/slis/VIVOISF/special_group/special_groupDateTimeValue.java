package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupDateTimeValueIterator thespecial_groupDateTimeValueIterator = (special_groupDateTimeValueIterator)findAncestorWithClass(this, special_groupDateTimeValueIterator.class);
			pageContext.getOut().print(thespecial_groupDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

