package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835RO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835RO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835RO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835RO_0000056Iterator theOBI_0000835RO_0000056Iterator = (OBI_0000835RO_0000056Iterator)findAncestorWithClass(this, OBI_0000835RO_0000056Iterator.class);
			pageContext.getOut().print(theOBI_0000835RO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

