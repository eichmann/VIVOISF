package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualGDPYearIterator theIndividual = (IndividualGDPYearIterator)findAncestorWithClass(this, IndividualGDPYearIterator.class);
			pageContext.getOut().print(theIndividual.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

