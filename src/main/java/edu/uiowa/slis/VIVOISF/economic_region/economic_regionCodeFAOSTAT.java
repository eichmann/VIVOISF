package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCodeFAOSTATIterator theeconomic_region = (economic_regionCodeFAOSTATIterator)findAncestorWithClass(this, economic_regionCodeFAOSTATIterator.class);
			pageContext.getOut().print(theeconomic_region.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

