package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsTranslationOfIterator theProceedingsTranslationOfIterator = (ProceedingsTranslationOfIterator)findAncestorWithClass(this, ProceedingsTranslationOfIterator.class);
			pageContext.getOut().print(theProceedingsTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

