package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameListARIterator theGroup = (GroupNameListARIterator)findAncestorWithClass(this, GroupNameListARIterator.class);
			pageContext.getOut().print(theGroup.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

