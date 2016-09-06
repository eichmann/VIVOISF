package edu.uiowa.slis.VIVOISF.Facility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacilityFacilityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacilityFacilityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacilityFacilityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacilityFacilityForIterator theFacilityFacilityForIterator = (FacilityFacilityForIterator)findAncestorWithClass(this, FacilityFacilityForIterator.class);
			pageContext.getOut().print(theFacilityFacilityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Facility for facilityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Facility for facilityFor tag ");
		}
		return SKIP_BODY;
	}
}

