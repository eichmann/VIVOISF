package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Quote theQuote = (Quote)findAncestorWithClass(this, Quote.class);
			if (!theQuote.commitNeeded) {
				pageContext.getOut().print(theQuote.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Quote theQuote = (Quote)findAncestorWithClass(this, Quote.class);
			return theQuote.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Quote for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Quote theQuote = (Quote)findAncestorWithClass(this, Quote.class);
			theQuote.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for subjectURI tag ");
		}
	}
}

