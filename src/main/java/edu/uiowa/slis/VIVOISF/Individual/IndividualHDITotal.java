package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualHDITotalIterator theIndividual = (IndividualHDITotalIterator)findAncestorWithClass(this, IndividualHDITotalIterator.class);
			pageContext.getOut().print(theIndividual.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

