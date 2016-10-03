package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIssuerIterator theJournalIssuerIterator = (JournalIssuerIterator)findAncestorWithClass(this, JournalIssuerIterator.class);
			pageContext.getOut().print(theJournalIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for issuer tag ");
		}
		return SKIP_BODY;
	}
}

