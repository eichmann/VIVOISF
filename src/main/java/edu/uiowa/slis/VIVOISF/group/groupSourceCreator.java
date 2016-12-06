package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupSourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupSourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(groupSourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupSourceCreatorIterator thegroup = (groupSourceCreatorIterator)findAncestorWithClass(this, groupSourceCreatorIterator.class);
			pageContext.getOut().print(thegroup.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing group for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

