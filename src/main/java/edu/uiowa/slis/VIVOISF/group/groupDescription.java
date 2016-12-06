package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(groupDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupDescriptionIterator thegroup = (groupDescriptionIterator)findAncestorWithClass(this, groupDescriptionIterator.class);
			pageContext.getOut().print(thegroup.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing group for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for description tag ");
		}
		return SKIP_BODY;
	}
}

