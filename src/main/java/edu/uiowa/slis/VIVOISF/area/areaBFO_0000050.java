package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(areaBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaBFO_0000050Iterator theareaBFO_0000050Iterator = (areaBFO_0000050Iterator)findAncestorWithClass(this, areaBFO_0000050Iterator.class);
			pageContext.getOut().print(theareaBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing area for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

