package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationARG_0000001Iterator theTranslation = (TranslationARG_0000001Iterator)findAncestorWithClass(this, TranslationARG_0000001Iterator.class);
			pageContext.getOut().print(theTranslation.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

