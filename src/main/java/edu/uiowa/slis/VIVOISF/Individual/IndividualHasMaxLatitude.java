package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualHasMaxLatitudeIterator theIndividual = (IndividualHasMaxLatitudeIterator)findAncestorWithClass(this, IndividualHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theIndividual.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

