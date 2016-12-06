package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameCurrencyZHIterator theIndividual = (IndividualNameCurrencyZHIterator)findAncestorWithClass(this, IndividualNameCurrencyZHIterator.class);
			pageContext.getOut().print(theIndividual.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

