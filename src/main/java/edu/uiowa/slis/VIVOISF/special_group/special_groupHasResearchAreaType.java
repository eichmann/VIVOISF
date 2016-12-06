package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupHasResearchAreaIterator thespecial_groupHasResearchAreaIterator = (special_groupHasResearchAreaIterator)findAncestorWithClass(this, special_groupHasResearchAreaIterator.class);
			pageContext.getOut().print(thespecial_groupHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

