package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupHasResearchAreaIterator thegroupHasResearchAreaIterator = (groupHasResearchAreaIterator)findAncestorWithClass(this, groupHasResearchAreaIterator.class);
			pageContext.getOut().print(thegroupHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

