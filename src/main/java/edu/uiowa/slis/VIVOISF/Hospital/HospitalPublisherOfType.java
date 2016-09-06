package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalPublisherOfIterator theHospitalPublisherOfIterator = (HospitalPublisherOfIterator)findAncestorWithClass(this, HospitalPublisherOfIterator.class);
			pageContext.getOut().print(theHospitalPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

