package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameShortARIterator theGroup = (GroupNameShortARIterator)findAncestorWithClass(this, GroupNameShortARIterator.class);
			pageContext.getOut().print(theGroup.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

