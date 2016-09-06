package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupHasEmailIterator theGroupHasEmailIterator = (GroupHasEmailIterator)findAncestorWithClass(this, GroupHasEmailIterator.class);
			pageContext.getOut().print(theGroupHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

