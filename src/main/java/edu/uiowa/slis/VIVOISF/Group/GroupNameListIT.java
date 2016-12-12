package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameListITIterator theGroup = (GroupNameListITIterator)findAncestorWithClass(this, GroupNameListITIterator.class);
			pageContext.getOut().print(theGroup.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

