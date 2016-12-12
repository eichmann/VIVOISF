package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameListESIterator theGroup = (GroupNameListESIterator)findAncestorWithClass(this, GroupNameListESIterator.class);
			pageContext.getOut().print(theGroup.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

