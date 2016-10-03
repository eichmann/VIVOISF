package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardDistributorIterator theStandardDistributorIterator = (StandardDistributorIterator)findAncestorWithClass(this, StandardDistributorIterator.class);
			pageContext.getOut().print(theStandardDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for distributor tag ");
		}
		return SKIP_BODY;
	}
}

