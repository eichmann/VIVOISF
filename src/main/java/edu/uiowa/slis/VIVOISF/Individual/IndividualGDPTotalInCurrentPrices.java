package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualGDPTotalInCurrentPricesIterator theIndividual = (IndividualGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, IndividualGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theIndividual.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

