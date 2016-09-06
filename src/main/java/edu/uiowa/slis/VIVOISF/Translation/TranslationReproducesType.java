package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationReproducesIterator theTranslationReproducesIterator = (TranslationReproducesIterator)findAncestorWithClass(this, TranslationReproducesIterator.class);
			pageContext.getOut().print(theTranslationReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

