package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualDistributorIterator theManualDistributorIterator = (ManualDistributorIterator)findAncestorWithClass(this, ManualDistributorIterator.class);
			pageContext.getOut().print(theManualDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for distributor tag ");
		}
		return SKIP_BODY;
	}
}

