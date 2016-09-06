package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumHasTranslationIterator theErratumHasTranslationIterator = (ErratumHasTranslationIterator)findAncestorWithClass(this, ErratumHasTranslationIterator.class);
			pageContext.getOut().print(theErratumHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

