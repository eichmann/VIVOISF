package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationEanucc13Iterator theTranslation = (TranslationEanucc13Iterator)findAncestorWithClass(this, TranslationEanucc13Iterator.class);
			pageContext.getOut().print(theTranslation.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

