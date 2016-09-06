package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteTranslatorIterator theStatuteTranslatorIterator = (StatuteTranslatorIterator)findAncestorWithClass(this, StatuteTranslatorIterator.class);
			pageContext.getOut().print(theStatuteTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for translator tag ");
		}
		return SKIP_BODY;
	}
}

