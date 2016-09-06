package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationTranslatorIterator theLegislationTranslatorIterator = (LegislationTranslatorIterator)findAncestorWithClass(this, LegislationTranslatorIterator.class);
			pageContext.getOut().print(theLegislationTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for translator tag ");
		}
		return SKIP_BODY;
	}
}

