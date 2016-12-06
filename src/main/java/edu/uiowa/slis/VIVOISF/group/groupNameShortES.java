package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameShortESIterator thegroup = (groupNameShortESIterator)findAncestorWithClass(this, groupNameShortESIterator.class);
			pageContext.getOut().print(thegroup.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}
