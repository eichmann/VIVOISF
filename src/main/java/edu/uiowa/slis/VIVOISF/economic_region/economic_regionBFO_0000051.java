package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionBFO_0000051Iterator theeconomic_regionBFO_0000051Iterator = (economic_regionBFO_0000051Iterator)findAncestorWithClass(this, economic_regionBFO_0000051Iterator.class);
			pageContext.getOut().print(theeconomic_regionBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

