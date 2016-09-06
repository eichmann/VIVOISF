package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterIAO_0000136Iterator theLetterIAO_0000136Iterator = (LetterIAO_0000136Iterator)findAncestorWithClass(this, LetterIAO_0000136Iterator.class);
			pageContext.getOut().print(theLetterIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

