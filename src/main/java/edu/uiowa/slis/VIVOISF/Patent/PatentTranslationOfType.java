package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentTranslationOfIterator thePatentTranslationOfIterator = (PatentTranslationOfIterator)findAncestorWithClass(this, PatentTranslationOfIterator.class);
			pageContext.getOut().print(thePatentTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

