package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractHasTranslationIterator theAbstractHasTranslationIterator = (AbstractHasTranslationIterator)findAncestorWithClass(this, AbstractHasTranslationIterator.class);
			pageContext.getOut().print(theAbstractHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

