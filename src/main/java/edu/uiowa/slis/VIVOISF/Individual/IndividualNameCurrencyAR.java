package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameCurrencyARIterator theIndividual = (IndividualNameCurrencyARIterator)findAncestorWithClass(this, IndividualNameCurrencyARIterator.class);
			pageContext.getOut().print(theIndividual.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

