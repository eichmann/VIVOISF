package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCodeISO2Iterator theeconomic_region = (economic_regionCodeISO2Iterator)findAncestorWithClass(this, economic_regionCodeISO2Iterator.class);
			pageContext.getOut().print(theeconomic_region.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

