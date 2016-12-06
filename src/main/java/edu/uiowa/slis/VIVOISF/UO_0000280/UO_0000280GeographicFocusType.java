package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280GeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280GeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280GeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280GeographicFocusIterator theUO_0000280GeographicFocusIterator = (UO_0000280GeographicFocusIterator)findAncestorWithClass(this, UO_0000280GeographicFocusIterator.class);
			pageContext.getOut().print(theUO_0000280GeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

