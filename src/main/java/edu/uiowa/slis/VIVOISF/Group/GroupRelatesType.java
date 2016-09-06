package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupRelatesIterator theGroupRelatesIterator = (GroupRelatesIterator)findAncestorWithClass(this, GroupRelatesIterator.class);
			pageContext.getOut().print(theGroupRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for relates tag ");
		}
		return SKIP_BODY;
	}
}

