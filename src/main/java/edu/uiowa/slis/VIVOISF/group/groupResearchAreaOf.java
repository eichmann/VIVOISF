package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(groupResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupResearchAreaOfIterator thegroupResearchAreaOfIterator = (groupResearchAreaOfIterator)findAncestorWithClass(this, groupResearchAreaOfIterator.class);
			pageContext.getOut().print(thegroupResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing group for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

