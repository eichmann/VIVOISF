package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupHasResearchAreaIterator thespecial_groupHasResearchAreaIterator = (special_groupHasResearchAreaIterator)findAncestorWithClass(this, special_groupHasResearchAreaIterator.class);
			pageContext.getOut().print(thespecial_groupHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

