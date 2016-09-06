package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupRelatesIterator theGroupRelatesIterator = (GroupRelatesIterator)findAncestorWithClass(this, GroupRelatesIterator.class);
			pageContext.getOut().print(theGroupRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for relates tag ");
		}
		return SKIP_BODY;
	}
}

