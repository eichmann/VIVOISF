package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalSponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalSponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalSponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalSponsorsIterator theHospitalSponsorsIterator = (HospitalSponsorsIterator)findAncestorWithClass(this, HospitalSponsorsIterator.class);
			pageContext.getOut().print(theHospitalSponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

