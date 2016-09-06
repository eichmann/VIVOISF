package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualCitedByIterator theManualCitedByIterator = (ManualCitedByIterator)findAncestorWithClass(this, ManualCitedByIterator.class);
			pageContext.getOut().print(theManualCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

