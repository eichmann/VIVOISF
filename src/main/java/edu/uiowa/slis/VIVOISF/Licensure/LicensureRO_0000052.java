package edu.uiowa.slis.VIVOISF.Licensure;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicensureRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicensureRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(LicensureRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicensureRO_0000052Iterator theLicensureRO_0000052Iterator = (LicensureRO_0000052Iterator)findAncestorWithClass(this, LicensureRO_0000052Iterator.class);
			pageContext.getOut().print(theLicensureRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing Licensure for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Licensure for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

