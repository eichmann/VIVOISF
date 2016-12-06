package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameCurrencyENIterator theIndividual = (IndividualNameCurrencyENIterator)findAncestorWithClass(this, IndividualNameCurrencyENIterator.class);
			pageContext.getOut().print(theIndividual.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

