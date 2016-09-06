package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsHasTranslationIterator theProceedingsHasTranslationIterator = (ProceedingsHasTranslationIterator)findAncestorWithClass(this, ProceedingsHasTranslationIterator.class);
			pageContext.getOut().print(theProceedingsHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

