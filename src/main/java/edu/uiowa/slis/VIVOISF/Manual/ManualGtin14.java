package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualGtin14Iterator theManual = (ManualGtin14Iterator)findAncestorWithClass(this, ManualGtin14Iterator.class);
			pageContext.getOut().print(theManual.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

