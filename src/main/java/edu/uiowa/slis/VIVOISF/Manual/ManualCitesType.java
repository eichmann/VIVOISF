package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualCitesIterator theManualCitesIterator = (ManualCitesIterator)findAncestorWithClass(this, ManualCitesIterator.class);
			pageContext.getOut().print(theManualCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for cites tag ");
		}
		return SKIP_BODY;
	}
}

