package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationOclcnumIterator theTranslation = (TranslationOclcnumIterator)findAncestorWithClass(this, TranslationOclcnumIterator.class);
			pageContext.getOut().print(theTranslation.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

