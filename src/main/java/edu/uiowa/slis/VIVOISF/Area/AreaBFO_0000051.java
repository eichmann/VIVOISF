package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AreaBFO_0000051Iterator theAreaBFO_0000051Iterator = (AreaBFO_0000051Iterator)findAncestorWithClass(this, AreaBFO_0000051Iterator.class);
			pageContext.getOut().print(theAreaBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

