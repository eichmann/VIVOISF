package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryResearchAreaOfIterator theterritoryResearchAreaOfIterator = (territoryResearchAreaOfIterator)findAncestorWithClass(this, territoryResearchAreaOfIterator.class);
			pageContext.getOut().print(theterritoryResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

