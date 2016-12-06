package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualGDPUnitIterator theIndividual = (IndividualGDPUnitIterator)findAncestorWithClass(this, IndividualGDPUnitIterator.class);
			pageContext.getOut().print(theIndividual.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

