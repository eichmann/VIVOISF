package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualHDIYearIterator theIndividual = (IndividualHDIYearIterator)findAncestorWithClass(this, IndividualHDIYearIterator.class);
			pageContext.getOut().print(theIndividual.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

