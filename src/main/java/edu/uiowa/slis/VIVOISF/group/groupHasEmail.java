package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupHasEmailIterator thegroupHasEmailIterator = (groupHasEmailIterator)findAncestorWithClass(this, groupHasEmailIterator.class);
			pageContext.getOut().print(thegroupHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

