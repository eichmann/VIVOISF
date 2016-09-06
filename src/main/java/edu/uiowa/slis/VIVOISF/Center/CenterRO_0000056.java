package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterRO_0000056Iterator theCenterRO_0000056Iterator = (CenterRO_0000056Iterator)findAncestorWithClass(this, CenterRO_0000056Iterator.class);
			pageContext.getOut().print(theCenterRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

