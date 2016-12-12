package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupSourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupSourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupSourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupSourceModifiedIterator theGroup = (GroupSourceModifiedIterator)findAncestorWithClass(this, GroupSourceModifiedIterator.class);
			pageContext.getOut().print(theGroup.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

