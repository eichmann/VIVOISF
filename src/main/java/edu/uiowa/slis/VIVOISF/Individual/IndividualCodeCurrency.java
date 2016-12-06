package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCodeCurrencyIterator theIndividual = (IndividualCodeCurrencyIterator)findAncestorWithClass(this, IndividualCodeCurrencyIterator.class);
			pageContext.getOut().print(theIndividual.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

