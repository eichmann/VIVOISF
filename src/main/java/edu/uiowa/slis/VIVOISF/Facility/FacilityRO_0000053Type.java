package edu.uiowa.slis.VIVOISF.Facility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacilityRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacilityRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FacilityRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacilityRO_0000053Iterator theFacilityRO_0000053Iterator = (FacilityRO_0000053Iterator)findAncestorWithClass(this, FacilityRO_0000053Iterator.class);
			pageContext.getOut().print(theFacilityRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Facility for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Facility for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

