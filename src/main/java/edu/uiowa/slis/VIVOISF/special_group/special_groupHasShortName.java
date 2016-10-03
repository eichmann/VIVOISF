package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasShortName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupHasShortNameIterator thespecial_group = (special_groupHasShortNameIterator)findAncestorWithClass(this, special_groupHasShortNameIterator.class);
			pageContext.getOut().print(thespecial_group.getHasShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasShortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasShortName tag ");
		}
		return SKIP_BODY;
	}
}

