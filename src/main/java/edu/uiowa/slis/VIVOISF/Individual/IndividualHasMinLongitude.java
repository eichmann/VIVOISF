package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualHasMinLongitudeIterator theIndividual = (IndividualHasMinLongitudeIterator)findAncestorWithClass(this, IndividualHasMinLongitudeIterator.class);
			pageContext.getOut().print(theIndividual.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

