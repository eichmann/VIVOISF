package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameShortITIterator theGroup = (GroupNameShortITIterator)findAncestorWithClass(this, GroupNameShortITIterator.class);
			pageContext.getOut().print(theGroup.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

