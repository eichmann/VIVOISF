package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupValidSinceIterator thespecial_group = (special_groupValidSinceIterator)findAncestorWithClass(this, special_groupValidSinceIterator.class);
			pageContext.getOut().print(thespecial_group.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for validSince tag ");
		}
		return SKIP_BODY;
	}
}

