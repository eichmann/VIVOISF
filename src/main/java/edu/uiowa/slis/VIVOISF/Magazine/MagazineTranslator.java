package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineTranslatorIterator theMagazineTranslatorIterator = (MagazineTranslatorIterator)findAncestorWithClass(this, MagazineTranslatorIterator.class);
			pageContext.getOut().print(theMagazineTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for translator tag ");
		}
		return SKIP_BODY;
	}
}

