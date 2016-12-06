package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualHasMaxLongitudeIterator theIndividual = (IndividualHasMaxLongitudeIterator)findAncestorWithClass(this, IndividualHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theIndividual.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

