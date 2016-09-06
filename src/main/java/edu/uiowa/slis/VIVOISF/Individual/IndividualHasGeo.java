package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasGeo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasGeoIterator theIndividualHasGeoIterator = (IndividualHasGeoIterator)findAncestorWithClass(this, IndividualHasGeoIterator.class);
			pageContext.getOut().print(theIndividualHasGeoIterator.getHasGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

