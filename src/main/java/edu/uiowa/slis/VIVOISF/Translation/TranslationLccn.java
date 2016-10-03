package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationLccnIterator theTranslation = (TranslationLccnIterator)findAncestorWithClass(this, TranslationLccnIterator.class);
			pageContext.getOut().print(theTranslation.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for lccn tag ");
		}
		return SKIP_BODY;
	}
}

