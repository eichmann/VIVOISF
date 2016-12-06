package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003HasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003HasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003HasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003HasResearchAreaIterator theIAO_0000003HasResearchAreaIterator = (IAO_0000003HasResearchAreaIterator)findAncestorWithClass(this, IAO_0000003HasResearchAreaIterator.class);
			pageContext.getOut().print(theIAO_0000003HasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

