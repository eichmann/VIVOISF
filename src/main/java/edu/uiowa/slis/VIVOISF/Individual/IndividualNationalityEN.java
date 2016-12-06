package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNationalityENIterator theIndividual = (IndividualNationalityENIterator)findAncestorWithClass(this, IndividualNationalityENIterator.class);
			pageContext.getOut().print(theIndividual.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

