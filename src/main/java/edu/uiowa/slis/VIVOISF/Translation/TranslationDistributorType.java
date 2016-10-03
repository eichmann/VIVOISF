package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationDistributorIterator theTranslationDistributorIterator = (TranslationDistributorIterator)findAncestorWithClass(this, TranslationDistributorIterator.class);
			pageContext.getOut().print(theTranslationDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for distributor tag ");
		}
		return SKIP_BODY;
	}
}

