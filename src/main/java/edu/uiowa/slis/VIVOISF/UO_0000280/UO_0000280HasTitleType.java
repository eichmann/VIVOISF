package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280HasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280HasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280HasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280HasTitleIterator theUO_0000280HasTitleIterator = (UO_0000280HasTitleIterator)findAncestorWithClass(this, UO_0000280HasTitleIterator.class);
			pageContext.getOut().print(theUO_0000280HasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

