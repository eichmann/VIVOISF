package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionRO_0002234Iterator theeconomic_regionRO_0002234Iterator = (economic_regionRO_0002234Iterator)findAncestorWithClass(this, economic_regionRO_0002234Iterator.class);
			pageContext.getOut().print(theeconomic_regionRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

