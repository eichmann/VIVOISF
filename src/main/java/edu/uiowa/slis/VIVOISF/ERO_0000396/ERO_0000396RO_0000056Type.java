package edu.uiowa.slis.VIVOISF.ERO_0000396;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000396RO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000396RO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000396RO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000396RO_0000056Iterator theERO_0000396RO_0000056Iterator = (ERO_0000396RO_0000056Iterator)findAncestorWithClass(this, ERO_0000396RO_0000056Iterator.class);
			pageContext.getOut().print(theERO_0000396RO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000396 for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000396 for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

