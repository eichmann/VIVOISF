package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupHasURLIterator thegroupHasURLIterator = (groupHasURLIterator)findAncestorWithClass(this, groupHasURLIterator.class);
			pageContext.getOut().print(thegroupHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

