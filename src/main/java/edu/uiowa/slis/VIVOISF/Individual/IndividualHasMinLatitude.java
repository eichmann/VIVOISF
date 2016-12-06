package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualHasMinLatitudeIterator theIndividual = (IndividualHasMinLatitudeIterator)findAncestorWithClass(this, IndividualHasMinLatitudeIterator.class);
			pageContext.getOut().print(theIndividual.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

