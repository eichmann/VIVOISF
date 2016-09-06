package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Quote theQuote = (Quote)findAncestorWithClass(this, Quote.class);
			if (!theQuote.commitNeeded) {
				pageContext.getOut().print(theQuote.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Quote theQuote = (Quote)findAncestorWithClass(this, Quote.class);
			return theQuote.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Quote for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Quote theQuote = (Quote)findAncestorWithClass(this, Quote.class);
			theQuote.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for label tag ");
		}
	}
}

