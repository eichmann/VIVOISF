package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsTranslatorIterator theProceedingsTranslatorIterator = (ProceedingsTranslatorIterator)findAncestorWithClass(this, ProceedingsTranslatorIterator.class);
			pageContext.getOut().print(theProceedingsTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for translator tag ");
		}
		return SKIP_BODY;
	}
}

