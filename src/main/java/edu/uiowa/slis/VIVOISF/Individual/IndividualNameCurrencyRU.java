package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameCurrencyRUIterator theIndividual = (IndividualNameCurrencyRUIterator)findAncestorWithClass(this, IndividualNameCurrencyRUIterator.class);
			pageContext.getOut().print(theIndividual.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

