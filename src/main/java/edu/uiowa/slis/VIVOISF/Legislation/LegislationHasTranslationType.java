package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationHasTranslationIterator theLegislationHasTranslationIterator = (LegislationHasTranslationIterator)findAncestorWithClass(this, LegislationHasTranslationIterator.class);
			pageContext.getOut().print(theLegislationHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

