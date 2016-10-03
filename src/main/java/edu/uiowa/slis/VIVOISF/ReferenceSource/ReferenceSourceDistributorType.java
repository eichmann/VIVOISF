package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceDistributorIterator theReferenceSourceDistributorIterator = (ReferenceSourceDistributorIterator)findAncestorWithClass(this, ReferenceSourceDistributorIterator.class);
			pageContext.getOut().print(theReferenceSourceDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for distributor tag ");
		}
		return SKIP_BODY;
	}
}

