package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseNarrower extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseNarrower currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseNarrower.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseNarrowerIterator theLicenseNarrowerIterator = (LicenseNarrowerIterator)findAncestorWithClass(this, LicenseNarrowerIterator.class);
			pageContext.getOut().print(theLicenseNarrowerIterator.getNarrower());
		} catch (Exception e) {
			log.error("Can't find enclosing License for narrower tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for narrower tag ");
		}
		return SKIP_BODY;
	}
}

