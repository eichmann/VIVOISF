package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayTranslatorIterator theScreenplayTranslatorIterator = (ScreenplayTranslatorIterator)findAncestorWithClass(this, ScreenplayTranslatorIterator.class);
			pageContext.getOut().print(theScreenplayTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for translator tag ");
		}
		return SKIP_BODY;
	}
}

