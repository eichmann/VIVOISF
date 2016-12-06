package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionIAO_0000115 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionIAO_0000115 currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionIAO_0000115.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionIAO_0000115Iterator theeconomic_region = (economic_regionIAO_0000115Iterator)findAncestorWithClass(this, economic_regionIAO_0000115Iterator.class);
			pageContext.getOut().print(theeconomic_region.getIAO_0000115());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for IAO_0000115 tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for IAO_0000115 tag ");
		}
		return SKIP_BODY;
	}
}

