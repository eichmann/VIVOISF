package edu.uiowa.slis.VIVOISF.ERO_0000005;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000005RO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000005RO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000005RO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000005RO_0000056Iterator theERO_0000005RO_0000056Iterator = (ERO_0000005RO_0000056Iterator)findAncestorWithClass(this, ERO_0000005RO_0000056Iterator.class);
			pageContext.getOut().print(theERO_0000005RO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000005 for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000005 for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

