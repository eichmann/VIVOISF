package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitRO_0000056Iterator theExtensionUnitRO_0000056Iterator = (ExtensionUnitRO_0000056Iterator)findAncestorWithClass(this, ExtensionUnitRO_0000056Iterator.class);
			pageContext.getOut().print(theExtensionUnitRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

