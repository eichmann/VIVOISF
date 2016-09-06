package edu.uiowa.slis.VIVOISF.ARG_2000377;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000377RO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000377RO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000377RO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000377RO_0000056Iterator theARG_2000377RO_0000056Iterator = (ARG_2000377RO_0000056Iterator)findAncestorWithClass(this, ARG_2000377RO_0000056Iterator.class);
			pageContext.getOut().print(theARG_2000377RO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000377 for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000377 for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

