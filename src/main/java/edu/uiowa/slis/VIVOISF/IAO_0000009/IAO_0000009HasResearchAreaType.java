package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009HasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009HasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009HasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009HasResearchAreaIterator theIAO_0000009HasResearchAreaIterator = (IAO_0000009HasResearchAreaIterator)findAncestorWithClass(this, IAO_0000009HasResearchAreaIterator.class);
			pageContext.getOut().print(theIAO_0000009HasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

