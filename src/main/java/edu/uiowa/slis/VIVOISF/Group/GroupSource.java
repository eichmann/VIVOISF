package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupSource currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupSourceIterator theGroup = (GroupSourceIterator)findAncestorWithClass(this, GroupSourceIterator.class);
			pageContext.getOut().print(theGroup.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for source tag ");
		}
		return SKIP_BODY;
	}
}

