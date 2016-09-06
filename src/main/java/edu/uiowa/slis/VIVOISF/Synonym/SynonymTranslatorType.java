package edu.uiowa.slis.VIVOISF.Synonym;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SynonymTranslatorIterator theSynonymTranslatorIterator = (SynonymTranslatorIterator)findAncestorWithClass(this, SynonymTranslatorIterator.class);
			pageContext.getOut().print(theSynonymTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Synonym for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for translator tag ");
		}
		return SKIP_BODY;
	}
}

