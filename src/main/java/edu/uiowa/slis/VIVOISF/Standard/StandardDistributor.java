package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardDistributorIterator theStandardDistributorIterator = (StandardDistributorIterator)findAncestorWithClass(this, StandardDistributorIterator.class);
			pageContext.getOut().print(theStandardDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for distributor tag ");
		}
		return SKIP_BODY;
	}
}

