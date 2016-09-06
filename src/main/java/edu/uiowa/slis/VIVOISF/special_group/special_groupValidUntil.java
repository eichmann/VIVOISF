package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupValidUntilIterator thespecial_group = (special_groupValidUntilIterator)findAncestorWithClass(this, special_groupValidUntilIterator.class);
			pageContext.getOut().print(thespecial_group.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

