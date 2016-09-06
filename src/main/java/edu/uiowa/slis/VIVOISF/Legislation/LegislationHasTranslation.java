package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationHasTranslationIterator theLegislationHasTranslationIterator = (LegislationHasTranslationIterator)findAncestorWithClass(this, LegislationHasTranslationIterator.class);
			pageContext.getOut().print(theLegislationHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

