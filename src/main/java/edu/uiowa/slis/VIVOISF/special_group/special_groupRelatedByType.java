package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupRelatedByIterator thespecial_groupRelatedByIterator = (special_groupRelatedByIterator)findAncestorWithClass(this, special_groupRelatedByIterator.class);
			pageContext.getOut().print(thespecial_groupRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

