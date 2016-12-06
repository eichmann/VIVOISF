package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameCurrencyESIterator theIndividual = (IndividualNameCurrencyESIterator)findAncestorWithClass(this, IndividualNameCurrencyESIterator.class);
			pageContext.getOut().print(theIndividual.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

