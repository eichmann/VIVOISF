package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterRO_0000056Iterator theLetterRO_0000056Iterator = (LetterRO_0000056Iterator)findAncestorWithClass(this, LetterRO_0000056Iterator.class);
			pageContext.getOut().print(theLetterRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

