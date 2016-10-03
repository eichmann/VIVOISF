package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefDistributorIterator theBriefDistributorIterator = (BriefDistributorIterator)findAncestorWithClass(this, BriefDistributorIterator.class);
			pageContext.getOut().print(theBriefDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for distributor tag ");
		}
		return SKIP_BODY;
	}
}

