package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupHasResearchAreaIterator thegroupHasResearchAreaIterator = (groupHasResearchAreaIterator)findAncestorWithClass(this, groupHasResearchAreaIterator.class);
			pageContext.getOut().print(thegroupHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

