package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionBFO_0000050Iterator theeconomic_regionBFO_0000050Iterator = (economic_regionBFO_0000050Iterator)findAncestorWithClass(this, economic_regionBFO_0000050Iterator.class);
			pageContext.getOut().print(theeconomic_regionBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

