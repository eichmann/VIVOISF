package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280RO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280RO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280RO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280RO_0002353Iterator theUO_0000280RO_0002353Iterator = (UO_0000280RO_0002353Iterator)findAncestorWithClass(this, UO_0000280RO_0002353Iterator.class);
			pageContext.getOut().print(theUO_0000280RO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

