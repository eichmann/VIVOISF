package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationReproducedInIterator theTranslationReproducedInIterator = (TranslationReproducedInIterator)findAncestorWithClass(this, TranslationReproducedInIterator.class);
			pageContext.getOut().print(theTranslationReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

