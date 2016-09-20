package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationERO_0000045Iterator theTranslation = (TranslationERO_0000045Iterator)findAncestorWithClass(this, TranslationERO_0000045Iterator.class);
			pageContext.getOut().print(theTranslation.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

