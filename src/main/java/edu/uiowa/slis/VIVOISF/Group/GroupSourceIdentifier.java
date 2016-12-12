package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupSourceIdentifierIterator theGroup = (GroupSourceIdentifierIterator)findAncestorWithClass(this, GroupSourceIdentifierIterator.class);
			pageContext.getOut().print(theGroup.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

