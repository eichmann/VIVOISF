package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(KindTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindTranslatorIterator theKindTranslatorIterator = (KindTranslatorIterator)findAncestorWithClass(this, KindTranslatorIterator.class);
			pageContext.getOut().print(theKindTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for translator tag ");
		}
		return SKIP_BODY;
	}
}

