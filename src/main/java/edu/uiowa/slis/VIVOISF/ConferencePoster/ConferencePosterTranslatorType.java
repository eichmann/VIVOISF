package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterTranslatorIterator theConferencePosterTranslatorIterator = (ConferencePosterTranslatorIterator)findAncestorWithClass(this, ConferencePosterTranslatorIterator.class);
			pageContext.getOut().print(theConferencePosterTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for translator tag ");
		}
		return SKIP_BODY;
	}
}

