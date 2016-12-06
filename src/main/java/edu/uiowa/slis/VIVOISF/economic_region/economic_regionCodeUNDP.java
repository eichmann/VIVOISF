package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCodeUNDPIterator theeconomic_region = (economic_regionCodeUNDPIterator)findAncestorWithClass(this, economic_regionCodeUNDPIterator.class);
			pageContext.getOut().print(theeconomic_region.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

