package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameShortFRIterator theGroup = (GroupNameShortFRIterator)findAncestorWithClass(this, GroupNameShortFRIterator.class);
			pageContext.getOut().print(theGroup.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

