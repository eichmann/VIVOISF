package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupSourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupSourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupSourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupSourceCreatorIterator theGroup = (GroupSourceCreatorIterator)findAncestorWithClass(this, GroupSourceCreatorIterator.class);
			pageContext.getOut().print(theGroup.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

