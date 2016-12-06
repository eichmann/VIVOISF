package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280BFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280BFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280BFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280BFO_0000051Iterator theUO_0000280BFO_0000051Iterator = (UO_0000280BFO_0000051Iterator)findAncestorWithClass(this, UO_0000280BFO_0000051Iterator.class);
			pageContext.getOut().print(theUO_0000280BFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

