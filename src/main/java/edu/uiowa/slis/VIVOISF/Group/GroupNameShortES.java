package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameShortESIterator theGroup = (GroupNameShortESIterator)findAncestorWithClass(this, GroupNameShortESIterator.class);
			pageContext.getOut().print(theGroup.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

