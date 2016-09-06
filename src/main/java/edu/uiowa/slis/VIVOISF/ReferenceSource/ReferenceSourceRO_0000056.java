package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceRO_0000056Iterator theReferenceSourceRO_0000056Iterator = (ReferenceSourceRO_0000056Iterator)findAncestorWithClass(this, ReferenceSourceRO_0000056Iterator.class);
			pageContext.getOut().print(theReferenceSourceRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

