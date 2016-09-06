package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupTheAbstractIterator theGroup = (GroupTheAbstractIterator)findAncestorWithClass(this, GroupTheAbstractIterator.class);
			pageContext.getOut().print(theGroup.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

