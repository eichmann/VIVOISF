package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefRO_0000056Iterator theBriefRO_0000056Iterator = (BriefRO_0000056Iterator)findAncestorWithClass(this, BriefRO_0000056Iterator.class);
			pageContext.getOut().print(theBriefRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

