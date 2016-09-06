package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptTranslationOfIterator theManuscriptTranslationOfIterator = (ManuscriptTranslationOfIterator)findAncestorWithClass(this, ManuscriptTranslationOfIterator.class);
			pageContext.getOut().print(theManuscriptTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

