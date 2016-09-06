package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteTranslatorIterator theStatuteTranslatorIterator = (StatuteTranslatorIterator)findAncestorWithClass(this, StatuteTranslatorIterator.class);
			pageContext.getOut().print(theStatuteTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for translator tag ");
		}
		return SKIP_BODY;
	}
}

