package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasListName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasListName currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasListName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupHasListNameIterator thespecial_group = (special_groupHasListNameIterator)findAncestorWithClass(this, special_groupHasListNameIterator.class);
			pageContext.getOut().print(thespecial_group.getHasListName());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasListName tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasListName tag ");
		}
		return SKIP_BODY;
	}
}

