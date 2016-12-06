package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupDateTimeValueIterator thespecial_groupDateTimeValueIterator = (special_groupDateTimeValueIterator)findAncestorWithClass(this, special_groupDateTimeValueIterator.class);
			pageContext.getOut().print(thespecial_groupDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

