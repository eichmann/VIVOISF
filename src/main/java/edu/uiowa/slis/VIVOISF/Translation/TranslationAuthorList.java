package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationAuthorListIterator theTranslationAuthorListIterator = (TranslationAuthorListIterator)findAncestorWithClass(this, TranslationAuthorListIterator.class);
			pageContext.getOut().print(theTranslationAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for authorList tag ");
		}
		return SKIP_BODY;
	}
}

