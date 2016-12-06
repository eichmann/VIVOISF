package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameShortARIterator thegroup = (groupNameShortARIterator)findAncestorWithClass(this, groupNameShortARIterator.class);
			pageContext.getOut().print(thegroup.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

