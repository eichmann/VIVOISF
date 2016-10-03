package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumDistributorIterator theErratumDistributorIterator = (ErratumDistributorIterator)findAncestorWithClass(this, ErratumDistributorIterator.class);
			pageContext.getOut().print(theErratumDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for distributor tag ");
		}
		return SKIP_BODY;
	}
}

