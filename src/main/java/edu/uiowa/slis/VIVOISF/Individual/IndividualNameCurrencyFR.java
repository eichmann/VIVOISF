package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameCurrencyFRIterator theIndividual = (IndividualNameCurrencyFRIterator)findAncestorWithClass(this, IndividualNameCurrencyFRIterator.class);
			pageContext.getOut().print(theIndividual.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

