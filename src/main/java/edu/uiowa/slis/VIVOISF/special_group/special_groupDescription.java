package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupDescriptionIterator thespecial_group = (special_groupDescriptionIterator)findAncestorWithClass(this, special_groupDescriptionIterator.class);
			pageContext.getOut().print(thespecial_group.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for description tag ");
		}
		return SKIP_BODY;
	}
}

