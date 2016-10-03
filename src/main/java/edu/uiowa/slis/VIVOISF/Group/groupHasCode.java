package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasCode currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupHasCodeIterator thegroup = (groupHasCodeIterator)findAncestorWithClass(this, groupHasCodeIterator.class);
			pageContext.getOut().print(thegroup.getHasCode());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasCode tag ");
		}
		return SKIP_BODY;
	}
}

