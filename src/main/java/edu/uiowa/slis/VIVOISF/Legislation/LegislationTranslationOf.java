package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationTranslationOfIterator theLegislationTranslationOfIterator = (LegislationTranslationOfIterator)findAncestorWithClass(this, LegislationTranslationOfIterator.class);
			pageContext.getOut().print(theLegislationTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

