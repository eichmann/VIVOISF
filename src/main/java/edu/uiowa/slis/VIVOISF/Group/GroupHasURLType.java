package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupHasURLIterator theGroupHasURLIterator = (GroupHasURLIterator)findAncestorWithClass(this, GroupHasURLIterator.class);
			pageContext.getOut().print(theGroupHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

