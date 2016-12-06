package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupHasNameIterator thegroupHasNameIterator = (groupHasNameIterator)findAncestorWithClass(this, groupHasNameIterator.class);
			pageContext.getOut().print(thegroupHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasName tag ");
		}
		return SKIP_BODY;
	}
}

