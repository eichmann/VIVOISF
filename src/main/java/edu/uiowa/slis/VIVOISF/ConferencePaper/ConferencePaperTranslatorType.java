package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperTranslatorIterator theConferencePaperTranslatorIterator = (ConferencePaperTranslatorIterator)findAncestorWithClass(this, ConferencePaperTranslatorIterator.class);
			pageContext.getOut().print(theConferencePaperTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for translator tag ");
		}
		return SKIP_BODY;
	}
}

