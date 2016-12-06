package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280HasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280HasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280HasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280HasURLIterator theUO_0000280HasURLIterator = (UO_0000280HasURLIterator)findAncestorWithClass(this, UO_0000280HasURLIterator.class);
			pageContext.getOut().print(theUO_0000280HasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

