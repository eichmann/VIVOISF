package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceGtin14Iterator theReferenceSource = (ReferenceSourceGtin14Iterator)findAncestorWithClass(this, ReferenceSourceGtin14Iterator.class);
			pageContext.getOut().print(theReferenceSource.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}
