package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupRelatedByIterator theGroupRelatedByIterator = (GroupRelatedByIterator)findAncestorWithClass(this, GroupRelatedByIterator.class);
			pageContext.getOut().print(theGroupRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

