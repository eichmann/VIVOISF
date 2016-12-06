package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280RO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280RO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280RO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280RO_0001025Iterator theUO_0000280RO_0001025Iterator = (UO_0000280RO_0001025Iterator)findAncestorWithClass(this, UO_0000280RO_0001025Iterator.class);
			pageContext.getOut().print(theUO_0000280RO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

