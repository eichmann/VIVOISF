package edu.uiowa.slis.VIVOISF.BFO_0000034;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000034RO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000034RO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000034RO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000034RO_0000052Iterator theBFO_0000034RO_0000052Iterator = (BFO_0000034RO_0000052Iterator)findAncestorWithClass(this, BFO_0000034RO_0000052Iterator.class);
			pageContext.getOut().print(theBFO_0000034RO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000034 for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000034 for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

