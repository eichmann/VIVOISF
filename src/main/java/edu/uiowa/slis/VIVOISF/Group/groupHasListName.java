package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasListName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasListName currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasListName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupHasListNameIterator thegroup = (groupHasListNameIterator)findAncestorWithClass(this, groupHasListNameIterator.class);
			pageContext.getOut().print(thegroup.getHasListName());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasListName tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasListName tag ");
		}
		return SKIP_BODY;
	}
}

