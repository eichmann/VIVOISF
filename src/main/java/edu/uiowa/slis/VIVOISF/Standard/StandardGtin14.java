package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardGtin14Iterator theStandard = (StandardGtin14Iterator)findAncestorWithClass(this, StandardGtin14Iterator.class);
			pageContext.getOut().print(theStandard.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

