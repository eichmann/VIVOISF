package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(areaBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaBFO_0000051Iterator theareaBFO_0000051Iterator = (areaBFO_0000051Iterator)findAncestorWithClass(this, areaBFO_0000051Iterator.class);
			pageContext.getOut().print(theareaBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing area for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

