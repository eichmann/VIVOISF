package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationTranslatorIterator theLegislationTranslatorIterator = (LegislationTranslatorIterator)findAncestorWithClass(this, LegislationTranslatorIterator.class);
			pageContext.getOut().print(theLegislationTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for translator tag ");
		}
		return SKIP_BODY;
	}
}

