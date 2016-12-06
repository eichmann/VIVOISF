package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCodeGAULIterator theeconomic_region = (economic_regionCodeGAULIterator)findAncestorWithClass(this, economic_regionCodeGAULIterator.class);
			pageContext.getOut().print(theeconomic_region.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

