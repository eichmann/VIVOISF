package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryHasResearchAreaIterator theterritoryHasResearchAreaIterator = (territoryHasResearchAreaIterator)findAncestorWithClass(this, territoryHasResearchAreaIterator.class);
			pageContext.getOut().print(theterritoryHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

