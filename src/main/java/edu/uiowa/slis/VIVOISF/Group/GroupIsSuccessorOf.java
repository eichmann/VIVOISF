package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupIsSuccessorOfIterator theGroupIsSuccessorOfIterator = (GroupIsSuccessorOfIterator)findAncestorWithClass(this, GroupIsSuccessorOfIterator.class);
			pageContext.getOut().print(theGroupIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

