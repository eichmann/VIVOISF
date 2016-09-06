package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractTranslatorIterator theAbstractTranslatorIterator = (AbstractTranslatorIterator)findAncestorWithClass(this, AbstractTranslatorIterator.class);
			pageContext.getOut().print(theAbstractTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for translator tag ");
		}
		return SKIP_BODY;
	}
}

