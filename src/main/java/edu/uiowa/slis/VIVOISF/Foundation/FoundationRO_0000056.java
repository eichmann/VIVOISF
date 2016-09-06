package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationRO_0000056Iterator theFoundationRO_0000056Iterator = (FoundationRO_0000056Iterator)findAncestorWithClass(this, FoundationRO_0000056Iterator.class);
			pageContext.getOut().print(theFoundationRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

