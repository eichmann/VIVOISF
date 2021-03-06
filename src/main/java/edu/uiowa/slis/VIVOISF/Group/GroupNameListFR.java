package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameListFRIterator theGroup = (GroupNameListFRIterator)findAncestorWithClass(this, GroupNameListFRIterator.class);
			pageContext.getOut().print(theGroup.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

