package edu.uiowa.slis.VIVOISF.Licensure;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicensureRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicensureRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(LicensureRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicensureRO_0000056Iterator theLicensureRO_0000056Iterator = (LicensureRO_0000056Iterator)findAncestorWithClass(this, LicensureRO_0000056Iterator.class);
			pageContext.getOut().print(theLicensureRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Licensure for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Licensure for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

