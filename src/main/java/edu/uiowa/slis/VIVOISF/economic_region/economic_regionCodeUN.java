package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCodeUNIterator theeconomic_region = (economic_regionCodeUNIterator)findAncestorWithClass(this, economic_regionCodeUNIterator.class);
			pageContext.getOut().print(theeconomic_region.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

