package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(groupRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupRelatesIterator thegroupRelatesIterator = (groupRelatesIterator)findAncestorWithClass(this, groupRelatesIterator.class);
			pageContext.getOut().print(thegroupRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing group for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for relates tag ");
		}
		return SKIP_BODY;
	}
}

