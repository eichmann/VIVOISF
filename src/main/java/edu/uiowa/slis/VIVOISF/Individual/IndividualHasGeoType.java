package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasGeoType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasGeoType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasGeoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasGeoIterator theIndividualHasGeoIterator = (IndividualHasGeoIterator)findAncestorWithClass(this, IndividualHasGeoIterator.class);
			pageContext.getOut().print(theIndividualHasGeoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

