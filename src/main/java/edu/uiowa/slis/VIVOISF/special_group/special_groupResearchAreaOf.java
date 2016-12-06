package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupResearchAreaOfIterator thespecial_groupResearchAreaOfIterator = (special_groupResearchAreaOfIterator)findAncestorWithClass(this, special_groupResearchAreaOfIterator.class);
			pageContext.getOut().print(thespecial_groupResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

