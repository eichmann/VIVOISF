package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualLandAreaYearIterator theIndividual = (IndividualLandAreaYearIterator)findAncestorWithClass(this, IndividualLandAreaYearIterator.class);
			pageContext.getOut().print(theIndividual.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

