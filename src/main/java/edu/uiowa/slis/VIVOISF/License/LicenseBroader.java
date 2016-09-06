package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseBroader extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseBroader currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseBroader.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseBroaderIterator theLicenseBroaderIterator = (LicenseBroaderIterator)findAncestorWithClass(this, LicenseBroaderIterator.class);
			pageContext.getOut().print(theLicenseBroaderIterator.getBroader());
		} catch (Exception e) {
			log.error("Can't find enclosing License for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for broader tag ");
		}
		return SKIP_BODY;
	}
}

