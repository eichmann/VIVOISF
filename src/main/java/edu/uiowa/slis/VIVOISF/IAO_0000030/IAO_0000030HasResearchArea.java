package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030HasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030HasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030HasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030HasResearchAreaIterator theIAO_0000030HasResearchAreaIterator = (IAO_0000030HasResearchAreaIterator)findAncestorWithClass(this, IAO_0000030HasResearchAreaIterator.class);
			pageContext.getOut().print(theIAO_0000030HasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}
