package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupIAO_0000115 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupIAO_0000115 currentInstance = null;
	private static final Log log = LogFactory.getLog(groupIAO_0000115.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupIAO_0000115Iterator thegroup = (groupIAO_0000115Iterator)findAncestorWithClass(this, groupIAO_0000115Iterator.class);
			pageContext.getOut().print(thegroup.getIAO_0000115());
		} catch (Exception e) {
			log.error("Can't find enclosing group for IAO_0000115 tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for IAO_0000115 tag ");
		}
		return SKIP_BODY;
	}
}

