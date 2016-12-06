package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280RO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280RO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280RO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280RO_0002234Iterator theUO_0000280RO_0002234Iterator = (UO_0000280RO_0002234Iterator)findAncestorWithClass(this, UO_0000280RO_0002234Iterator.class);
			pageContext.getOut().print(theUO_0000280RO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

