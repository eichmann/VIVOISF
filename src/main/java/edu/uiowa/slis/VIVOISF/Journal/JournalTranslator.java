package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalTranslatorIterator theJournalTranslatorIterator = (JournalTranslatorIterator)findAncestorWithClass(this, JournalTranslatorIterator.class);
			pageContext.getOut().print(theJournalTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for translator tag ");
		}
		return SKIP_BODY;
	}
}

