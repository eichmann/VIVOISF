package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalSponsorsIterator theHospitalSponsorsIterator = (HospitalSponsorsIterator)findAncestorWithClass(this, HospitalSponsorsIterator.class);
			pageContext.getOut().print(theHospitalSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

