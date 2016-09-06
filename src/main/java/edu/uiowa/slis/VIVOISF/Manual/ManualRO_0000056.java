package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualRO_0000056Iterator theManualRO_0000056Iterator = (ManualRO_0000056Iterator)findAncestorWithClass(this, ManualRO_0000056Iterator.class);
			pageContext.getOut().print(theManualRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

