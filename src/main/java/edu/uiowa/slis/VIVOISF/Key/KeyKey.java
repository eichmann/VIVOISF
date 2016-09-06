package edu.uiowa.slis.VIVOISF.Key;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyKey extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KeyKey currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyKey.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KeyKeyIterator theKey = (KeyKeyIterator)findAncestorWithClass(this, KeyKeyIterator.class);
			pageContext.getOut().print(theKey.getKey());
		} catch (Exception e) {
			log.error("Can't find enclosing Key for key tag ", e);
			throw new JspTagException("Error: Can't find enclosing Key for key tag ");
		}
		return SKIP_BODY;
	}
}

