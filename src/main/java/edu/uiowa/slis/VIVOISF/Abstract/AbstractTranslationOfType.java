package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractTranslationOfIterator theAbstractTranslationOfIterator = (AbstractTranslationOfIterator)findAncestorWithClass(this, AbstractTranslationOfIterator.class);
			pageContext.getOut().print(theAbstractTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

